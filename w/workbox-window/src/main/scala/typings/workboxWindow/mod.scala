package typings.workboxWindow

import typings.std.RegistrationOptions
import typings.std.ServiceWorker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-window", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("workbox-window", "Workbox")
  @js.native
  class Workbox protected ()
    extends typings.workboxWindow.workboxMod.Workbox {
    def this(scriptURL: String) = this()
    def this(scriptURL: String, registerOptions: RegistrationOptions) = this()
  }
  
  inline def messageSW(sw: ServiceWorker, data: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("messageSW")(sw.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
