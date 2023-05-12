package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsClaimMod {
  
  @JSImport("workbox-core/clientsClaim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Claim any currently available clients once the service worker
    * becomes active. This is normally used in conjunction with `skipWaiting()`.
    *
    * @memberof workbox-core
    */
  inline def clientsClaim(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clientsClaim")().asInstanceOf[Unit]
}
