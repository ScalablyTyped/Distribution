package typings.webix.webixMod.ui

import typings.webix.webixMod.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "ui.layout")
@js.native
class layout ()
  extends typings.webix.webix.ui.baseview {
  @JSName("$skin")
  var $skin_Original_layout: WebixCallback = js.native
  @JSName("config")
  var config_layout: layoutConfig = js.native
  def addView(view: js.Any): String | Double = js.native
  def addView(view: js.Any, index: Double): String | Double = js.native
  def attachEvent(`type`: layoutEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: layoutEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def detachEvent(id: String): Unit = js.native
  def hasEvent(name: String): Boolean = js.native
  def index(obj: js.Any): Double = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def reconstruct(): Unit = js.native
  def removeView(id: js.Any): Unit = js.native
  def resizeChildren(): Unit = js.native
  def restore(state: js.Any, factory: WebixCallback, configOnly: Boolean): Unit = js.native
  def serialize(): js.Any = js.native
  def serialize(serializer: WebixCallback): js.Any = js.native
  def showBatch(name: String): Unit = js.native
  def showBatch(name: String, mode: Boolean): Unit = js.native
  def unblockEvent(): Unit = js.native
}

