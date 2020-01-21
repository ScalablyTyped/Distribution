package typings.textEncodingUtf8.mod.TextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncoderOptions extends js.Object {
  var NONSTANDARD_allowLegacyEncoding: js.UndefOr[Boolean] = js.undefined
}

object TextEncoderOptions {
  @scala.inline
  def apply(NONSTANDARD_allowLegacyEncoding: js.UndefOr[Boolean] = js.undefined): TextEncoderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NONSTANDARD_allowLegacyEncoding)) __obj.updateDynamic("NONSTANDARD_allowLegacyEncoding")(NONSTANDARD_allowLegacyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderOptions]
  }
}

