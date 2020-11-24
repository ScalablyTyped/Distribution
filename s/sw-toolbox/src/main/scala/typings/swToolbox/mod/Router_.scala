package typings.swToolbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router_ extends js.Object {
  
  def any(urlPattern: URLPattern, handler: Handler): Unit = js.native
  def any(urlPattern: URLPattern, handler: Handler, options: Options_): Unit = js.native
  
  def default(handler: Handler): Unit = js.native
  def default(handler: Handler, options: Options_): Unit = js.native
  
  def delete(urlPattern: URLPattern, handler: Handler): Unit = js.native
  def delete(urlPattern: URLPattern, handler: Handler, options: Options_): Unit = js.native
  
  def get(urlPattern: URLPattern, handler: Handler): Unit = js.native
  def get(urlPattern: URLPattern, handler: Handler, options: Options_): Unit = js.native
  
  def head(urlPattern: URLPattern, handler: Handler): Unit = js.native
  def head(urlPattern: URLPattern, handler: Handler, options: Options_): Unit = js.native
  
  def post(urlPattern: URLPattern, handler: Handler): Unit = js.native
  def post(urlPattern: URLPattern, handler: Handler, options: Options_): Unit = js.native
  
  def put(urlPattern: URLPattern, handler: Handler): Unit = js.native
  def put(urlPattern: URLPattern, handler: Handler, options: Options_): Unit = js.native
}
