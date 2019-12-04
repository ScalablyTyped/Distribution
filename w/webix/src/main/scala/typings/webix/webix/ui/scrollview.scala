package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.scrollview")
@js.native
class scrollview () extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_scrollview: scrollviewConfig = js.native
  def attachEvent(`type`: scrollviewEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: scrollviewEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def detachEvent(id: String): Unit = js.native
  def getBody(): js.Any = js.native
  def getScrollState(): js.Any = js.native
  def hasEvent(name: String): Boolean = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def resizeChildren(): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def showView(id: String): Unit = js.native
  def showView(id: Double): Unit = js.native
  def unblockEvent(): Unit = js.native
}

