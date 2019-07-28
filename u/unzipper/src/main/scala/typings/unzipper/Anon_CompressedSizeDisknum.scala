package typings.unzipper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompressedSizeDisknum extends js.Object {
  var compressedSize: Double
  var disknum: Double
  var offset: Double
  var partsize: Double
  var signature: Double
  var uncompressedSize: Double
}

object Anon_CompressedSizeDisknum {
  @scala.inline
  def apply(
    compressedSize: Double,
    disknum: Double,
    offset: Double,
    partsize: Double,
    signature: Double,
    uncompressedSize: Double
  ): Anon_CompressedSizeDisknum = {
    val __obj = js.Dynamic.literal(compressedSize = compressedSize, disknum = disknum, offset = offset, partsize = partsize, signature = signature, uncompressedSize = uncompressedSize)
  
    __obj.asInstanceOf[Anon_CompressedSizeDisknum]
  }
}

