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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/functions", JSImport.Namespace)
@js.native
object functionsMod extends js.Object {
  
  def evalDeclarationValue(
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
  ): String = js.native
  
  def processDeclarationValue(
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
  ): OutputValue = js.native
  
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node
  ): Record[String, String] = js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.UndefOr[scala.Nothing],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.Array[String]
  ): Record[String, String] = js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: js.UndefOr[scala.Nothing],
    path: js.Array[String],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Record[String, String]
  ): Record[String, String] = js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.UndefOr[scala.Nothing],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.Array[String]
  ): Record[String, String] = js.native
  def resolveArgumentsValue(
    options: Record[String, String],
    transformer: StylableTransformer,
    meta: StylableMeta,
    diagnostics: Diagnostics,
    node: Node,
    variableOverride: Record[String, String],
    path: js.Array[String],
    cssVarsMapping: Record[String, String]
  ): Record[String, String] = js.native
  
  @js.native
  object functionWarnings extends js.Object {
    
    def CANNOT_FIND_IMPORTED_VAR(varName: String): String = js.native
    
    def CANNOT_USE_AS_VALUE(`type`: String, varName: String): String = js.native
    
    def CANNOT_USE_JS_AS_VALUE(varName: String): String = js.native
    
    def COULD_NOT_RESOLVE_VALUE(args: String): String = js.native
    
    def CYCLIC_VALUE(cyclicChain: js.Array[String]): String = js.native
    
    def FAIL_TO_EXECUTE_FORMATTER(resolvedValue: String, message: String): String = js.native
    
    def MULTI_ARGS_IN_VALUE(args: String): String = js.native
    
    def UNKNOWN_FORMATTER(name: String): String = js.native
    
    def UNKNOWN_VAR(name: String): String = js.native
  }
  
  type ResolvedFormatter = Record[String, JSResolve | CSSResolve[StylableSymbol] | ValueFormatter | Null]
  
  type ValueFormatter = js.Function1[/* name */ String, String]
}
