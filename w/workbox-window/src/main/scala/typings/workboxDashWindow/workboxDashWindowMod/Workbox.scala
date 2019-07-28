package typings.workboxDashWindow.workboxDashWindowMod

import typings.std.RegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-window", "Workbox")
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

