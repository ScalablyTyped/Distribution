package typings.wavesurferDotJs

import typings.wavesurferDotJs.wavesurferDotJsMod.XHROptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Xhr extends js.Object {
  var xhr: js.UndefOr[XHROptions] = js.undefined
}

object Anon_Xhr {
  @scala.inline
  def apply(xhr: XHROptions = null): Anon_Xhr = {
    val __obj = js.Dynamic.literal()
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[Anon_Xhr]
  }
}

