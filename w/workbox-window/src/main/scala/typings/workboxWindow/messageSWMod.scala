package typings.workboxWindow

import typings.std.ServiceWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageSWMod {
  
  @JSImport("workbox-window/messageSW", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def messageSW(sw: ServiceWorker, data: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("messageSW")(sw.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
