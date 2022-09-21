package typings.webix.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.HTMLElement
import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KanbanView extends StObject {
  
  @JSName("$dragCreate")
  def $dragCreate(source: HTMLElement, event: Event): HTMLElement = js.native
  
  @JSName("$dragPos")
  def $dragPos(args: Any*): Any = js.native
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  
  @JSName("$dropHTML")
  def $dropHTML(args: Any*): Any = js.native
  @JSName("$dropHTML")
  var $dropHTML_Original: WebixCallback = js.native
  
  @JSName("$skin")
  def $skin(args: Any*): Any = js.native
  @JSName("$skin")
  var $skin_Original: WebixCallback = js.native
  
  def eachOtherList(code: WebixCallback): Unit = js.native
  
  def getKanban(): Any = js.native
  
  def move(sid: String, tindex: Double): String = js.native
  def move(sid: String, tindex: Double, tobj: Any): String = js.native
  def move(sid: String, tindex: Double, tobj: Any, details: Any): String = js.native
  def move(sid: String, tindex: Double, tobj: Unit, details: Any): String = js.native
  
  var on_context: StringDictionary[Any] = js.native
}
object KanbanView {
  
  inline def apply: KanbanView = ^.asInstanceOf[js.Dynamic].selectDynamic("KanbanView").asInstanceOf[KanbanView]
}
