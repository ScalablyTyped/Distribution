package typings.xhrMock

import typings.xhrMock.typesMod.MockFunction
import typings.xhrMock.typesMod.MockObject
import typings.xhrMock.xhrmockMod.XHRMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MockRequest ()
    extends typings.xhrMock.mockRequestMod.MockRequest
  
  @js.native
  class MockResponse ()
    extends typings.xhrMock.mockResponseMod.MockResponse
  
  val default: XHRMock = js.native
  def delay(mock: MockFunction): MockFunction = js.native
  def delay(mock: MockFunction, ms: Double): MockFunction = js.native
  def delay(mock: MockObject): MockFunction = js.native
  def delay(mock: MockObject, ms: Double): MockFunction = js.native
  def once(mock: MockFunction): MockFunction = js.native
  def once(mock: MockObject): MockFunction = js.native
  def proxy(req: typings.xhrMock.mockRequestMod.default, res: typings.xhrMock.mockResponseMod.default): js.Promise[typings.xhrMock.mockResponseMod.default] = js.native
  def sequence(mocks: js.Array[MockFunction | MockObject]): MockFunction = js.native
}

