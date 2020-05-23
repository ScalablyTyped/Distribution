package typings.titanium

import typings.titanium.Titanium.Buffer
import typings.titanium.Titanium.IOStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback each time the
  * [pump](Titanium.Stream.pump) operation has new data to deliver.
  */
trait PumpCallbackArgs extends ErrorResponse {
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
    * Stream being read from.
    */
  var source: js.UndefOr[IOStream] = js.undefined
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
    bytesProcessed: js.UndefOr[Double] = js.undefined,
    code: js.UndefOr[Double] = js.undefined,
    error: java.lang.String = null,
    source: IOStream = null,
    success: js.UndefOr[Boolean] = js.undefined,
    totalBytesProcessed: js.UndefOr[Double] = js.undefined
  ): PumpCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesProcessed)) __obj.updateDynamic("bytesProcessed")(bytesProcessed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalBytesProcessed)) __obj.updateDynamic("totalBytesProcessed")(totalBytesProcessed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PumpCallbackArgs]
  }
}

