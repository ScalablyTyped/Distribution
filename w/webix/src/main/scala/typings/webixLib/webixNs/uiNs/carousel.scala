package typings
package webixLib.webixNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("webix.ui.carousel")
@js.native
class carousel () extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_carousel: carouselConfig = js.native
  def addView(view: js.Any): java.lang.String | scala.Double = js.native
  def addView(view: js.Any, index: scala.Double): java.lang.String | scala.Double = js.native
  def adjustScroll(): scala.Unit = js.native
  def attachEvent(`type`: carouselEventName, functor: webixLib.webixNs.WebixCallback): java.lang.String | scala.Double = js.native
  def attachEvent(`type`: carouselEventName, functor: webixLib.webixNs.WebixCallback, id: java.lang.String): java.lang.String | scala.Double = js.native
  def blockEvent(): scala.Unit = js.native
  def callEvent(name: java.lang.String, params: js.Array[_]): scala.Boolean = js.native
  def detachEvent(id: java.lang.String): scala.Unit = js.native
  def getActiveId(): java.lang.String = js.native
  def getActiveIndex(): scala.Double = js.native
  def getLayout(): js.Any = js.native
  def hasEvent(name: java.lang.String): scala.Boolean = js.native
  def mapEvent(map: js.Any): scala.Unit = js.native
  def removeView(id: js.Any): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setActive(id: java.lang.String): scala.Unit = js.native
  def setActiveIndex(index: scala.Double): scala.Unit = js.native
  def showNext(): scala.Unit = js.native
  def showPrev(): scala.Unit = js.native
  def unblockEvent(): scala.Unit = js.native
}

