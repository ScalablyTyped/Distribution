package typings.titanium

import typings.titanium.Titanium.IOStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the read callback when an asynchronous [read](Titanium.Stream.read) operation
  * finishes.
  */
trait ReadCallbackArgs extends ErrorResponse {
  /**
    * Number of bytes processed, or -1 in the event of an error or end of stream.
    */
  var bytesProcessed: js.UndefOr[Double] = js.undefined
  /**
    * Stream being read.
    */
  var source: js.UndefOr[IOStream] = js.undefined
}

object ReadCallbackArgs {
  @scala.inline
  def apply(
    bytesProcessed: js.UndefOr[Double] = js.undefined,
    code: js.UndefOr[Double] = js.undefined,
    error: java.lang.String = null,
    source: IOStream = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): ReadCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bytesProcessed)) __obj.updateDynamic("bytesProcessed")(bytesProcessed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadCallbackArgs]
  }
}

