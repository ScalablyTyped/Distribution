package typings
package workboxDashWindowLib.workboxDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-window", "Workbox")
@js.native
class Workbox protected ()
  extends workboxDashWindowLib.workboxMod.Workbox {
  /**
    * Creates a new Workbox instance with a script URL and service worker
    * options. The script URL and options are the same as those used when
    * calling `navigator.serviceWorker.register(scriptURL, options)`. See:
    * https://developer.mozilla.org/en-US/docs/Web/API/ServiceWorkerContainer/register
    */
  def this(scriptURL: java.lang.String) = this()
  def this(scriptURL: java.lang.String, registerOptions: stdLib.RegistrationOptions) = this()
}

