package typings.unzipper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisknum extends js.Object {
  var compressedSize: Double
  var disknum: Double
  var offset: Double
  var partsize: Double
  var signature: Double
  var uncompressedSize: Double
}

object AnonDisknum {
  @scala.inline
  def apply(
    compressedSize: Double,
    disknum: Double,
    offset: Double,
    partsize: Double,
    signature: Double,
    uncompressedSize: Double
  ): AnonDisknum = {
    val __obj = js.Dynamic.literal(compressedSize = compressedSize.asInstanceOf[js.Any], disknum = disknum.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partsize = partsize.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], uncompressedSize = uncompressedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisknum]
  }
}

