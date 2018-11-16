package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Argument passed to the read callback when an asynchronous [read](Titanium.Stream.read) operation
 * finishes.
 */

trait ReadCallbackArgs extends js.Object {
  /**
  	 * Number of bytes processed, or -1 in the event of an error or end of stream.
  	 */
  var bytesProcessed: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Error code. Returns 0 if `success` is `true`.
  	 */
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text description of the error.
  	 */
  var errorDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Whether an error was encountered. Set to 1 in the case of an error, 0
  	 * otherwise.
  	 */
  var errorState: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Stream being read.
  	 */
  var source: js.UndefOr[titaniumLib.TitaniumNs.IOStream] = js.undefined
  /**
  	 * Indicates if the operation succeeded.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

