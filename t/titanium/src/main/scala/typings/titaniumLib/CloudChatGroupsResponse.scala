package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Argument passed to the callback when a request finishes successfully or erroneously.
 */

trait CloudChatGroupsResponse extends js.Object {
  /**
  	 * Set of `chat_groups` objects, if any exist.
  	 */
  var chat_groups: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Error code, if any returned.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Indicates whether the request failed.
  	 */
  var error: js.UndefOr[scala.Boolean] = js.undefined
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

