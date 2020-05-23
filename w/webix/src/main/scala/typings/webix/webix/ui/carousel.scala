package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait carousel extends baseview {
  @JSName("$scope")
  var $scope: js.Any = js.native
  @JSName("config")
  var config_carousel: carouselConfig = js.native
  def addView(view: js.Any): String | Double = js.native
  def addView(view: js.Any, index: Double): String | Double = js.native
  def adjustScroll(): Unit = js.native
  def attachEvent(`type`: carouselEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: carouselEventName, functor: WebixCallback, id: String): String | Double = js.native
  def blockEvent(): Unit = js.native
  def callEvent(name: String, params: js.Array[_]): Boolean = js.native
  def detachEvent(id: String): Unit = js.native
  def getActiveId(): String = js.native
  def getActiveIndex(): Double = js.native
  def getLayout(): js.Any = js.native
  def hasEvent(name: String): Boolean = js.native
  def mapEvent(map: js.Any): Unit = js.native
  def removeView(id: js.Any): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def setActive(id: String): Unit = js.native
  def setActiveIndex(index: Double): Unit = js.native
  def showNext(): Unit = js.native
  def showPrev(): Unit = js.native
  def unblockEvent(): Unit = js.native
}

