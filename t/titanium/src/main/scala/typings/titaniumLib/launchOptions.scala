package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary describing the arguments passed to the application on startup.
  * Use the [getArguments](Titanium.App.getArguments) method to retrieve the launch options.
  */
trait launchOptions extends js.Object {
  /**
  	 * If set to `true`, this key indicates that the application was launched in response to an
  	 * incoming location event.
  	 */
  var launchOptionsLocationKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This key indicates that the application was launched by another
  	 * application with the specified bundle ID.
  	 */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This key indicates that the application was launched in order to open
  	 * the specified URL.
  	 */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

