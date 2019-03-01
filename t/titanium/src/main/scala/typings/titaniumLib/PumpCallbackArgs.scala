package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback each time the
  * [pump](Titanium.Stream.pump) operation has new data to deliver.
  */
trait PumpCallbackArgs extends js.Object {
  /**
  	 * Buffer object holding the data currently being pumped to the handler method.
  	 */
  var buffer: js.UndefOr[titaniumLib.TitaniumNs.Buffer] = js.undefined
  /**
  	 * Number of bytes being passed to this invocation of the handler, or
  	 * -1 in the event of an error or end of stream.
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
  	 * Stream being read from.
  	 */
  var source: js.UndefOr[titaniumLib.TitaniumNs.IOStream] = js.undefined
  /**
  	 * Indicates if the operation succeeded.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Total number of bytes read from the stream so far,
  	 * including the data passed to this current invocation of the handler.
  	 */
  var totalBytesProcessed: js.UndefOr[scala.Double] = js.undefined
}

object PumpCallbackArgs {
  @scala.inline
  def apply(
    buffer: titaniumLib.TitaniumNs.Buffer = null,
    bytesProcessed: scala.Int | scala.Double = null,
    code: scala.Int | scala.Double = null,
    error: java.lang.String = null,
    errorDescription: java.lang.String = null,
    errorState: scala.Int | scala.Double = null,
    source: titaniumLib.TitaniumNs.IOStream = null,
    success: js.UndefOr[scala.Boolean] = js.undefined,
    totalBytesProcessed: scala.Int | scala.Double = null
  ): PumpCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer)
    if (bytesProcessed != null) __obj.updateDynamic("bytesProcessed")(bytesProcessed.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (errorDescription != null) __obj.updateDynamic("errorDescription")(errorDescription)
    if (errorState != null) __obj.updateDynamic("errorState")(errorState.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    if (totalBytesProcessed != null) __obj.updateDynamic("totalBytesProcessed")(totalBytesProcessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PumpCallbackArgs]
  }
}

