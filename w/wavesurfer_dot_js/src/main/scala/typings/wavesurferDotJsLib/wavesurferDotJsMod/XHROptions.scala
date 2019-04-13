package typings
package wavesurferDotJsLib.wavesurferDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XHROptions extends js.Object {
  var requestHeaders: js.UndefOr[js.Array[XHRRequestHeader]] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object XHROptions {
  @scala.inline
  def apply(
    requestHeaders: js.Array[XHRRequestHeader] = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): XHROptions = {
    val __obj = js.Dynamic.literal()
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[XHROptions]
  }
}

