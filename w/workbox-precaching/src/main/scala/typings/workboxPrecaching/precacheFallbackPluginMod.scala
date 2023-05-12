package typings.workboxPrecaching

import typings.workboxCore.typesMod.WorkboxPlugin
import typings.workboxPrecaching.anon.FallbackURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precacheFallbackPluginMod {
  
  /**
    * `PrecacheFallbackPlugin` allows you to specify an "offline fallback"
    * response to be used when a given strategy is unable to generate a response.
    *
    * It does this by intercepting the `handlerDidError` plugin callback
    * and returning a precached response, taking the expected revision parameter
    * into account automatically.
    *
    * Unless you explicitly pass in a `PrecacheController` instance to the
    * constructor, the default instance will be used. Generally speaking, most
    * developers will end up using the default.
    *
    * @memberof workbox-precaching
    */
  @JSImport("workbox-precaching/PrecacheFallbackPlugin", "PrecacheFallbackPlugin")
  @js.native
  open class PrecacheFallbackPlugin protected ()
    extends StObject
       with WorkboxPlugin {
    /**
      * Constructs a new PrecacheFallbackPlugin with the associated fallbackURL.
      *
      * @param {Object} config
      * @param {string} config.fallbackURL A precached URL to use as the fallback
      *     if the associated strategy can't generate a response.
      * @param {PrecacheController} [config.precacheController] An optional
      *     PrecacheController instance. If not provided, the default
      *     PrecacheController will be used.
      */
    def this(param0: FallbackURL) = this()
    
    /* private */ val _fallbackURL: Any = js.native
    
    /* private */ val _precacheController: Any = js.native
  }
}
