package typings.unzipper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompressedSize extends js.Object {
  var compressedSize: Double
  var compressionMethod: Double
  var crc32: Double
  var extraFieldLength: Double
  var fileNameLength: Double
  var flags: Double
  var lastModifiedTime: Double
  var signature: js.UndefOr[Double] = js.undefined
  var versionsNeededToExtract: Double
}

object AnonCompressedSize {
  @scala.inline
  def apply(
    compressedSize: Double,
    compressionMethod: Double,
    crc32: Double,
    extraFieldLength: Double,
    fileNameLength: Double,
    flags: Double,
    lastModifiedTime: Double,
    versionsNeededToExtract: Double,
    signature: Int | Double = null
  ): AnonCompressedSize = {
    val __obj = js.Dynamic.literal(compressedSize = compressedSize.asInstanceOf[js.Any], compressionMethod = compressionMethod.asInstanceOf[js.Any], crc32 = crc32.asInstanceOf[js.Any], extraFieldLength = extraFieldLength.asInstanceOf[js.Any], fileNameLength = fileNameLength.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], versionsNeededToExtract = versionsNeededToExtract.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompressedSize]
  }
}

