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
    val __obj = js.Dynamic.literal(compressedSize = compressedSize, disknum = disknum, offset = offset, partsize = partsize, signature = signature, uncompressedSize = uncompressedSize)
  
    __obj.asInstanceOf[Anon_CompressedSizeDisknum]
  }
}

