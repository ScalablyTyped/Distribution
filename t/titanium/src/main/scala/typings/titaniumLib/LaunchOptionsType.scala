package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Dictionary object of parameters used to identify an incoming URL that is handled
 * by the application.
 */

trait LaunchOptionsType extends js.Object {
  /**
  	 * The application or service that triggered the handled URL.
  	 */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The url that was triggered by the application or service.
  	 */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

