package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.richtext")
@js.native
class richtext () extends baseview {
  @JSName("$$")
  var $$: js.Any = js.native
  @JSName("config")
  var config_richtext: richtextConfig = js.native
  def attachEvent(`type`: richtextEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: richtextEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getInputNode(): stdLib.HTMLElement = js.native
  def getValue(): java.lang.String = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def innerId(id: java.lang.String): scala.Double | java.lang.String = js.native
  def innerId(id: scala.Double): scala.Double | java.lang.String = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def setValue(value: java.lang.String): scala.Unit = js.native
  def ui(view: js.Any): baseview = js.native
  def unblockEvent(): scala.Unit = js.native
}

