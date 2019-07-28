package typings.titanium

import typings.titanium.TitaniumNs.Buffer
import typings.titanium.TitaniumNs.IOStream
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
  var buffer: js.UndefOr[Buffer] = js.undefined
  /**
  	 * Number of bytes being passed to this invocation of the handler, or
  	 * -1 in the event of an error or end of stream.
  	 */
  var bytesProcessed: js.UndefOr[Double] = js.undefined
  /**
  	 * Error code. Returns 0 if `success` is `true`.
  	 */
  var code: js.UndefOr[Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[String] = js.undefined
  /**
  	 * Text description of the error.
  	 */
  var errorDescription: js.UndefOr[String] = js.undefined
  /**
  	 * Whether an error was encountered. Set to 1 in the case of an error, 0
  	 * otherwise.
  	 */
  var errorState: js.UndefOr[Double] = js.undefined
  /**
  	 * Stream being read from.
  	 */
  var source: js.UndefOr[IOStream] = js.undefined
  /**
  	 * Indicates if the operation succeeded.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Total number of bytes read from the stream so far,
  	 * including the data passed to this current invocation of the handler.
  	 */
  var totalBytesProcessed: js.UndefOr[Double] = js.undefined
}

object PumpCallbackArgs {
  @scala.inline
  def apply(
    buffer: Buffer = null,
    bytesProcessed: Int | Double = null,
    code: Int | Double = null,
    error: String = null,
    errorDescription: String = null,
    errorState: Int | Double = null,
    source: IOStream = null,
    success: js.UndefOr[Boolean] = js.undefined,
    totalBytesProcessed: Int | Double = null
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

