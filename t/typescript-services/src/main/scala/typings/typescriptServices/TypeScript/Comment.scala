package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var _end: Double
  var _start: Double
  var _trivia: js.Any
  var endsLine: Boolean
  def end(): Double
  def fullText(): String
  def kind(): SyntaxKind
  def start(): Double
  def structuralEquals(ast: Comment, includingPosition: Boolean): Boolean
}

object Comment {
  @scala.inline
  def apply(
    _end: Double,
    _start: Double,
    _trivia: js.Any,
    end: () => Double,
    endsLine: Boolean,
    fullText: () => String,
    kind: () => SyntaxKind,
    start: () => Double,
    structuralEquals: (Comment, Boolean) => Boolean
  ): Comment = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], _trivia = _trivia.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), endsLine = endsLine.asInstanceOf[js.Any], fullText = js.Any.fromFunction0(fullText), kind = js.Any.fromFunction0(kind), start = js.Any.fromFunction0(start), structuralEquals = js.Any.fromFunction2(structuralEquals))
    __obj.asInstanceOf[Comment]
  }
}

