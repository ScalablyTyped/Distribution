package typings
package uploadcareLib.uploadcareMod.UploadcareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var datetime_removed: java.lang.String | scala.Null
  var datetime_stored: java.lang.String
  var datetime_uploaded: java.lang.String
  var image_info: ImageInfo
  var is_image: scala.Boolean
  var is_ready: scala.Boolean
  var mime_type: java.lang.String
  var original_file_url: java.lang.String
  var original_filename: java.lang.String
  var size: scala.Double
  var url: java.lang.String
  var uuid: java.lang.String
}

object File {
  @scala.inline
  def apply(
    datetime_stored: java.lang.String,
    datetime_uploaded: java.lang.String,
    image_info: ImageInfo,
    is_image: scala.Boolean,
    is_ready: scala.Boolean,
    mime_type: java.lang.String,
    original_file_url: java.lang.String,
    original_filename: java.lang.String,
    size: scala.Double,
    url: java.lang.String,
    uuid: java.lang.String,
    datetime_removed: java.lang.String = null
  ): File = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("datetime_stored")(datetime_stored)
    __obj.updateDynamic("datetime_uploaded")(datetime_uploaded)
    __obj.updateDynamic("image_info")(image_info)
    __obj.updateDynamic("is_image")(is_image)
    __obj.updateDynamic("is_ready")(is_ready)
    __obj.updateDynamic("mime_type")(mime_type)
    __obj.updateDynamic("original_file_url")(original_file_url)
    __obj.updateDynamic("original_filename")(original_filename)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("uuid")(uuid)
    if (datetime_removed != null) __obj.updateDynamic("datetime_removed")(datetime_removed)
    __obj.asInstanceOf[File]
  }
}

