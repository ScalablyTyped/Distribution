package typings.titanium

import typings.titanium.Titanium.IOStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback when an asynchronous
  * [writeStream](Titanium.Stream.writeStream) operation finishes.
  */
trait WriteStreamCallbackArgs extends ErrorResponse {
  /**
  	 * Number of bytes processed, or -1 in the event of an error or end of stream.
  	 */
  var bytesProcessed: js.UndefOr[Double] = js.undefined
  /**
  	 * Stream being read from.
  	 */
  var fromStream: js.UndefOr[IOStream] = js.undefined
  /**
  	 * Stream being written to.
  	 */
  var toStream: js.UndefOr[IOStream] = js.undefined
}

object WriteStreamCallbackArgs {
  @scala.inline
  def apply(
    bytesProcessed: Int | Double = null,
    code: Int | Double = null,
    error: java.lang.String = null,
    fromStream: IOStream = null,
    success: js.UndefOr[Boolean] = js.undefined,
    toStream: IOStream = null
  ): WriteStreamCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (bytesProcessed != null) __obj.updateDynamic("bytesProcessed")(bytesProcessed.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (fromStream != null) __obj.updateDynamic("fromStream")(fromStream.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (toStream != null) __obj.updateDynamic("toStream")(toStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteStreamCallbackArgs]
  }
}

