package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Event_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KanbanView extends js.Object {
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  @JSName("$dropHTML")
  var $dropHTML_Original: WebixCallback = js.native
  @JSName("$skin")
  var $skin_Original: WebixCallback = js.native
  var on_context: StringDictionary[js.Any] = js.native
  @JSName("$dragCreate")
  def $dragCreate(source: HTMLElement, event: Event_): HTMLElement = js.native
  @JSName("$dragPos")
  def $dragPos(args: js.Any*): js.Any = js.native
  @JSName("$dropHTML")
  def $dropHTML(args: js.Any*): js.Any = js.native
  @JSName("$skin")
  def $skin(args: js.Any*): js.Any = js.native
  def eachOtherList(code: WebixCallback): Unit = js.native
  def getKanban(): js.Any = js.native
  def move(sid: String, tindex: Double): String = js.native
  def move(sid: String, tindex: Double, tobj: js.Any): String = js.native
  def move(sid: String, tindex: Double, tobj: js.Any, details: js.Any): String = js.native
}

@JSGlobal("webix.KanbanView")
@js.native
object KanbanView extends TopLevel[KanbanView]

