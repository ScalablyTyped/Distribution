package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralExpression
  extends StObject
     with AST {
  
  var _nodeType: js.Any
  
  var _text: js.Any
  
  var _valueText: js.Any
  
  def structuralEquals(ast: ParenthesizedExpression, includingPosition: Boolean): Boolean
  
  def text(): String
  
  def valueText(): String
}
object LiteralExpression {
  
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _nodeType: js.Any,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _text: js.Any,
    _trailingTriviaWidth: Double,
    _valueText: js.Any,
    end: () => Double,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (ParenthesizedExpression, Boolean) => Boolean,
    syntaxID: () => Double,
    text: () => String,
    trailingTriviaWidth: () => Double,
    valueText: () => String,
    width: () => Double
  ): LiteralExpression = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _nodeType = _nodeType.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _text = _text.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], _valueText = _valueText.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), text = js.Any.fromFunction0(text), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[LiteralExpression]
  }
  
  @scala.inline
  implicit class LiteralExpressionMutableBuilder[Self <: LiteralExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStructuralEquals(value: (ParenthesizedExpression, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    @scala.inline
    def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueText(value: () => String): Self = StObject.set(x, "valueText", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_nodeType(value: js.Any): Self = StObject.set(x, "_nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_text(value: js.Any): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueText(value: js.Any): Self = StObject.set(x, "_valueText", value.asInstanceOf[js.Any])
  }
}
