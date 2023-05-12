package typings.workboxNavigationPreload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isSupportedMod {
  
  @JSImport("workbox-navigation-preload/isSupported", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return {boolean} Whether or not the current browser supports enabling
    * navigation preload.
    *
    * @memberof workbox-navigation-preload
    */
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
}
