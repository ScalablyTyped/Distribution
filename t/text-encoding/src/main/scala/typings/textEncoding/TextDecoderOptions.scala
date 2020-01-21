package typings.textEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDecoderOptions extends js.Object {
  var stream: js.UndefOr[Boolean] = js.undefined
}

object TextDecoderOptions {
  @scala.inline
  def apply(stream: js.UndefOr[Boolean] = js.undefined): TextDecoderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderOptions]
  }
}

