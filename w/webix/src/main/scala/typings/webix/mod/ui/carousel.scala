package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.carousel")
@js.native
class carousel ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  @JSName("$skin")
  var $skin_Original_carousel: WebixCallback = js.native
  
  def addView(view: js.Any): String | Double = js.native
  def addView(view: js.Any, index: Double): String | Double = js.native
  
  def adjustScroll(): Unit = js.native
  
  def attachEvent(`type`: carouselEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: carouselEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: js.Any, rule: WebixCallback): Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[js.Any]): Boolean = js.native
  
  @JSName("config")
  var config_carousel: carouselConfig = js.native
  
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
