package typings.webix.webixMod.ui

import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.tabview")
@js.native
class tabview () extends baseview {
  @JSName("config")
  var config_tabview: tabviewConfig = js.native
  def addView(obj: js.Any): Unit = js.native
  def attachEvent(`type`: tabviewEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: tabviewEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def detachEvent(id: String): Unit = js.native
  def getMultiview(): js.Any = js.native
  def getTabbar(): js.Any = js.native
  def getValue(): String = js.native
  def hasEvent(name: String): Boolean = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def removeView(id: js.Any): Unit = js.native
  def setValue(value: String): Unit = js.native
  def unblockEvent(): Unit = js.native
}

