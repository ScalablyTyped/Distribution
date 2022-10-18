package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distPlatformsPlatformMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPlatformsPlatformBrowserMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/platforms/platform_browser", "PlatformBrowser")
  @js.native
  open class PlatformBrowser ()
    extends StObject
       with Platform {
    
    /* private */ var functionRefs: Any = js.native
    
    /* private */ var handledMessageCount: Any = js.native
    
    /* private */ var hasEventListener: Any = js.native
    
    /* private */ val messageName: Any = js.native
    
    @JSName("setTimeoutCustom")
    def setTimeoutCustom_MPlatformBrowser(functionRef: js.Function, delay: Double): Unit = js.native
    
    /* private */ var textEncoder: Any = js.native
  }
}
