package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericLiteral
  extends StObject
     with IASTToken {
  
  /* private */ var _text: js.Any
  
  /* private */ var _value: js.Any
  
  /* private */ var _valueText: js.Any
  
  def structuralEquals(ast: NumericLiteral, includingPosition: Boolean): Boolean
  
  def value(): js.Any
}
object NumericLiteral {
  
  inline def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _text: js.Any,
    _trailingTriviaWidth: Double,
    _value: js.Any,
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
    structuralEquals: (NumericLiteral, Boolean) => Boolean,
    syntaxID: () => Double,
    text: () => String,
    trailingTriviaWidth: () => Double,
    value: () => js.Any,
    valueText: () => String,
    width: () => Double
  ): NumericLiteral = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _text = _text.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], _value = _value.asInstanceOf[js.Any], _valueText = _valueText.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), text = js.Any.fromFunction0(text), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), value = js.Any.fromFunction0(value), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[NumericLiteral]
  }
  
  extension [Self <: NumericLiteral](x: Self) {
    
    inline def setStructuralEquals(value: (NumericLiteral, Boolean) => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction2(value))
    
    inline def setValue(value: () => js.Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    
    inline def set_text(value: js.Any): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_value(value: js.Any): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueText(value: js.Any): Self = StObject.set(x, "_valueText", value.asInstanceOf[js.Any])
  }
}
