package typings.webix.webix.ui

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait template
  extends StObject
     with baseview {
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  def $tooltipOut(): Unit = js.native
  
  def attachEvent(`type`: templateEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: templateEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_template: templateConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getScrollState(): Any = js.native
  
  def getValues(): Unit = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def load(url: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def parse(data: Any, `type`: String): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def render(id: String, data: Any, `type`: String): Unit = js.native
  def render(id: Double, data: Any, `type`: String): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  def setContent(node: Any): Unit = js.native
  
  def setHTML(html: String): Unit = js.native
  
  def setValues(obj: Any): Unit = js.native
  def setValues(obj: Any, update: Boolean): Unit = js.native
  
  def sync(source: Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
