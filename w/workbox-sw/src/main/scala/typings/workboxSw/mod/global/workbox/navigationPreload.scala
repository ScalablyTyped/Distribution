package typings.workboxSw.mod.global.workbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof WorkboxNavigationPreload` */
object navigationPreload {
  
  @JSGlobal("workbox.navigationPreload")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * If the browser supports Navigation Preload, then this will disable it.
    *
    * @memberof workbox-navigation-preload
    */
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  
  /**
    * If the browser supports Navigation Preload, then this will enable it.
    *
    * @param {string} [headerValue] Optionally, allows developers to
    * [override](https://developers.google.com/web/updates/2017/02/navigation-preload#changing_the_header)
    * the value of the `Service-Worker-Navigation-Preload` header which will be
    * sent to the server when making the navigation request.
    *
    * @memberof workbox-navigation-preload
    */
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  inline def enable(headerValue: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(headerValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @return {boolean} Whether or not the current browser supports enabling
    * navigation preload.
    *
    * @memberof workbox-navigation-preload
    */
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
}
