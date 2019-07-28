package typings.titanium

import typings.titanium.TitaniumNs.IOStream
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
  	 * Stream being read.
  	 */
  var source: js.UndefOr[IOStream] = js.undefined
  /**
  	 * Indicates if the operation succeeded.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
}

object ReadCallbackArgs {
  @scala.inline
  def apply(
    bytesProcessed: Int | Double = null,
    code: Int | Double = null,
    error: String = null,
    errorDescription: String = null,
    errorState: Int | Double = null,
    source: IOStream = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): ReadCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (bytesProcessed != null) __obj.updateDynamic("bytesProcessed")(bytesProcessed.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (errorDescription != null) __obj.updateDynamic("errorDescription")(errorDescription)
    if (errorState != null) __obj.updateDynamic("errorState")(errorState.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ReadCallbackArgs]
  }
}

