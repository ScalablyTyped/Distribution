package typings.swDashToolbox.swDashToolboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  def any(urlPattern: URLPattern, handler: Handler): Unit = js.native
  def any(urlPattern: URLPattern, handler: Handler, options: Options): Unit = js.native
  def default(handler: Handler): Unit = js.native
  def default(handler: Handler, options: Options): Unit = js.native
  def delete(urlPattern: URLPattern, handler: Handler): Unit = js.native
  def delete(urlPattern: URLPattern, handler: Handler, options: Options): Unit = js.native
  def get(urlPattern: URLPattern, handler: Handler): Unit = js.native
  def get(urlPattern: URLPattern, handler: Handler, options: Options): Unit = js.native
  def head(urlPattern: URLPattern, handler: Handler): Unit = js.native
  def head(urlPattern: URLPattern, handler: Handler, options: Options): Unit = js.native
  def post(urlPattern: URLPattern, handler: Handler): Unit = js.native
  def post(urlPattern: URLPattern, handler: Handler, options: Options): Unit = js.native
  def put(urlPattern: URLPattern, handler: Handler): Unit = js.native
  def put(urlPattern: URLPattern, handler: Handler, options: Options): Unit = js.native
}

