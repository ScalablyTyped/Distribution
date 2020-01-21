package typings.wavesurferJs

import typings.wavesurferJs.mod.XHROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXhr extends js.Object {
  var xhr: js.UndefOr[XHROptions] = js.undefined
}

object AnonXhr {
  @scala.inline
  def apply(xhr: XHROptions = null): AnonXhr = {
    val __obj = js.Dynamic.literal()
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXhr]
  }
}

