package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.multiview")
@js.native
class multiview () extends baseview {
  @JSName("config")
  var config_multiview: multiviewConfig = js.native
  def addView(view: js.Any): java.lang.String | scala.Double = js.native
  def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: multiviewEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: multiviewEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def back(step: scala.Double): scala.Unit = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def getActiveId(): scala.Unit = js.native
  def getValue(): java.lang.String | scala.Double = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def index(obj: js.Any): scala.Double = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def reconstruct(): scala.Unit = js.native
  def removeView(id: js.Any): scala.Unit = js.native
  def resizeChildren(): scala.Unit = js.native
  def setValue(id: java.lang.String): scala.Unit = js.native
  def setValue(id: scala.Double): scala.Unit = js.native
  def showBatch(name: java.lang.String): scala.Unit = js.native
  def showBatch(name: java.lang.String, mode: scala.Boolean): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

