package typings.webix.webix

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ajax extends StObject {
  
  def bind(master: Any): Ajax = js.native
  
  def del(url: String): js.Promise[Any] = js.native
  def del(url: String, params: Any): js.Promise[Any] = js.native
  def del(url: String, params: Any, callback: WebixCallback): js.Promise[Any] = js.native
  def del(url: String, params: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  
  def get(url: String): js.Promise[Any] = js.native
  def get(url: String, params: Any): js.Promise[Any] = js.native
  def get(url: String, params: Any, callback: WebixCallback): js.Promise[Any] = js.native
  def get(url: String, params: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  
  def getXHR(): XMLHttpRequest = js.native
  
  def headers(values: obj): Ajax = js.native
  
  var master: obj = js.native
  
  def post(url: String): js.Promise[Any] = js.native
  def post(url: String, params: Any): js.Promise[Any] = js.native
  def post(url: String, params: Any, callback: WebixCallback): js.Promise[Any] = js.native
  def post(url: String, params: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  
  def put(url: String): js.Promise[Any] = js.native
  def put(url: String, params: Any): js.Promise[Any] = js.native
  def put(url: String, params: Any, callback: WebixCallback): js.Promise[Any] = js.native
  def put(url: String, params: Unit, callback: WebixCallback): js.Promise[Any] = js.native
  
  def response(`type`: String): Ajax = js.native
  
  def stringify(data: Any): String = js.native
  
  def sync(): Ajax = js.native
}
