package typings
package yauzlLib.yauzlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipFileOptions extends js.Object {
  var decompress: scala.Boolean | scala.Null
  var decrypt: scala.Boolean | scala.Null
  var end: scala.Double | scala.Null
  var start: scala.Double | scala.Null
}

object ZipFileOptions {
  @scala.inline
  def apply(
    decompress: js.UndefOr[scala.Boolean] = js.undefined,
    decrypt: js.UndefOr[scala.Boolean] = js.undefined,
    end: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): ZipFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress)
    if (!js.isUndefined(decrypt)) __obj.updateDynamic("decrypt")(decrypt)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipFileOptions]
  }
}

