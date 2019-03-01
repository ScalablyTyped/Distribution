package typings
package unzipperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompressedSize extends js.Object {
  var compressedSize: scala.Double
  var compressionMethod: scala.Double
  var crc32: scala.Double
  var extraFieldLength: scala.Double
  var fileNameLength: scala.Double
  var flags: scala.Double
  var lastModifiedTime: scala.Double
  var signature: js.UndefOr[scala.Double] = js.undefined
  var versionsNeededToExtract: scala.Double
}

object Anon_CompressedSize {
  @scala.inline
  def apply(
    compressedSize: scala.Double,
    compressionMethod: scala.Double,
    crc32: scala.Double,
    extraFieldLength: scala.Double,
    fileNameLength: scala.Double,
    flags: scala.Double,
    lastModifiedTime: scala.Double,
    versionsNeededToExtract: scala.Double,
    signature: scala.Int | scala.Double = null
  ): Anon_CompressedSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compressedSize")(compressedSize)
    __obj.updateDynamic("compressionMethod")(compressionMethod)
    __obj.updateDynamic("crc32")(crc32)
    __obj.updateDynamic("extraFieldLength")(extraFieldLength)
    __obj.updateDynamic("fileNameLength")(fileNameLength)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("lastModifiedTime")(lastModifiedTime)
    __obj.updateDynamic("versionsNeededToExtract")(versionsNeededToExtract)
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CompressedSize]
  }
}

