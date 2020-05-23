package typings.unzipper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disknum extends js.Object {
  var compressedSize: Double
  var disknum: Double
  var offset: Double
  var partsize: Double
  var signature: Double
  var uncompressedSize: Double
}

object Disknum {
  @scala.inline
  def apply(
    compressedSize: Double,
    disknum: Double,
    offset: Double,
    partsize: Double,
    signature: Double,
    uncompressedSize: Double
  ): Disknum = {
    val __obj = js.Dynamic.literal(compressedSize = compressedSize.asInstanceOf[js.Any], disknum = disknum.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partsize = partsize.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], uncompressedSize = uncompressedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disknum]
  }
}

