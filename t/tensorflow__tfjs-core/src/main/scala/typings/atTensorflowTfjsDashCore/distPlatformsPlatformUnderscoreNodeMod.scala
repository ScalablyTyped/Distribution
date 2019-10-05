package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distPlatformsPlatformMod.Platform
import typings.atTensorflowTfjsDashCore.distPlatformsPlatformUnderscoreNodeMod.FetchFn
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", JSImport.Namespace)
@js.native
object distPlatformsPlatformUnderscoreNodeMod extends js.Object {
  @js.native
  class PlatformNode () extends Platform {
    var textEncoder: js.Any = js.native
    var util: js.Any = js.native
  }
  
  def getSystemFetch(): FetchFn = js.native
  def resetSystemFetch(): Unit = js.native
  def setSystemFetch(fetchFn: FetchFn): Unit = js.native
  @js.native
  object getNodeFetch extends js.Object {
    def importFetch(): js.Any = js.native
  }
  
  type FetchFn = js.Function2[/* url */ String, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
}

