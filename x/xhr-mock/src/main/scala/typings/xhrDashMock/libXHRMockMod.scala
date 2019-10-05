package typings.xhrDashMock

import typings.std.RegExp
import typings.xhrDashMock.libTypesMod.ErrorCallbackEvent
import typings.xhrDashMock.libTypesMod.Mock
import typings.xhrDashMock.libTypesMod.MockFunction
import typings.xhrDashMock.libXHRMockMod.XHRMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/XHRMock", JSImport.Namespace)
@js.native
object libXHRMockMod extends js.Object {
  @js.native
  class XHRMock () extends js.Object {
    var RealXMLHttpRequest: Anon_XMLHttpRequest = js.native
    def delete(url: String, mock: Mock): XHRMock = js.native
    def delete(url: RegExp, mock: Mock): XHRMock = js.native
    def error(callback: js.Function1[/* event */ ErrorCallbackEvent, Unit]): XHRMock = js.native
    def get(url: String, mock: Mock): XHRMock = js.native
    def get(url: RegExp, mock: Mock): XHRMock = js.native
    def mock(fn: MockFunction): XHRMock = js.native
    def mock(method: String, url: String, mock: Mock): XHRMock = js.native
    def mock(method: String, url: RegExp, mock: Mock): XHRMock = js.native
    def patch(url: String, mock: Mock): XHRMock = js.native
    def patch(url: RegExp, mock: Mock): XHRMock = js.native
    def post(url: String, mock: Mock): XHRMock = js.native
    def post(url: RegExp, mock: Mock): XHRMock = js.native
    def put(url: String, mock: Mock): XHRMock = js.native
    def put(url: RegExp, mock: Mock): XHRMock = js.native
    def reset(): XHRMock = js.native
    def setup(): XHRMock = js.native
    def teardown(): XHRMock = js.native
    def use(fn: MockFunction): XHRMock = js.native
    def use(method: String, url: String, mock: Mock): XHRMock = js.native
    def use(method: String, url: RegExp, mock: Mock): XHRMock = js.native
  }
  
  val default: XHRMock = js.native
}

