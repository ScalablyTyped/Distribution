package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParenthesizedExpression extends AST {
  var expression: AST = js.native
  var openParenTrailingComments: js.Array[Comment] = js.native
  def structuralEquals(ast: ParenthesizedExpression, includingPosition: Boolean): Boolean = js.native
}

object ParenthesizedExpression {
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    end: () => Double,
    expression: AST,
    fileName: () => String,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    openParenTrailingComments: js.Array[Comment],
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (ParenthesizedExpression, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ParenthesizedExpression = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), expression = expression.asInstanceOf[js.Any], fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), openParenTrailingComments = openParenTrailingComments.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ParenthesizedExpression]
  }
  @scala.inline
  implicit class ParenthesizedExpressionOps[Self <: ParenthesizedExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpression(value: AST): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenParenTrailingCommentsVarargs(value: Comment*): Self = this.set("openParenTrailingComments", js.Array(value :_*))
    @scala.inline
    def setOpenParenTrailingComments(value: js.Array[Comment]): Self = this.set("openParenTrailingComments", value.asInstanceOf[js.Any])
    @scala.inline
    def setStructuralEquals(value: (ParenthesizedExpression, Boolean) => Boolean): Self = this.set("structuralEquals", js.Any.fromFunction2(value))
  }
  
}

