package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateExecuteQuotaErrorCallbacksMod {
  
  @JSImport("workbox-core/_private/executeQuotaErrorCallbacks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Runs all of the callback functions, one at a time sequentially, in the order
    * in which they were registered.
    *
    * @memberof workbox-core
    * @private
    */
  inline def executeQuotaErrorCallbacks(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeQuotaErrorCallbacks")().asInstanceOf[js.Promise[Unit]]
}
