package typings.webix.webixMod.ui

import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.panel")
@js.native
class panel () extends baseview {
  @JSName("config")
  var config_panel: panelConfig = js.native
  @JSName("$resizeEnd")
  def $resizeEnd(pos: Double): Unit = js.native
  @JSName("$resizeMove")
  def $resizeMove(pos: Double): Unit = js.native
  def attachEvent(`type`: panelEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: panelEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def detachEvent(id: String): Unit = js.native
  def hasEvent(name: String): Boolean = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def unblockEvent(): Unit = js.native
}

