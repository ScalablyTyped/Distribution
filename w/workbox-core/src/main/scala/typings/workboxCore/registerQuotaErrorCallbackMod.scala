package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerQuotaErrorCallbackMod {
  
  @JSImport("workbox-core/registerQuotaErrorCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds a function to the set of quotaErrorCallbacks that will be executed if
    * there's a quota error.
    *
    * @param {Function} callback
    * @memberof workbox-core
    */
  inline def registerQuotaErrorCallback(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerQuotaErrorCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
