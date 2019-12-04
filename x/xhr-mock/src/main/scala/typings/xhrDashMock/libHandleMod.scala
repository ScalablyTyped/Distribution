package typings.xhrDashMock

import typings.xhrDashMock.libMockRequestMod.default
import typings.xhrDashMock.libTypesMod.MockFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/handle", JSImport.Namespace)
@js.native
object libHandleMod extends js.Object {
  def async(
    handlers: js.Array[MockFunction],
    request: default,
    response: typings.xhrDashMock.libMockResponseMod.default
  ): js.Promise[typings.xhrDashMock.libMockResponseMod.default] = js.native
  def sync(
    handlers: js.Array[MockFunction],
    request: default,
    response: typings.xhrDashMock.libMockResponseMod.default
  ): typings.xhrDashMock.libMockResponseMod.default = js.native
}

