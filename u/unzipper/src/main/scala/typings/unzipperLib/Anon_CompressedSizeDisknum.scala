package typings
package unzipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompressedSizeDisknum extends js.Object {
  var compressedSize: scala.Double
  var disknum: scala.Double
  var offset: scala.Double
  var partsize: scala.Double
  var signature: scala.Double
  var uncompressedSize: scala.Double
}

object Anon_CompressedSizeDisknum {
  @scala.inline
  def apply(
    compressedSize: scala.Double,
    disknum: scala.Double,
    offset: scala.Double,
    partsize: scala.Double,
    signature: scala.Double,
    uncompressedSize: scala.Double
  ): Anon_CompressedSizeDisknum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compressedSize")(compressedSize)
    __obj.updateDynamic("disknum")(disknum)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("partsize")(partsize)
    __obj.updateDynamic("signature")(signature)
    __obj.updateDynamic("uncompressedSize")(uncompressedSize)
    __obj.asInstanceOf[Anon_CompressedSizeDisknum]
  }
}

