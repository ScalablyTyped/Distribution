package typings.tensorflowTfjsCore

import typings.std.RequestInit
import typings.std.Response
import typings.tensorflowTfjsCore.platformMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformNodeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", "PlatformNode")
  @js.native
  class PlatformNode ()
    extends StObject
       with Platform {
    
    var textEncoder: js.Any = js.native
    
    var util: js.Any = js.native
  }
  
  object getNodeFetch {
    
    @JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", "getNodeFetch")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def importFetch(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("importFetch")().asInstanceOf[js.Any]
  }
  
  @scala.inline
  def getSystemFetch(): FetchFn = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemFetch")().asInstanceOf[FetchFn]
  
  @scala.inline
  def resetSystemFetch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSystemFetch")().asInstanceOf[Unit]
  
  @scala.inline
  def setSystemFetch(fetchFn: FetchFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSystemFetch")(fetchFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type FetchFn = js.Function2[/* url */ String, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
}
