package typings.xhrMock

import typings.xhrMock.mockHeadersMod.MockHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/MockResponse", JSImport.Namespace)
@js.native
object mockResponseMod extends js.Object {
  @js.native
  trait MockResponse extends js.Object {
    var _body: js.Any = js.native
    var _headers: js.Any = js.native
    var _reason: js.Any = js.native
    var _status: js.Any = js.native
    def body(): js.Any = js.native
    def body(body: js.Any): MockResponse = js.native
    def header(name: String): Null | String = js.native
    def header(name: String, value: String): MockResponse = js.native
    def headers(): MockHeaders = js.native
    def headers(headers: MockHeaders): MockResponse = js.native
    def reason(): String = js.native
    def reason(reason: String): MockResponse = js.native
    def status(): Double = js.native
    def status(status: Double): MockResponse = js.native
    def statusText(): Null | String = js.native
    def statusText(reason: String): MockResponse = js.native
  }
  
  @js.native
  class default () extends MockResponse
  
}

