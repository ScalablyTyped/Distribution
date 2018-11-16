package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Argument passed to the callback when a request finishes successfully or erroneously.
 */

trait CloudUsersSecureResponse extends js.Object {
  /**
  	 * Identifies the current access token when using 3-Legged OAuth.
  	 */
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Error code, if any returned.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Indicates whether the request failed.
  	 */
  var error: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indicates the number of seconds before the access token expires.
  	 */
  var expiresIn: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Meta data, if any returned.
  	 */
  var meta: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Indicates whether the request succeeded.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

