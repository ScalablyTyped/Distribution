package typings.sucrase

import typings.sucrase.distTypesParserTokenizerKeywordsMod.ContextualKeyword
import typings.sucrase.distTypesParserTraverserExpressionMod.StopState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesParserPluginsTypescriptMod {
  
  @JSImport("sucrase/dist/types/parser/plugins/typescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tsAfterParseClassSuper(hasSuper: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsAfterParseClassSuper")(hasSuper.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def tsAfterParseVarHead(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsAfterParseVarHead")().asInstanceOf[Unit]
  
  inline def tsIsDeclarationStart(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tsIsDeclarationStart")().asInstanceOf[Boolean]
  
  inline def tsParseArrow(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseArrow")().asInstanceOf[Boolean]
  
  inline def tsParseAssignableListItemTypes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseAssignableListItemTypes")().asInstanceOf[Unit]
  
  inline def tsParseExportDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseExportDeclaration")().asInstanceOf[Unit]
  
  inline def tsParseExportSpecifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseExportSpecifier")().asInstanceOf[Unit]
  
  inline def tsParseFunctionBodyAndFinish(functionStart: Double, funcContextId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tsParseFunctionBodyAndFinish")(functionStart.asInstanceOf[js.Any], funcContextId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tsParseIdentifierStatement(contextualKeyword: ContextualKeyword): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseIdentifierStatement")(contextualKeyword.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def tsParseImportEqualsDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseImportEqualsDeclaration")().asInstanceOf[Unit]
  
  inline def tsParseImportSpecifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseImportSpecifier")().asInstanceOf[Unit]
  
  inline def tsParseMaybeAssign(noIn: Boolean, isWithinParens: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("tsParseMaybeAssign")(noIn.asInstanceOf[js.Any], isWithinParens.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def tsParseMaybeAssignWithJSX(noIn: Boolean, isWithinParens: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("tsParseMaybeAssignWithJSX")(noIn.asInstanceOf[js.Any], isWithinParens.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def tsParseMaybeAssignWithoutJSX(noIn: Boolean, isWithinParens: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("tsParseMaybeAssignWithoutJSX")(noIn.asInstanceOf[js.Any], isWithinParens.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def tsParseMaybeDecoratorArguments(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseMaybeDecoratorArguments")().asInstanceOf[Unit]
  
  inline def tsParseModifier(allowedModifiers: js.Array[ContextualKeyword]): ContextualKeyword | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseModifier")(allowedModifiers.asInstanceOf[js.Any]).asInstanceOf[ContextualKeyword | Null]
  
  inline def tsParseModifiers(allowedModifiers: js.Array[ContextualKeyword]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseModifiers")(allowedModifiers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def tsParseNonConditionalType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseNonConditionalType")().asInstanceOf[Unit]
  
  inline def tsParseSubscript(startTokenIndex: Double, noCalls: Boolean, stopState: StopState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("tsParseSubscript")(startTokenIndex.asInstanceOf[js.Any], noCalls.asInstanceOf[js.Any], stopState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tsParseType(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseType")().asInstanceOf[Unit]
  
  inline def tsParseTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseTypeAnnotation")().asInstanceOf[Unit]
  
  inline def tsParseTypeAssertion(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsParseTypeAssertion")().asInstanceOf[Unit]
  
  inline def tsStartParseAsyncArrowFromCallExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsStartParseAsyncArrowFromCallExpression")().asInstanceOf[Unit]
  
  inline def tsStartParseFunctionParams(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsStartParseFunctionParams")().asInstanceOf[Unit]
  
  inline def tsStartParseObjPropValue(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsStartParseObjPropValue")().asInstanceOf[Unit]
  
  inline def tsTryParseClassMemberWithIsStatic(isStatic: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTryParseClassMemberWithIsStatic")(isStatic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def tsTryParseExport(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTryParseExport")().asInstanceOf[Boolean]
  
  inline def tsTryParseExportDefaultExpression(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTryParseExportDefaultExpression")().asInstanceOf[Boolean]
  
  inline def tsTryParseJSXTypeArgument(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTryParseJSXTypeArgument")().asInstanceOf[Unit]
  
  inline def tsTryParseStatementContent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTryParseStatementContent")().asInstanceOf[Boolean]
  
  inline def tsTryParseTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTryParseTypeAnnotation")().asInstanceOf[Unit]
  
  inline def tsTryParseTypeParameters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tsTryParseTypeParameters")().asInstanceOf[Unit]
}
