package typings.vorpal.mod

import typings.vorpal.AnonCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vorpal", "UI")
@js.native
class UI () extends js.Object {
  @JSName("redraw")
  var redraw_Original: AnonCall = js.native
  def cancel(): Unit = js.native
  def delimiter(): String = js.native
  def delimiter(text: String): String = js.native
  def imprint(): Unit = js.native
  def input(): String = js.native
  def input(text: String): String = js.native
  def redraw(text: String, texts: String*): Unit = js.native
  def submit(command: String): String = js.native
}

