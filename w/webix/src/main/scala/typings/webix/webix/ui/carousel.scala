package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait carousel
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  def addView(view: obj): String | Double = js.native
  def addView(view: obj, index: Double): String | Double = js.native
  
  def adjustScroll(): Unit = js.native
  
  def attachEvent(`type`: carouselEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: carouselEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_carousel: carouselConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getActiveId(): String = js.native
  
  def getActiveIndex(): Double = js.native
  
  def getLayout(): obj = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def removeView(id: String): Unit = js.native
  def removeView(id: Double): Unit = js.native
  def removeView(id: obj): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def setActive(id: String): Unit = js.native
  
  def setActiveIndex(index: Double): Unit = js.native
  
  def showNext(): Unit = js.native
  
  def showPrev(): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
