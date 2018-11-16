package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.daterange")
@js.native
class daterange () extends baseview {
  @JSName("config")
  var config_daterange: daterangeConfig = js.native
  def addToRange(dates: java.lang.String): scala.Unit = js.native
  def addToRange(dates: webixLib.webixNs.Date): scala.Unit = js.native
  def attachEvent(`type`: daterangeEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: daterangeEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def getValue(): js.Any = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def setValue(range: js.Any): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

