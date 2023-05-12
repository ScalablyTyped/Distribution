package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipWaitingMod {
  
  @JSImport("workbox-core/skipWaiting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This method is deprecated, and will be removed in Workbox v7.
    *
    * Calling self.skipWaiting() is equivalent, and should be used instead.
    *
    * @memberof workbox-core
    */
  inline def skipWaiting(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWaiting")().asInstanceOf[Unit]
}
