package typings
package textDashEncodingDashUtfDash8Lib.textDashEncodingDashUtfDash8Mod.TextEncodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncoderOptions extends js.Object {
  var NONSTANDARD_allowLegacyEncoding: js.UndefOr[scala.Boolean] = js.undefined
}

object TextEncoderOptions {
  @scala.inline
  def apply(NONSTANDARD_allowLegacyEncoding: js.UndefOr[scala.Boolean] = js.undefined): TextEncoderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NONSTANDARD_allowLegacyEncoding)) __obj.updateDynamic("NONSTANDARD_allowLegacyEncoding")(NONSTANDARD_allowLegacyEncoding)
    __obj.asInstanceOf[TextEncoderOptions]
  }
}

