package typings.xhrDashMock

import typings.xhrDashMock.libTypesMod.MockFunction
import typings.xhrDashMock.libTypesMod.MockObject
import typings.xhrDashMock.libXHRMockMod.XHRMock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock", JSImport.Namespace)
@js.native
object xhrDashMockMod extends js.Object {
  @js.native
  class MockRequest ()
    extends typings.xhrDashMock.libMockRequestMod.default
  
  @js.native
  class MockResponse ()
    extends typings.xhrDashMock.libMockResponseMod.default
  
  val default: XHRMock = js.native
  def delay(mock: MockFunction): MockFunction = js.native
  def delay(mock: MockFunction, ms: Double): MockFunction = js.native
  def delay(mock: MockObject): MockFunction = js.native
  def delay(mock: MockObject, ms: Double): MockFunction = js.native
  def once(mock: MockFunction): MockFunction = js.native
  def once(mock: MockObject): MockFunction = js.native
  def proxy(
    req: typings.xhrDashMock.libMockRequestMod.default,
    res: typings.xhrDashMock.libMockResponseMod.default
  ): js.Promise[typings.xhrDashMock.libMockResponseMod.default] = js.native
}

