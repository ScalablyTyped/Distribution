package typings.xhrDashMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/proxy.browser", JSImport.Namespace)
@js.native
object libProxyDotBrowserMod extends js.Object {
  def default(
    req: typings.xhrDashMock.libMockRequestMod.default,
    res: typings.xhrDashMock.libMockResponseMod.default
  ): js.Promise[typings.xhrDashMock.libMockResponseMod.default] = js.native
}

