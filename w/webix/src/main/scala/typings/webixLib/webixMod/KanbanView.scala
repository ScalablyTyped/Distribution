package typings
package webixLib.webixMod

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
  var on_context: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  @JSName("$dragCreate")
  def $dragCreate(source: stdLib.HTMLElement, event: stdLib.Event): stdLib.HTMLElement = js.native
  @JSName("$dragPos")
  def $dragPos(args: js.Any*): js.Any = js.native
  @JSName("$dropHTML")
  def $dropHTML(args: js.Any*): js.Any = js.native
  @JSName("$skin")
  def $skin(args: js.Any*): js.Any = js.native
  def eachOtherList(code: WebixCallback): scala.Unit = js.native
  def getKanban(): js.Any = js.native
  def move(sid: java.lang.String, tindex: scala.Double): java.lang.String = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any): java.lang.String = js.native
  def move(sid: java.lang.String, tindex: scala.Double, tobj: js.Any, details: js.Any): java.lang.String = js.native
}

