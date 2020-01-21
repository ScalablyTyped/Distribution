package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ajax_ extends js.Object {
  var master: js.Any = js.native
  def bind(master: js.Any): Ajax_ = js.native
  def del(url: String): js.Promise[_] = js.native
  def del(url: String, params: js.Any): js.Promise[_] = js.native
  def del(url: String, params: js.Any, callback: WebixCallback): js.Promise[_] = js.native
  def get(url: String): js.Promise[_] = js.native
  def get(url: String, params: js.Any): js.Promise[_] = js.native
  def get(url: String, params: js.Any, callback: WebixCallback): js.Promise[_] = js.native
  def getXHR(): js.Any = js.native
  def headers(values: js.Any): Ajax_ = js.native
  def post(url: String): js.Promise[_] = js.native
  def post(url: String, params: js.Any): js.Promise[_] = js.native
  def post(url: String, params: js.Any, callback: WebixCallback): js.Promise[_] = js.native
  def put(url: String): js.Promise[_] = js.native
  def put(url: String, params: js.Any): js.Promise[_] = js.native
  def put(url: String, params: js.Any, callback: WebixCallback): js.Promise[_] = js.native
  def response(`type`: String): Ajax_ = js.native
  def stringify(data: js.Any): String = js.native
  def sync(): Ajax_ = js.native
}

