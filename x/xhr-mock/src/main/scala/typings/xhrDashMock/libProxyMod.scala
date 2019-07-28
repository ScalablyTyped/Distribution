package typings.xhrDashMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/proxy", JSImport.Namespace)
@js.native
object libProxyMod extends js.Object {
  def default(
    req: typings.xhrDashMock.libMockRequestMod.default,
    res: typings.xhrDashMock.libMockResponseMod.default
  ): js.Promise[typings.xhrDashMock.libMockResponseMod.default] = js.native
}

