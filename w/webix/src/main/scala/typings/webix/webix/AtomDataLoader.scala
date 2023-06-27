package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtomDataLoader extends StObject {
  
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
}
