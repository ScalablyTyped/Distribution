package typings
package xhrDashMockLib.libMockRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockRequest extends js.Object {
  var _body: js.Any = js.native
  var _headers: js.Any = js.native
  var _method: js.Any = js.native
  var _url: js.Any = js.native
  def body(): js.Any = js.native
  def body(body: js.Any): MockRequest = js.native
  def header(name: java.lang.String): scala.Null | java.lang.String = js.native
  def header(name: java.lang.String, value: java.lang.String): MockRequest = js.native
  def headers(): xhrDashMockLib.libMockHeadersMod.MockHeaders = js.native
  def headers(headers: xhrDashMockLib.libMockHeadersMod.MockHeaders): MockRequest = js.native
  def method(): java.lang.String = js.native
  def method(method: java.lang.String): MockRequest = js.native
  def url(): xhrDashMockLib.libMockURLMod.MockURL = js.native
  def url(url: java.lang.String): MockRequest = js.native
}

