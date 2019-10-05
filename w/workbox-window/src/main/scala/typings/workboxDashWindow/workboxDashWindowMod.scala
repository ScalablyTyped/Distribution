package typings.workboxDashWindow

import typings.std.RegistrationOptions
import typings.std.ServiceWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-window", JSImport.Namespace)
@js.native
object workboxDashWindowMod extends js.Object {
  @js.native
  class Workbox protected ()
    extends typings.workboxDashWindow.workboxMod.Workbox {
    /**
      * Creates a new Workbox instance with a script URL and service worker
      * options. The script URL and options are the same as those used when
      * calling `navigator.serviceWorker.register(scriptURL, options)`. See:
      * https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/register
      */
    def this(scriptURL: String) = this()
    def this(scriptURL: String, registerOptions: RegistrationOptions) = this()
  }
  
  def messageSW(sw: ServiceWorker, data: js.Object): js.Promise[js.UndefOr[js.Object]] = js.native
}

