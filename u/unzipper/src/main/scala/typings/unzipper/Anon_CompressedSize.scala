package typings.unzipper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompressedSize extends js.Object {
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

object Anon_CompressedSize {
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
  ): Anon_CompressedSize = {
    val __obj = js.Dynamic.literal(compressedSize = compressedSize, compressionMethod = compressionMethod, crc32 = crc32, extraFieldLength = extraFieldLength, fileNameLength = fileNameLength, flags = flags, lastModifiedTime = lastModifiedTime, versionsNeededToExtract = versionsNeededToExtract)
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CompressedSize]
  }
}

