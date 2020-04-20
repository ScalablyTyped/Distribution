package typings.titanium

import typings.titanium.Titanium.IOStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the write callback when an asynchronous
  * [write](Titanium.Stream.write) operation
  * finishes.
  */
trait WriteCallbackArgs extends ErrorResponse {
  /**
  	 * Number of bytes processed, or -1 in the event of an error or end of stream.
  	 */
  var bytesProcessed: js.UndefOr[Double] = js.undefined
  /**
  	 * Stream being written to.
  	 */
  var source: js.UndefOr[IOStream] = js.undefined
}

object WriteCallbackArgs {
  @scala.inline
  def apply(
    bytesProcessed: Int | Double = null,
    code: Int | Double = null,
    error: java.lang.String = null,
    source: IOStream = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): WriteCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (bytesProcessed != null) __obj.updateDynamic("bytesProcessed")(bytesProcessed.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteCallbackArgs]
  }
}

