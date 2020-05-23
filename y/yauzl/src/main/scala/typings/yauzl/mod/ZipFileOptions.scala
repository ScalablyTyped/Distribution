package typings.yauzl.mod

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
    decompress: Boolean = null.asInstanceOf[Boolean],
    decrypt: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    start: Double = null.asInstanceOf[Double]
  ): ZipFileOptions = {
    val __obj = js.Dynamic.literal(decompress = decompress.asInstanceOf[js.Any], decrypt = decrypt.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipFileOptions]
  }
}

