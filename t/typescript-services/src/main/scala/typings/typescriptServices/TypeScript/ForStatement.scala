package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForStatement extends AST {
  var condition: AST = js.native
  var incrementor: AST = js.native
  var initializer: AST = js.native
  var statement: AST = js.native
  var variableDeclaration: VariableDeclaration = js.native
  def structuralEquals(ast: ForStatement, includingPosition: Boolean): Boolean = js.native
}

object ForStatement {
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
    incrementor: AST,
    initializer: AST,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    statement: AST,
    structuralEquals: (ForStatement, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    variableDeclaration: VariableDeclaration,
    width: () => Double
  ): ForStatement = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), incrementor = incrementor.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any], isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), statement = statement.asInstanceOf[js.Any], structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), variableDeclaration = variableDeclaration.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ForStatement]
  }
  @scala.inline
  implicit class ForStatementOps[Self <: ForStatement] (val x: Self) extends AnyVal {
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
    def setIncrementor(value: AST): Self = this.set("incrementor", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitializer(value: AST): Self = this.set("initializer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatement(value: AST): Self = this.set("statement", value.asInstanceOf[js.Any])
    @scala.inline
    def setStructuralEquals(value: (ForStatement, Boolean) => Boolean): Self = this.set("structuralEquals", js.Any.fromFunction2(value))
    @scala.inline
    def setVariableDeclaration(value: VariableDeclaration): Self = this.set("variableDeclaration", value.asInstanceOf[js.Any])
  }
  
}

