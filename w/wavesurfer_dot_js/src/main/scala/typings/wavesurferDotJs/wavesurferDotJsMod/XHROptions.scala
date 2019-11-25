package typings.wavesurferDotJs.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XHROptions extends js.Object {
  var requestHeaders: js.UndefOr[js.Array[XHRRequestHeader]] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object XHROptions {
  @scala.inline
  def apply(
    requestHeaders: js.Array[XHRRequestHeader] = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): XHROptions = {
    val __obj = js.Dynamic.literal()
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[XHROptions]
  }
}

