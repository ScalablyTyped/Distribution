package typings.stylableCore.mod

import typings.postcss.mod.Declaration
import typings.postcss.mod.Rule_
import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.stateValidatorsMod.StateResult
import typings.stylableCore.stylableMetaMod.ClassSymbol
import typings.stylableCore.stylableMetaMod.ElementSymbol
import typings.stylableCore.stylableMetaMod.StylableSymbol
import typings.stylableCore.stylableValueParsersMod.MappedStates
import typings.stylableCore.typesMod.StateParsedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "pseudoStates")
@js.native
object pseudoStates extends js.Object {
  
  val booleanStateDelimiter: /* "--" */ String = js.native
  
  def createAttributeState(stateName: String, namespace: String, param: String): String = js.native
  
  def createBooleanStateClassName(stateName: String, namespace: String): String = js.native
  
  def createStateWithParamClassName(stateName: String, namespace: String, param: String): String = js.native
  
  def processPseudoStates(value: String, decl: Declaration, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): MappedStates = js.native
  
  def resolveStateParam(param: String): String = js.native
  
  def setStateToNode(
    states: MappedStates,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    name: String,
    node: SelectorAstNode,
    namespace: String,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): Unit = js.native
  def setStateToNode(
    states: MappedStates,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    name: String,
    node: SelectorAstNode,
    namespace: String,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_
  ): Unit = js.native
  
  val stateMiddleDelimiter: /* "-" */ String = js.native
  
  val stateWithParamDelimiter: String = js.native
  
  def transformPseudoStateSelector(
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ClassSymbol,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ClassSymbol,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_
  ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ElementSymbol,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ElementSymbol,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_
  ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ClassSymbol,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ClassSymbol,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_
  ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ElementSymbol,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: typings.stylableCore.stylableProcessorMod.StylableMeta,
    originSymbol: ElementSymbol,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_
  ): typings.stylableCore.stylableProcessorMod.StylableMeta = js.native
  
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    rule: js.UndefOr[scala.Nothing],
    validateDefinition: js.UndefOr[scala.Nothing],
    validateValue: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    rule: js.UndefOr[scala.Nothing],
    validateDefinition: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    rule: js.UndefOr[scala.Nothing],
    validateDefinition: Boolean,
    validateValue: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_,
    validateDefinition: js.UndefOr[scala.Nothing],
    validateValue: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_,
    validateDefinition: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    value: String,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics,
    rule: Rule_,
    validateDefinition: Boolean,
    validateValue: Boolean
  ): StateResult = js.native
  
  def validateStateDefinition(
    decl: Declaration,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): Unit = js.native
  
  @js.native
  object stateErrors extends js.Object {
    
    def NO_STATE_TYPE_GIVEN(name: String): String = js.native
    
    def STATE_STARTS_WITH_HYPHEN(name: String): String = js.native
    
    def TOO_MANY_ARGS_IN_VALIDATOR(name: String, validator: String, args: js.Array[String]): String = js.native
    
    def TOO_MANY_STATE_TYPES(name: String, types: js.Array[String]): String = js.native
    
    def UNKNOWN_STATE_TYPE(name: String, `type`: String): String = js.native
    
    def UNKNOWN_STATE_USAGE(name: String): String = js.native
  }
}
