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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pseudoStatesMod {
  
  @JSImport("@stylable/core/cjs/pseudo-states", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stylable/core/cjs/pseudo-states", "booleanStateDelimiter")
  @js.native
  val booleanStateDelimiter: /* "--" */ String = js.native
  
  inline def createAttributeState(stateName: String, namespace: String, param: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createAttributeState")(stateName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createBooleanStateClassName(stateName: String, namespace: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createBooleanStateClassName")(stateName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createStateWithParamClassName(stateName: String, namespace: String, param: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createStateWithParamClassName")(stateName.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def processPseudoStates(value: String, decl: Declaration, diagnostics: Diagnostics): MappedStates = (^.asInstanceOf[js.Dynamic].applyDynamic("processPseudoStates")(value.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[MappedStates]
  
  inline def resolveStateParam(param: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveStateParam")(param.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setStateToNode(
    states: MappedStates,
    meta: StylableMeta,
    name: String,
    node: SelectorAstNode,
    namespace: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStateToNode")(states.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setStateToNode(
    states: MappedStates,
    meta: StylableMeta,
    name: String,
    node: SelectorAstNode,
    namespace: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStateToNode")(states.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], name.asInstanceOf[js.Any], node.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object stateErrors {
    
    @JSImport("@stylable/core/cjs/pseudo-states", "stateErrors")
    @js.native
    val ^ : js.Any = js.native
    
    inline def NO_STATE_TYPE_GIVEN(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("NO_STATE_TYPE_GIVEN")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def STATE_STARTS_WITH_HYPHEN(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("STATE_STARTS_WITH_HYPHEN")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def TOO_MANY_ARGS_IN_VALIDATOR(name: String, validator: String, args: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("TOO_MANY_ARGS_IN_VALIDATOR")(name.asInstanceOf[js.Any], validator.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def TOO_MANY_STATE_TYPES(name: String, types: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("TOO_MANY_STATE_TYPES")(name.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def UNKNOWN_STATE_TYPE(name: String, `type`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_STATE_TYPE")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def UNKNOWN_STATE_USAGE(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_STATE_USAGE")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("@stylable/core/cjs/pseudo-states", "stateMiddleDelimiter")
  @js.native
  val stateMiddleDelimiter: /* "-" */ String = js.native
  
  @JSImport("@stylable/core/cjs/pseudo-states", "stateWithParamDelimiter")
  @js.native
  val stateWithParamDelimiter: String = js.native
  
  inline def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: StylableMeta,
    originSymbol: ClassSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics
  ): StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[StylableMeta]
  inline def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: StylableMeta,
    originSymbol: ClassSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_
  ): StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[StylableMeta]
  inline def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: StylableMeta,
    originSymbol: ElementSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics
  ): StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[StylableMeta]
  inline def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: Null,
    origin: StylableMeta,
    originSymbol: ElementSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_
  ): StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[StylableMeta]
  inline def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: StylableMeta,
    originSymbol: ClassSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics
  ): StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[StylableMeta]
  inline def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: StylableMeta,
    originSymbol: ClassSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_
  ): StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[StylableMeta]
  inline def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: StylableMeta,
    originSymbol: ElementSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics
  ): StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[StylableMeta]
  inline def transformPseudoStateSelector(
    meta: StylableMeta,
    node: SelectorAstNode,
    name: String,
    symbol: StylableSymbol,
    origin: StylableMeta,
    originSymbol: ElementSymbol,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_
  ): StylableMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("transformPseudoStateSelector")(meta.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], originSymbol.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[StylableMeta]
  
  inline def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics
  ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[StateResult]
  inline def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Unit,
    validateDefinition: Boolean
  ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], validateDefinition.asInstanceOf[js.Any])).asInstanceOf[StateResult]
  inline def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Unit,
    validateDefinition: Boolean,
    validateValue: Boolean
  ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], validateDefinition.asInstanceOf[js.Any], validateValue.asInstanceOf[js.Any])).asInstanceOf[StateResult]
  inline def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Unit,
    validateDefinition: Unit,
    validateValue: Boolean
  ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], validateDefinition.asInstanceOf[js.Any], validateValue.asInstanceOf[js.Any])).asInstanceOf[StateResult]
  inline def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_
  ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[StateResult]
  inline def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_,
    validateDefinition: Boolean
  ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], validateDefinition.asInstanceOf[js.Any])).asInstanceOf[StateResult]
  inline def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_,
    validateDefinition: Boolean,
    validateValue: Boolean
  ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], validateDefinition.asInstanceOf[js.Any], validateValue.asInstanceOf[js.Any])).asInstanceOf[StateResult]
  inline def validateStateArgument(
    stateAst: StateParsedValue,
    meta: StylableMeta,
    value: String,
    resolver: StylableResolver,
    diagnostics: Diagnostics,
    rule: Rule_,
    validateDefinition: Unit,
    validateValue: Boolean
  ): StateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateArgument")(stateAst.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], value.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], validateDefinition.asInstanceOf[js.Any], validateValue.asInstanceOf[js.Any])).asInstanceOf[StateResult]
  
  inline def validateStateDefinition(decl: Declaration, meta: StylableMeta, resolver: StylableResolver, diagnostics: Diagnostics): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateStateDefinition")(decl.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
