package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalExpression extends AST {
  var condition: AST = js.native
  var whenFalse: AST = js.native
  var whenTrue: AST = js.native
  def structuralEquals(ast: ConditionalExpression, includingPosition: Boolean): Boolean = js.native
}

object ConditionalExpression {
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    condition: AST,
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
    structuralEquals: (ConditionalExpression, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    whenFalse: AST,
    whenTrue: AST,
    width: () => Double
  ): ConditionalExpression = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), whenFalse = whenFalse.asInstanceOf[js.Any], whenTrue = whenTrue.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ConditionalExpression]
  }
  @scala.inline
  implicit class ConditionalExpressionOps[Self <: ConditionalExpression] (val x: Self) extends AnyVal {
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
    def setCondition(value: AST): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setStructuralEquals(value: (ConditionalExpression, Boolean) => Boolean): Self = this.set("structuralEquals", js.Any.fromFunction2(value))
    @scala.inline
    def setWhenFalse(value: AST): Self = this.set("whenFalse", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhenTrue(value: AST): Self = this.set("whenTrue", value.asInstanceOf[js.Any])
  }
  
}

