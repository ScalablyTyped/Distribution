package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.gridlayout")
@js.native
class gridlayout () extends baseview {
  @JSName("config")
  var config_gridlayout: gridlayoutConfig = js.native
  def addView(view: js.Any): java.lang.String | scala.Double = js.native
  def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: gridlayoutEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: gridlayoutEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def clearAll(): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def index(obj: js.Any): scala.Double = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def moveView(id: java.lang.String, view: js.Any): scala.Unit = js.native
  def moveView(id: scala.Double, view: js.Any): scala.Unit = js.native
  def reconstruct(): scala.Unit = js.native
  def removeView(id: js.Any): scala.Unit = js.native
  def resizeChildren(): scala.Unit = js.native
  def restore(state: js.Any): scala.Unit = js.native
  def restore(state: js.Any, factory: webixLib.webixNs.WebixCallback): scala.Unit = js.native
  def serialize(): js.Array[_] = js.native
  def serialize(serializer: webixLib.webixNs.WebixCallback): js.Array[_] = js.native
  def showBatch(name: java.lang.String): scala.Unit = js.native
  def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

