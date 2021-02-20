package typings.tensorflowTfjsCore

import typings.std.RequestInit
import typings.std.Response
import typings.tensorflowTfjsCore.platformMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformNodeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", "PlatformNode")
  @js.native
  class PlatformNode () extends Platform {
    
    var textEncoder: js.Any = js.native
    
    var util: js.Any = js.native
  }
  
  object getNodeFetch {
    
    @JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", "getNodeFetch.importFetch")
    @js.native
    def importFetch(): js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", "getSystemFetch")
  @js.native
  def getSystemFetch(): FetchFn = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", "resetSystemFetch")
  @js.native
  def resetSystemFetch(): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", "setSystemFetch")
  @js.native
  def setSystemFetch(fetchFn: FetchFn): Unit = js.native
  
  type FetchFn = js.Function2[/* url */ String, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
}
