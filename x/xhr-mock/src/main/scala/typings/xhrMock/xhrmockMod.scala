package typings.xhrMock

import typings.std.RegExp
import typings.xhrMock.typesMod.ErrorCallbackEvent
import typings.xhrMock.typesMod.Mock
import typings.xhrMock.typesMod.MockFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/XHRMock", JSImport.Namespace)
@js.native
object xhrmockMod extends js.Object {
  @js.native
  class XHRMock () extends js.Object {
    var RealXMLHttpRequest: AnonInstantiable = js.native
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

