package typings.stylableCore

import typings.postcss.mod.Node
import typings.std.Record
import typings.stylableCore.anon.OutputValue
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.stylableMetaMod.StylableSymbol
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableResolverMod.CSSResolve
import typings.stylableCore.stylableResolverMod.JSResolve
import typings.stylableCore.stylableResolverMod.StylableResolver
import typings.stylableCore.stylableTransformerMod.StylableTransformer
import typings.stylableCore.stylableTransformerMod.replaceValueHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("@stylable/core/cjs/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evalDeclarationValue(
    resolver: StylableResolver,
    value: String,
    meta: StylableMeta,
    node: js.UndefOr[Node],
    variableOverride: js.UndefOr[(Record[String, String]) | Null],
    valueHook: js.UndefOr[replaceValueHook],
    diagnostics: js.UndefOr[Diagnostics],
    passedThrough: js.UndefOr[js.Array[String]],
    cssVarsMapping: js.UndefOr[Record[String, String]],
    args: js.UndefOr[js.Array[String]]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("evalDeclarationValue")(resolver.asInstanceOf[js.Any], value.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], valueHook.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], passedThrough.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object functionWarnings {
    
    @JSImport("@stylable/core/cjs/functions", "functionWarnings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def CANNOT_FIND_IMPORTED_VAR(varName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_FIND_IMPORTED_VAR")(varName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def CANNOT_USE_AS_VALUE(`type`: String, varName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_USE_AS_VALUE")(`type`.asInstanceOf[js.Any], varName.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def CANNOT_USE_JS_AS_VALUE(varName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CANNOT_USE_JS_AS_VALUE")(varName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def COULD_NOT_RESOLVE_VALUE(args: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("COULD_NOT_RESOLVE_VALUE")(args.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def CYCLIC_VALUE(cyclicChain: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CYCLIC_VALUE")(cyclicChain.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def FAIL_TO_EXECUTE_FORMATTER(resolvedValue: String, message: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FAIL_TO_EXECUTE_FORMATTER")(resolvedValue.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def MULTI_ARGS_IN_VALUE(args: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MULTI_ARGS_IN_VALUE")(args.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def UNKNOWN_FORMATTER(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_FORMATTER")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def UNKNOWN_VAR(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_VAR")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def processDeclarationValue(
    resolver: StylableResolver,
    value: String,
    meta: StylableMeta,
    node: js.UndefOr[Node],
    variableOverride: js.UndefOr[(Record[String, String]) | Null],
    valueHook: js.UndefOr[replaceValueHook],
    diagnostics: js.UndefOr[Diagnostics],
    passedThrough: js.UndefOr[js.Array[String]],
    cssVarsMapping: js.UndefOr[Record[String, String]],
    args: js.UndefOr[js.Array[String]]
  ): OutputValue = (^.asInstanceOf[js.Dynamic].applyDynamic("processDeclarationValue")(resolver.asInstanceOf[js.Any], value.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], valueHook.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], passedThrough.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[OutputValue]
  
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Unit,
    path: js.Array[String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Unit,
    path: js.Array[String],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Unit,
    path: Unit,
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Record[String, String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.Array[String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.Array[String],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: Unit,
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveArgumentsValue")(options.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], node.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  
  type ResolvedFormatter = Record[String, JSResolve | CSSResolve[StylableSymbol] | ValueFormatter | Null]
  
  type ValueFormatter = js.Function1[/* name */ String, String]
}
