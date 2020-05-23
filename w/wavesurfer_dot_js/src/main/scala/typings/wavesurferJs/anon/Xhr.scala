package typings.wavesurferJs.anon

import typings.wavesurferJs.mod.XHROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Xhr extends js.Object {
  var xhr: js.UndefOr[XHROptions] = js.undefined
}

object Xhr {
  @scala.inline
  def apply(xhr: XHROptions = null): Xhr = {
    val __obj = js.Dynamic.literal()
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xhr]
  }
}

