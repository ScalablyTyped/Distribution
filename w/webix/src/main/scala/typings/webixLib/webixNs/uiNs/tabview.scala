package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.tabview")
@js.native
class tabview () extends baseview {
  @JSName("config")
  var config_tabview: tabviewConfig = js.native
  def addView(obj: js.Any): scala.Unit = js.native
  def attachEvent(`type`: tabviewEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: tabviewEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def getMultiview(): js.Any = js.native
  def getTabbar(): js.Any = js.native
  def getValue(): java.lang.String = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def removeView(id: js.Any): scala.Unit = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

