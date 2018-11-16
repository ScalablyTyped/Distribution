package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Reply message received from watch app.
 */

trait MessageReply extends js.Object {
  /**
  	 * Error code. Returns 0 if `success` is `true`.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Reply message from watchapp.
  	 */
  var message: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Indicates if the operation succeeded.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

