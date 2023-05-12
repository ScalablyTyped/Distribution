package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateDontWaitForMod {
  
  @JSImport("workbox-core/_private/dontWaitFor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dontWaitFor(promise: js.Promise[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dontWaitFor")(promise.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
