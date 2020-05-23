package typings.windows1251.anon

import typings.windows1251.mod.EncoderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var mode: js.UndefOr[EncoderMode] = js.undefined
}

object Mode {
  @scala.inline
  def apply(mode: EncoderMode = null): Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

