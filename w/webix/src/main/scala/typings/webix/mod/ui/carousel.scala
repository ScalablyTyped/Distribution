package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.carousel")
@js.native
open class carousel ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  @JSName("$skin")
  var $skin_Original_carousel: WebixCallback = js.native
  
  def addView(view: obj): String | Double = js.native
  def addView(view: obj, index: Double): String | Double = js.native
  
  def adjustScroll(): Unit = js.native
  
  def attachEvent(`type`: carouselEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: carouselEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
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
  
  def queryView(config: WebixCallback): obj | js.Array[Any] = js.native
  def queryView(config: WebixCallback, mode: String): obj | js.Array[Any] = js.native
  
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
