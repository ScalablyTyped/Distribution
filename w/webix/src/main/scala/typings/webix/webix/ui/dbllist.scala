package typings.webix.webix.ui

import typings.webix.webix.WebixCallback
import typings.webix.webix.WebixProxy
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dbllist
  extends StObject
     with baseview {
  
  @JSName("$onLoad")
  def $onLoad(args: Any*): Any = js.native
  @JSName("$onLoad")
  var $onLoad_Original: WebixCallback = js.native
  
  @JSName("$$")
  var DollarDollar: obj = js.native
  
  def attachEvent(`type`: dbllistEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: dbllistEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_dbllist: dbllistConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getValue(): String = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def innerId(id: String): Double | String = js.native
  def innerId(id: Double): Double | String = js.native
  
  def load(url: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: String, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: String, `type`: Unit, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: String): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: String, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: String, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: Unit, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixCallback, `type`: Unit, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixProxy): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: String): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: String, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: String, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: String, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: Unit, callback: Unit, clear: Boolean): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  def load(url: WebixProxy, `type`: Unit, callback: WebixCallback, clear: Boolean): js.Promise[Any] = js.native
  
  def mapEvent(map: obj): Unit = js.native
  
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
  
  def select(id: String, mode: Boolean): Unit = js.native
  def select(id: js.Array[Any], mode: Boolean): Unit = js.native
  
  def setValue(ids: String): Unit = js.native
  def setValue(ids: js.Array[Any]): Unit = js.native
  
  def ui(view: obj): baseview = js.native
  
  def unblockEvent(): Unit = js.native
}
