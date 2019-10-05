package typings.webix.webixMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseEvents extends js.Object {
  @JSName("on_click")
  var on_click_Original: WebixCallback = js.native
  var on_context: StringDictionary[js.Any] = js.native
  @JSName("on_dblclick")
  var on_dblclick_Original: WebixCallback = js.native
  @JSName("on_mouse_move")
  var on_mouse_move_Original: WebixCallback = js.native
  def on_click(args: js.Any*): js.Any = js.native
  def on_dblclick(args: js.Any*): js.Any = js.native
  def on_mouse_move(args: js.Any*): js.Any = js.native
}

@JSImport("webix", "MouseEvents")
@js.native
object MouseEvents extends TopLevel[MouseEvents]

