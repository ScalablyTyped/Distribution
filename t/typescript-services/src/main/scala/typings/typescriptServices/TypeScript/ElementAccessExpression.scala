package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementAccessExpression
  extends StObject
     with AST {
  
  var argumentExpression: AST
  
  var expression: AST
  
  def structuralEquals(ast: ElementAccessExpression, includingPosition: Boolean): Boolean
}
object ElementAccessExpression {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    argumentExpression: AST,
    end: () => Double,
    expression: AST,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (ElementAccessExpression, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ElementAccessExpression = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], argumentExpression = argumentExpression.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), expression = expression.asInstanceOf[js.Any], fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ElementAccessExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementAccessExpression] (val x: Self) extends AnyVal {
    
    inline def setArgumentExpression(value: AST): Self = StObject.set(x, "argumentExpression", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: AST): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setStructuralEquals(value: (ElementAccessExpression, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
  }
}
