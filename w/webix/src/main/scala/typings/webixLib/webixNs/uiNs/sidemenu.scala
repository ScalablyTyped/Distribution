package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.sidemenu")
@js.native
class sidemenu () extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_sidemenu: sidemenuConfig = js.native
  def attachEvent(`type`: sidemenuEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: sidemenuEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def close(): scala.Unit = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def getBody(): js.Any = js.native
  def getHead(): js.Any = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def resizeChildren(): scala.Unit = js.native
  def setPosition(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

