package typings.vorpal.mod

import typings.vorpal.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vorpal", "UI")
@js.native
class UI () extends js.Object {
  
  def cancel(): Unit = js.native
  
  def delimiter(): String = js.native
  def delimiter(text: String): String = js.native
  
  def imprint(): Unit = js.native
  
  def input(): String = js.native
  def input(text: String): String = js.native
  
  def redraw(text: String, texts: String*): Unit = js.native
  @JSName("redraw")
  var redraw_Original: Call = js.native
  
  def submit(command: String): String = js.native
}
