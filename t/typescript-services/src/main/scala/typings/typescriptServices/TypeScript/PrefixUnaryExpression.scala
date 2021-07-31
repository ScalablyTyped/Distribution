package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixUnaryExpression
  extends StObject
     with AST {
  
  var _nodeType: js.Any
  
  var operand: AST
  
  def structuralEquals(ast: PrefixUnaryExpression, includingPosition: Boolean): Boolean
}
object PrefixUnaryExpression {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _nodeType: js.Any,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: () => Double,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    operand: AST,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (PrefixUnaryExpression, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): PrefixUnaryExpression = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _nodeType = _nodeType.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), operand = operand.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[PrefixUnaryExpression]
  }
  
  @scala.inline
  implicit class PrefixUnaryExpressionMutableBuilder[Self <: PrefixUnaryExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperand(value: AST): Self = StObject.set(x, "operand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuralEquals(value: (PrefixUnaryExpression, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_nodeType(value: js.Any): Self = StObject.set(x, "_nodeType", value.asInstanceOf[js.Any])
  }
}
