package typings.workboxNavigationPreload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enableMod {
  
  @JSImport("workbox-navigation-preload/enable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
