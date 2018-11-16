package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The parameter passed to the `error` callback of <PreviewImageOptions>.
 */

trait PreviewImageError extends js.Object {
  /**
  	 * Error code, if applicable.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Description of the error.
  	 */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Indicates if the operation succeeded. Returns `false`.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

