package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ajax extends StObject {
  
  def bind(master: js.Any): Ajax = js.native
  
  def del(url: String): js.Promise[js.Any] = js.native
  def del(url: String, params: js.Any): js.Promise[js.Any] = js.native
  def del(url: String, params: js.Any, callback: WebixCallback): js.Promise[js.Any] = js.native
  def del(url: String, params: Unit, callback: WebixCallback): js.Promise[js.Any] = js.native
  
  def get(url: String): js.Promise[js.Any] = js.native
  def get(url: String, params: js.Any): js.Promise[js.Any] = js.native
  def get(url: String, params: js.Any, callback: WebixCallback): js.Promise[js.Any] = js.native
  def get(url: String, params: Unit, callback: WebixCallback): js.Promise[js.Any] = js.native
  
  def getXHR(): js.Any = js.native
  
  def headers(values: js.Any): Ajax = js.native
  
  var master: js.Any = js.native
  
  def post(url: String): js.Promise[js.Any] = js.native
  def post(url: String, params: js.Any): js.Promise[js.Any] = js.native
  def post(url: String, params: js.Any, callback: WebixCallback): js.Promise[js.Any] = js.native
  def post(url: String, params: Unit, callback: WebixCallback): js.Promise[js.Any] = js.native
  
  def put(url: String): js.Promise[js.Any] = js.native
  def put(url: String, params: js.Any): js.Promise[js.Any] = js.native
  def put(url: String, params: js.Any, callback: WebixCallback): js.Promise[js.Any] = js.native
  def put(url: String, params: Unit, callback: WebixCallback): js.Promise[js.Any] = js.native
  
  def response(`type`: String): Ajax = js.native
  
  def stringify(data: js.Any): String = js.native
  
  def sync(): Ajax = js.native
}
