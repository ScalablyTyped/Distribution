package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Comment")
@js.native
class Comment protected () extends js.Object {
  def this(_trivia: ISyntaxTrivia, endsLine: scala.Boolean, _start: scala.Double, _end: scala.Double) = this()
  var _end: scala.Double = js.native
  var _start: scala.Double = js.native
  var _trivia: js.Any = js.native
  var endsLine: scala.Boolean = js.native
  def end(): scala.Double = js.native
  def fullText(): java.lang.String = js.native
  def kind(): SyntaxKind = js.native
  def start(): scala.Double = js.native
  def structuralEquals(ast: Comment, includingPosition: scala.Boolean): scala.Boolean = js.native
}

