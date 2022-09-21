package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverTypes.mod.InlineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InlineValueEvaluatableExpression {
  
  @JSImport("vscode-languageclient", "InlineValueEvaluatableExpression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new InlineValueEvaluatableExpression literal.
    */
  inline def create(range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.InlineValueEvaluatableExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.InlineValueEvaluatableExpression]
  inline def create(range: typings.vscodeLanguageserverTypes.mod.Range, expression: String): typings.vscodeLanguageserverTypes.mod.InlineValueEvaluatableExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.InlineValueEvaluatableExpression]
  
  inline def is(): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueEvaluatableExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueEvaluatableExpression */ Boolean]
  inline def is(value: InlineValue): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueEvaluatableExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueEvaluatableExpression */ Boolean]
}
