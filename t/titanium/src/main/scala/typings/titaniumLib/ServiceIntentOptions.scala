package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to <Titanium.Android.createServiceIntent>.
  */
trait ServiceIntentOptions extends js.Object {
  /**
  	 * One of the `START_` constants from <Titanium.Android> to specify the "stickiness" of the Service when Android shuts down the host application.
  	 */
  var startMode: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * URL for the service's JavaScript.
  	 */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

