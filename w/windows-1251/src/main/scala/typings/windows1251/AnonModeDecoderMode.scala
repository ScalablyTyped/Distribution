package typings.windows1251

import typings.windows1251.mod.DecoderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModeDecoderMode extends js.Object {
  var mode: js.UndefOr[DecoderMode] = js.undefined
}

object AnonModeDecoderMode {
  @scala.inline
  def apply(mode: DecoderMode = null): AnonModeDecoderMode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModeDecoderMode]
  }
}

