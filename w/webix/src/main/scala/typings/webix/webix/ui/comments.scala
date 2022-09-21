package typings.webix.webix.ui

import typings.webix.webix.DataCollection
import typings.webix.webix.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait comments
  extends StObject
     with baseview {
  
  @JSName("$exportView")
  def $exportView(): baseview = js.native
  
  @JSName("$onLoad")
  def $onLoad(args: Any*): Any = js.native
  @JSName("$onLoad")
  var $onLoad_Original: WebixCallback = js.native
  
  def attachEvent(`type`: commentsEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: commentsEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_comments: commentsConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def edit(id: String): Unit = js.native
  def edit(id: Double): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getMenu(): Any = js.native
  
  def getUsers(): DataCollection = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def load(url: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def parse(data: Any, `type`: String): Unit = js.native
  
  def setCurrentUser(id: String): Unit = js.native
  def setCurrentUser(id: Double): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
