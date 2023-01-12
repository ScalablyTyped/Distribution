package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInType
  extends StObject
     with IASTToken {
  
  /* private */ var _nodeType: Any
  
  /* private */ var _text: Any
  
  /* private */ var _valueText: Any
}
object BuiltInType {
  
  inline def apply(
    _astID: Any,
    _end: Double,
    _nodeType: Any,
    _postComments: Any,
    _preComments: Any,
    _start: Double,
    _text: Any,
    _trailingTriviaWidth: Double,
    _valueText: Any,
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
    structuralEquals: (AST, Boolean) => Boolean,
    syntaxID: () => Double,
    text: () => String,
    trailingTriviaWidth: () => Double,
    valueText: () => String,
    width: () => Double
  ): BuiltInType = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _nodeType = _nodeType.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _text = _text.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], _valueText = _valueText.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), text = js.Any.fromFunction0(text), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[BuiltInType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuiltInType] (val x: Self) extends AnyVal {
    
    inline def set_nodeType(value: Any): Self = StObject.set(x, "_nodeType", value.asInstanceOf[js.Any])
    
    inline def set_text(value: Any): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_valueText(value: Any): Self = StObject.set(x, "_valueText", value.asInstanceOf[js.Any])
  }
}
