package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Comment")
@js.native
class Comment protected () extends js.Object {
  def this(_trivia: ISyntaxTrivia, endsLine: Boolean, _start: Double, _end: Double) = this()
  var _end: Double = js.native
  var _start: Double = js.native
  var _trivia: js.Any = js.native
  var endsLine: Boolean = js.native
  def end(): Double = js.native
  def fullText(): String = js.native
  def kind(): SyntaxKind = js.native
  def start(): Double = js.native
  def structuralEquals(ast: Comment, includingPosition: Boolean): Boolean = js.native
}

