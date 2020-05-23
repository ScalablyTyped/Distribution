package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThisExpression extends IASTToken {
  var _text: js.Any
  var _valueText: js.Any
  def structuralEquals(ast: ParenthesizedExpression, includingPosition: Boolean): Boolean
}

object ThisExpression {
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
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
  ): ThisExpression = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _text = _text.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], _valueText = _valueText.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), text = js.Any.fromFunction0(text), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), valueText = js.Any.fromFunction0(valueText), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ThisExpression]
  }
}

