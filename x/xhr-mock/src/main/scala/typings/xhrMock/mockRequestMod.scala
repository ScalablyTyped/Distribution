package typings.xhrMock

import typings.xhrMock.mockHeadersMod.MockHeaders
import typings.xhrMock.mockURLMod.MockURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/MockRequest", JSImport.Namespace)
@js.native
object mockRequestMod extends js.Object {
  @js.native
  trait MockRequest extends js.Object {
    var _body: js.Any = js.native
    var _headers: js.Any = js.native
    var _method: js.Any = js.native
    var _url: js.Any = js.native
    def body(): js.Any = js.native
    def body(body: js.Any): MockRequest = js.native
    def header(name: String): Null | String = js.native
    def header(name: String, value: String): MockRequest = js.native
    def headers(): MockHeaders = js.native
    def headers(headers: MockHeaders): MockRequest = js.native
    def method(): String = js.native
    def method(method: String): MockRequest = js.native
    def url(): MockURL = js.native
    def url(url: String): MockRequest = js.native
  }
  
  @js.native
  class default () extends MockRequest
  
}

