package typings.workboxPrecaching

import typings.workboxCore.typesMod.WorkboxPlugin
import typings.workboxPrecaching.anon.PrecacheController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPrecacheCacheKeyPluginMod {
  
  /**
    * A plugin, designed to be used with PrecacheController, to translate URLs into
    * the corresponding cache key, based on the current revision info.
    *
    * @private
    */
  @JSImport("workbox-precaching/utils/PrecacheCacheKeyPlugin", "PrecacheCacheKeyPlugin")
  @js.native
  open class PrecacheCacheKeyPlugin protected ()
    extends StObject
       with WorkboxPlugin {
    def this(param0: PrecacheController) = this()
    
    /* private */ val _precacheController: Any = js.native
  }
}
