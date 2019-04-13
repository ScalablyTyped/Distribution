package typings
package wavesurferDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Xhr extends js.Object {
  var xhr: js.UndefOr[wavesurferDotJsLib.wavesurferDotJsMod.XHROptions] = js.undefined
}

object Anon_Xhr {
  @scala.inline
  def apply(xhr: wavesurferDotJsLib.wavesurferDotJsMod.XHROptions = null): Anon_Xhr = {
    val __obj = js.Dynamic.literal()
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[Anon_Xhr]
  }
}

