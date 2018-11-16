package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Argument passed to the [getCurrentHeading](Titanium.Geolocation.getCurrentHeading) callback.
 */

trait HeadingResponse extends js.Object {
  /**
  	 * Error code.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * If `success` is true, the actual heading data.
  	 */
  var heading: js.UndefOr[HeadingData] = js.undefined
  /**
  	 * Indicates a successful operation.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

