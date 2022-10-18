package typings.tensorflowTfjsCore

import typings.std.RequestInit
import typings.std.Response
import typings.tensorflowTfjsCore.distPlatformsPlatformMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPlatformsPlatformNodeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", "PlatformNode")
  @js.native
  open class PlatformNode ()
    extends StObject
       with Platform {
    
    /* private */ var textEncoder: Any = js.native
    
    var util: Any = js.native
  }
  
  object getNodeFetch {
    
    @JSImport("@tensorflow/tfjs-core/dist/platforms/platform_node", "getNodeFetch")
    @js.native
    val ^ : js.Any = js.native
    
    inline def importFetch(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("importFetch")().asInstanceOf[Any]
  }
  
  inline def getSystemFetch(): FetchFn = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemFetch")().asInstanceOf[FetchFn]
  
  inline def resetSystemFetch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSystemFetch")().asInstanceOf[Unit]
  
  inline def setSystemFetch(fetchFn: FetchFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSystemFetch")(fetchFn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type FetchFn = js.Function2[/* url */ String, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
}
