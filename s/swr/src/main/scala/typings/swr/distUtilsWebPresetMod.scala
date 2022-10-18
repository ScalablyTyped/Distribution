package typings.swr

import typings.swr.distTypesMod.ProviderConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsWebPresetMod {
  
  @JSImport("swr/dist/utils/web-preset", "defaultConfigOptions")
  @js.native
  val defaultConfigOptions: ProviderConfiguration = js.native
  
  object preset {
    
    @JSImport("swr/dist/utils/web-preset", "preset")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isOnline(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOnline")().asInstanceOf[Boolean]
    
    inline def isVisible(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")().asInstanceOf[Boolean]
  }
}
