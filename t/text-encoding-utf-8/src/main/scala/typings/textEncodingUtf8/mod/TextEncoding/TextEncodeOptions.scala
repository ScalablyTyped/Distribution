package typings.textEncodingUtf8.mod.TextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncodeOptions extends js.Object {
  var stream: js.UndefOr[Boolean] = js.undefined
}

object TextEncodeOptions {
  @scala.inline
  def apply(stream: js.UndefOr[Boolean] = js.undefined): TextEncodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncodeOptions]
  }
}

