package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait pdfviewer
  extends StObject
     with baseview {
  
  @JSName("$numPages")
  var $numPages: Double = js.native
  
  @JSName("$onLoad")
  def $onLoad(args: Any*): Any = js.native
  @JSName("$onLoad")
  var $onLoad_Original: WebixCallback = js.native
  
  @JSName("$pageNum")
  var $pageNum: Double = js.native
  
  @JSName("$scope")
  var $scope: obj = js.native
  
  def attachEvent(`type`: pdfviewerEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: pdfviewerEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clear(): Unit = js.native
  
  @JSName("config")
  var config_pdfviewer: pdfviewerConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def download(): Unit = js.native
  
  def getPopup(): baseview = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def load(url: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
  def nextPage(): Unit = js.native
  
  def parse(data: String): Unit = js.native
  def parse(data: String, `type`: String): Unit = js.native
  def parse(data: String, `type`: String, clear: Boolean): Unit = js.native
  def parse(data: String, `type`: Unit, clear: Boolean): Unit = js.native
  def parse(data: js.Array[Any]): Unit = js.native
  def parse(data: js.Array[Any], `type`: String): Unit = js.native
  def parse(data: js.Array[Any], `type`: String, clear: Boolean): Unit = js.native
  def parse(data: js.Array[Any], `type`: Unit, clear: Boolean): Unit = js.native
  def parse(data: js.Promise[Any]): Unit = js.native
  def parse(data: js.Promise[Any], `type`: String): Unit = js.native
  def parse(data: js.Promise[Any], `type`: String, clear: Boolean): Unit = js.native
  def parse(data: js.Promise[Any], `type`: Unit, clear: Boolean): Unit = js.native
  def parse(data: obj): Unit = js.native
  def parse(data: obj, `type`: String): Unit = js.native
  def parse(data: obj, `type`: String, clear: Boolean): Unit = js.native
  def parse(data: obj, `type`: Unit, clear: Boolean): Unit = js.native
  
  def prevPage(): Unit = js.native
  
  def renderPage(page: Double): Unit = js.native
  
  def setScale(scale: String, update: Boolean): Unit = js.native
  def setScale(scale: Double, update: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def zoomIn(): Unit = js.native
  
  def zoomOut(): Unit = js.native
}
