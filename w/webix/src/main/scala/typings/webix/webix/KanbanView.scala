package typings.webix.webix

import typings.std.Event
import typings.std.HTMLElement
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
  
  def getKanban(): obj = js.native
  
  def move(sid: String, tindex: Double): String = js.native
  def move(sid: String, tindex: Double, tobj: Unit, details: obj): String = js.native
  def move(sid: String, tindex: Double, tobj: obj): String = js.native
  def move(sid: String, tindex: Double, tobj: obj, details: obj): String = js.native
  
  var on_context: obj = js.native
}
