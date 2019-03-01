package typings
package textDashEncodingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDecoderOptions extends js.Object {
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

object TextDecoderOptions {
  @scala.inline
  def apply(stream: js.UndefOr[scala.Boolean] = js.undefined): TextDecoderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[TextDecoderOptions]
  }
}

