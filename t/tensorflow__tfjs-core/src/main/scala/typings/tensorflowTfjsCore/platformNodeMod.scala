package typings.tensorflowTfjsCore

import typings.std.RequestInit
import typings.std.Response
import typings.tensorflowTfjsCore.platformMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", JSImport.Namespace)
@js.native
object platformNodeMod extends js.Object {
  
  def getSystemFetch(): FetchFn = js.native
  
  def resetSystemFetch(): Unit = js.native
  
  def setSystemFetch(fetchFn: FetchFn): Unit = js.native
  
  @js.native
  class PlatformNode () extends Platform {
    
    var textEncoder: js.Any = js.native
    
    var util: js.Any = js.native
  }
  
  @js.native
  object getNodeFetch extends js.Object {
    
    def importFetch(): js.Any = js.native
  }
  
  type FetchFn = js.Function2[/* url */ String, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
}
