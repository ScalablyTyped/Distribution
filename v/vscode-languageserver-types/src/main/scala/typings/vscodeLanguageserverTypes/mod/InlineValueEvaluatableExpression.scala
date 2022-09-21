package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineValueEvaluatableExpression
  extends StObject
     with InlineValue {
  
  /**
    * If specified the expression overrides the extracted expression.
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * The document range for which the inline value applies.
    * The range is used to extract the evaluatable expression from the underlying document.
    */
  var range: Range
}
object InlineValueEvaluatableExpression {
  
  inline def apply(range: Range): InlineValueEvaluatableExpression = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineValueEvaluatableExpression]
  }
  
  @JSImport("vscode-languageserver-types", "InlineValueEvaluatableExpression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new InlineValueEvaluatableExpression literal.
    */
  inline def create(range: Range): InlineValueEvaluatableExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any]).asInstanceOf[InlineValueEvaluatableExpression]
  inline def create(range: Range, expression: String): InlineValueEvaluatableExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[InlineValueEvaluatableExpression]
  
  inline def is(): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueEvaluatableExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueEvaluatableExpression */ Boolean]
  inline def is(value: InlineValue): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueEvaluatableExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueEvaluatableExpression */ Boolean]
  
  extension [Self <: InlineValueEvaluatableExpression](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
