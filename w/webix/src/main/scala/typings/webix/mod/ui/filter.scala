package typings.webix.mod.ui

import typings.webix.mod.WebixCallback
import typings.webix.mod.WebixProxy
import typings.webix.mod.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.filter")
@js.native
open class filter ()
  extends StObject
     with typings.webix.webix.ui.baseview {
  
  @JSName("$compareValue")
  def $compareValue(args: Any*): Any = js.native
  @JSName("$compareValue")
  var $compareValue_Original: WebixCallback = js.native
  
  @JSName("$onLoad")
  def $onLoad(args: Any*): Any = js.native
  @JSName("$onLoad")
  var $onLoad_Original: WebixCallback = js.native
  
  @JSName("$prepareValue")
  def $prepareValue(args: Any*): Any = js.native
  @JSName("$prepareValue")
  var $prepareValue_Original: WebixCallback = js.native
  
  @JSName("$setValue")
  var $setValue: Any = js.native
  
  @JSName("$skin")
  var $skin_Original_filter: WebixCallback = js.native
  
  def applyFilter(): Unit = js.native
  
  def attachEvent(`type`: filterEventName, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: filterEventName, functor: WebixCallback, id: String): String | Double = js.native
  
  def bind(target: obj, rule: WebixCallback): Unit = js.native
  def bind(target: obj, rule: WebixCallback, format: String): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  @JSName("config")
  var config_filter: filterConfig = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def getFilterFunction(): WebixCallback = js.native
  
  def getValue(): obj = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
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
  
  def queryView(config: WebixCallback): Any = js.native
  def queryView(config: WebixCallback, mode: String): Any = js.native
  
  def setValue(value: obj): Unit = js.native
  def setValue(value: obj, config: Any): Unit = js.native
  
  def unblockEvent(): Unit = js.native
}
