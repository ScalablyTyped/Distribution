package typings.workboxNavigationPreload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disableMod {
  
  @JSImport("workbox-navigation-preload/disable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * If the browser supports Navigation Preload, then this will disable it.
    *
    * @memberof workbox-navigation-preload
    */
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
}
