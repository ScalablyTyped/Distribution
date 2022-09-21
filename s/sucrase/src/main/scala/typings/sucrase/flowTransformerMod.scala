package typings.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowTransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/FlowTransformer", JSImport.Default)
  @js.native
  open class default protected () extends FlowTransformer {
    def this(
      rootTransformer: typings.sucrase.rootTransformerMod.default,
      tokens: typings.sucrase.tokenProcessorMod.default,
      isImportsTransformEnabled: Boolean
    ) = this()
  }
  
  @js.native
  trait FlowTransformer
    extends typings.sucrase.transformerMod.default {
    
    val isImportsTransformEnabled: Boolean = js.native
    
    /**
      * Handle a declaration like:
      * export default enum E
      *
      * With the imports transform, this becomes:
      * const E = [[enum]]; exports.default = E;
      *
      * otherwise, it becomes:
      * const E = [[enum]]; export default E;
      */
    def processDefaultExportEnum(): Unit = js.native
    
    /**
      * Transpile flow enums to invoke the "flow-enums-runtime" library.
      *
      * Currently, the transpiled code always uses `require("flow-enums-runtime")`,
      * but if future flexibility is needed, we could expose a config option for
      * this string (similar to configurable JSX). Even when targeting ESM, the
      * default behavior of babel-plugin-transform-flow-enums is to use require
      * rather than injecting an import.
      *
      * Flow enums are quite a bit simpler than TS enums and have some convenient
      * constraints:
      * - Element initializers must be either always present or always absent. That
      *   means that we can use fixed lookahead on the first element (if any) and
      *   assume that all elements are like that.
      * - The right-hand side of an element initializer must be a literal value,
      *   not a complex expression and not referencing other elements. That means
      *   we can simply copy a single token.
      *
      * Enums can be broken up into three basic cases:
      *
      * Mirrored enums:
      * enum E {A, B}
      *   ->
      * const E = require("flow-enums-runtime").Mirrored(["A", "B"]);
      *
      * Initializer enums:
      * enum E {A = 1, B = 2}
      *   ->
      * const E = require("flow-enums-runtime")({A: 1, B: 2});
      *
      * Symbol enums:
      * enum E of symbol {A, B}
      *   ->
      * const E = require("flow-enums-runtime")({A: Symbol("A"), B: Symbol("B")});
      *
      * We can statically detect which of the three cases this is by looking at the
      * "of" declaration (if any) and seeing if the first element has an initializer.
      * Since the other transform details are so similar between the three cases, we
      * use a single implementation and vary the transform within processEnumElement
      * based on case.
      */
    def processEnum(): Unit = js.native
    
    /**
      * Process an individual enum element, producing either an array element or an
      * object element based on what type of enum this is.
      */
    def processEnumElement(isSymbolEnum: Boolean, hasInitializers: Boolean): Unit = js.native
    
    /**
      * Handle a declaration like:
      * export enum E ...
      *
      * With this imports transform, this becomes:
      * const E = [[enum]]; exports.E = E;
      *
      * otherwise, it becomes:
      * export const E = [[enum]];
      */
    def processNamedExportEnum(): Unit = js.native
    
    val rootTransformer: typings.sucrase.rootTransformerMod.default = js.native
    
    val tokens: typings.sucrase.tokenProcessorMod.default = js.native
  }
}
