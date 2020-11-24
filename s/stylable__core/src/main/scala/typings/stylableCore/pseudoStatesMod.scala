package typings.stylableCore

import typings.postcss.mod.Declaration
import typings.postcss.mod.Rule_
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.stateValidatorsMod.StateResult
import typings.stylableCore.stylableMetaMod.ClassSymbol
import typings.stylableCore.stylableMetaMod.ElementSymbol
import typings.stylableCore.stylableMetaMod.StylableSymbol
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableResolverMod.StylableResolver
import typings.stylableCore.stylableValueParsersMod.MappedStates
import typings.stylableCore.typesMod.StateParsedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/pseudo-states", JSImport.Namespace)
@js.native
object pseudoStatesMod extends js.Object {
  
  val booleanStateDelimiter: /* "--" */ String = js.native
  
  def createAttributeState(stateName: String, namespace: String, param: String): String = js.native
  
  def createBooleanStateClassName(stateName: String, namespace: String): String = js.native
  
  def createStateWithParamClassName(stateName: String, namespace: String, param: String): String = js.native
  
  def processPseudoStates(value: String, decl: Declaration, diagnostics: Diagnostics): MappedStates = js.native
  
  def resolveStateParam(param: String): String = js.native
  
  def setStateToNode(
    states: MappedStates,
    meta: StylableMeta,
    name: String,
    node: SelectorAstNode,
    namespace: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics
  ): Unit = js.native
  def setStateToNode(
    states: MappedStates,
    meta: StylableMeta,
    name: String,
    node: SelectorAstNode,
    namespace: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_
  ): Unit = js.native
  
  val stateMiddleDelimiter: /* "-" */ String = js.native
  
  val stateWithParamDelimiter: String = js.native
  
  def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: StylableMeta,
    originSymbol: ClassSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics
  ): StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: StylableMeta,
    originSymbol: ClassSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_
  ): StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: StylableMeta,
    originSymbol: ElementSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics
  ): StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: StylableMeta,
    originSymbol: ElementSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_
  ): StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: StylableMeta,
    originSymbol: ClassSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics
  ): StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: StylableMeta,
    originSymbol: ClassSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_
  ): StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: StylableMeta,
    originSymbol: ElementSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics
  ): StylableMeta = js.native
  def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: StylableMeta,
    originSymbol: ElementSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_
  ): StylableMeta = js.native
  
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: js.UndefOr[scala.Nothing],
    validateDefinition: js.UndefOr[scala.Nothing],
    validateValue: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: js.UndefOr[scala.Nothing],
    validateDefinition: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: js.UndefOr[scala.Nothing],
    validateDefinition: Boolean,
    validateValue: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_,
    validateDefinition: js.UndefOr[scala.Nothing],
    validateValue: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_,
    validateDefinition: Boolean
  ): StateResult = js.native
  def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_,
    validateDefinition: Boolean,
    validateValue: Boolean
  ): StateResult = js.native
  
  def validateStateDefinition(decl: Declaration, meta: StylableMeta, resolver: StylableResolver, diagnostics: Diagnostics): Unit = js.native
  
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
