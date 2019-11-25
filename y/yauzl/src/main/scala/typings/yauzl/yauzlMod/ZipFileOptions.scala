package typings.yauzl.yauzlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipFileOptions extends js.Object {
  var decompress: Boolean | Null
  var decrypt: Boolean | Null
  var end: Double | Null
  var start: Double | Null
}

object ZipFileOptions {
  @scala.inline
  def apply(
    decompress: js.UndefOr[Boolean] = js.undefined,
    decrypt: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    start: Int | Double = null
  ): ZipFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress.asInstanceOf[js.Any])
    if (!js.isUndefined(decrypt)) __obj.updateDynamic("decrypt")(decrypt.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipFileOptions]
  }
}

