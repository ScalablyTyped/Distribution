package typings
package xhrDashMockLib.libXHRMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/XHRMock", "XHRMock")
@js.native
class XHRMock () extends js.Object {
  var RealXMLHttpRequest: xhrDashMockLib.Anon_XMLHttpRequest = js.native
  def delete(url: java.lang.String, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def delete(url: stdLib.RegExp, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def error(callback: js.Function1[/* event */ xhrDashMockLib.libTypesMod.ErrorCallbackEvent, scala.Unit]): XHRMock = js.native
  def get(url: java.lang.String, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def get(url: stdLib.RegExp, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def mock(fn: xhrDashMockLib.libTypesMod.MockFunction): XHRMock = js.native
  def mock(method: java.lang.String, url: java.lang.String, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def mock(method: java.lang.String, url: stdLib.RegExp, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def patch(url: java.lang.String, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def patch(url: stdLib.RegExp, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def post(url: java.lang.String, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def post(url: stdLib.RegExp, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def put(url: java.lang.String, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def put(url: stdLib.RegExp, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def reset(): XHRMock = js.native
  def setup(): XHRMock = js.native
  def teardown(): XHRMock = js.native
  def use(fn: xhrDashMockLib.libTypesMod.MockFunction): XHRMock = js.native
  def use(method: java.lang.String, url: java.lang.String, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
  def use(method: java.lang.String, url: stdLib.RegExp, mock: xhrDashMockLib.libTypesMod.Mock): XHRMock = js.native
}

