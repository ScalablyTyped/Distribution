package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyntaxList2 extends AST {
  var _fileName: js.Any
  var members: js.Any
  def any(func: js.Function1[/* v */ AST, Boolean]): Boolean
  def childAt(index: Double): AST
  def childCount(): Double
  def firstOrDefault(func: js.Function2[/* v */ AST, /* index */ Double, Boolean]): AST
  def lastOrDefault(func: js.Function2[/* v */ AST, /* index */ Double, Boolean]): AST
  def structuralEquals(ast: ISyntaxList2, includingPosition: Boolean): Boolean
}

object ISyntaxList2 {
  @scala.inline
  def apply(
    _astID: js.Any,
    _end: Double,
    _fileName: js.Any,
    _postComments: js.Any,
    _preComments: js.Any,
    _start: Double,
    _trailingTriviaWidth: Double,
    any: js.Function1[/* v */ AST, Boolean] => Boolean,
    childAt: Double => AST,
    childCount: () => Double,
    end: () => Double,
    fileName: () => String,
    firstOrDefault: js.Function2[/* v */ AST, /* index */ Double, Boolean] => AST,
    isExpression: () => Boolean,
    kind: () => SyntaxKind,
    lastOrDefault: js.Function2[/* v */ AST, /* index */ Double, Boolean] => AST,
    members: js.Any,
    parent: AST,
    postComments: () => js.Array[Comment],
    preComments: () => js.Array[Comment],
    setPostComments: js.Array[Comment] => Unit,
    setPreComments: js.Array[Comment] => Unit,
    start: () => Double,
    structuralEquals: (ISyntaxList2, Boolean) => Boolean,
    syntaxID: () => Double,
    trailingTriviaWidth: () => Double,
    width: () => Double
  ): ISyntaxList2 = {
    val __obj = js.Dynamic.literal(_astID = _astID.asInstanceOf[js.Any], _end = _end.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _postComments = _postComments.asInstanceOf[js.Any], _preComments = _preComments.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trailingTriviaWidth = _trailingTriviaWidth.asInstanceOf[js.Any], any = js.Any.fromFunction1(any), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), end = js.Any.fromFunction0(end), fileName = js.Any.fromFunction0(fileName), firstOrDefault = js.Any.fromFunction1(firstOrDefault), isExpression = js.Any.fromFunction0(isExpression), kind = js.Any.fromFunction0(kind), lastOrDefault = js.Any.fromFunction1(lastOrDefault), members = members.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], postComments = js.Any.fromFunction0(postComments), preComments = js.Any.fromFunction0(preComments), setPostComments = js.Any.fromFunction1(setPostComments), setPreComments = js.Any.fromFunction1(setPreComments), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals), syntaxID = js.Any.fromFunction0(syntaxID), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[ISyntaxList2]
  }
}

