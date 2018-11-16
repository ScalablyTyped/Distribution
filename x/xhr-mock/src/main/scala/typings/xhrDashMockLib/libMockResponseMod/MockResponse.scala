package typings
package xhrDashMockLib.libMockResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockResponse extends js.Object {
  var _body: js.Any = js.native
  var _headers: js.Any = js.native
  var _reason: js.Any = js.native
  var _status: js.Any = js.native
  def body(): js.Any = js.native
  def body(body: js.Any): MockResponse = js.native
  def header(name: java.lang.String): scala.Null | java.lang.String = js.native
  def header(name: java.lang.String, value: java.lang.String): MockResponse = js.native
  def headers(): xhrDashMockLib.libMockHeadersMod.MockHeaders = js.native
  def headers(headers: xhrDashMockLib.libMockHeadersMod.MockHeaders): MockResponse = js.native
  def reason(): java.lang.String = js.native
  def reason(reason: java.lang.String): MockResponse = js.native
  def status(): scala.Double = js.native
  def status(status: scala.Double): MockResponse = js.native
  def statusText(): scala.Null | java.lang.String = js.native
  def statusText(reason: java.lang.String): MockResponse = js.native
}

