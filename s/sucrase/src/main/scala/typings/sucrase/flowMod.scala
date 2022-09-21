package typings.sucrase

import typings.sucrase.expressionMod.StopState
import typings.sucrase.keywordsMod.ContextualKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flowMod {
  
  @JSImport("sucrase/dist/types/parser/plugins/flow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flowAfterParseClassSuper(hasSuper: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowAfterParseClassSuper")(hasSuper.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def flowAfterParseVarHead(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowAfterParseVarHead")().asInstanceOf[Unit]
  
  inline def flowParseArrow(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("flowParseArrow")().asInstanceOf[Boolean]
  
  inline def flowParseAssignableListItemTypes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowParseAssignableListItemTypes")().asInstanceOf[Unit]
  
  inline def flowParseExportDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowParseExportDeclaration")().asInstanceOf[Unit]
  
  inline def flowParseExportStar(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowParseExportStar")().asInstanceOf[Unit]
  
  inline def flowParseFunctionBodyAndFinish(funcContextId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowParseFunctionBodyAndFinish")(funcContextId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def flowParseIdentifierStatement(contextualKeyword: ContextualKeyword): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowParseIdentifierStatement")(contextualKeyword.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def flowParseImportSpecifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowParseImportSpecifier")().asInstanceOf[Unit]
  
  inline def flowParseMaybeAssign(noIn: Boolean, isWithinParens: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("flowParseMaybeAssign")(noIn.asInstanceOf[js.Any], isWithinParens.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def flowParseSubscript(startTokenIndex: Double, noCalls: Boolean, stopState: StopState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flowParseSubscript")(startTokenIndex.asInstanceOf[js.Any], noCalls.asInstanceOf[js.Any], stopState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def flowParseSubscripts(startTokenIndex: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowParseSubscripts")(startTokenIndex.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def flowParseSubscripts(startTokenIndex: Double, noCalls: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flowParseSubscripts")(startTokenIndex.asInstanceOf[js.Any], noCalls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def flowParseTypeAnnotation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowParseTypeAnnotation")().asInstanceOf[Unit]
  
  inline def flowParseTypeParameterDeclaration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowParseTypeParameterDeclaration")().asInstanceOf[Unit]
  
  inline def flowParseVariance(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowParseVariance")().asInstanceOf[Unit]
  
  inline def flowShouldDisallowExportDefaultSpecifier(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("flowShouldDisallowExportDefaultSpecifier")().asInstanceOf[Boolean]
  
  inline def flowShouldParseExportDeclaration(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("flowShouldParseExportDeclaration")().asInstanceOf[Boolean]
  
  inline def flowShouldParseExportStar(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("flowShouldParseExportStar")().asInstanceOf[Boolean]
  
  inline def flowStartParseAsyncArrowFromCallExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowStartParseAsyncArrowFromCallExpression")().asInstanceOf[Unit]
  
  inline def flowStartParseFunctionParams(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowStartParseFunctionParams")().asInstanceOf[Unit]
  
  inline def flowStartParseImportSpecifiers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowStartParseImportSpecifiers")().asInstanceOf[Unit]
  
  inline def flowStartParseNewArguments(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowStartParseNewArguments")().asInstanceOf[Unit]
  
  inline def flowStartParseObjPropValue(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flowStartParseObjPropValue")().asInstanceOf[Unit]
  
  inline def flowTryParseExportDefaultExpression(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("flowTryParseExportDefaultExpression")().asInstanceOf[Boolean]
  
  inline def flowTryParseStatement(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("flowTryParseStatement")().asInstanceOf[Boolean]
}
