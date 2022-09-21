package typings.wordpressPriorityQueue

import typings.std.IdleDeadline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestIdleCallbackMod {
  
  @JSImport("@wordpress/priority-queue/build-types/request-idle-callback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createRequestIdleCallback(): js.Function1[/* callback */ Callback, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequestIdleCallback")().asInstanceOf[js.Function1[/* callback */ Callback, Unit]]
  
  type Callback = js.Function1[/* timeOrDeadline */ IdleDeadline | Double, Unit]
}
