package typings.uploadcare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var datetime_removed: String | Null
  var datetime_stored: String
  var datetime_uploaded: String
  var image_info: ImageInfo
  var is_image: Boolean
  var is_ready: Boolean
  var mime_type: String
  var original_file_url: String
  var original_filename: String
  var size: Double
  var url: String
  var uuid: String
}

object File {
  @scala.inline
  def apply(
    datetime_stored: String,
    datetime_uploaded: String,
    image_info: ImageInfo,
    is_image: Boolean,
    is_ready: Boolean,
    mime_type: String,
    original_file_url: String,
    original_filename: String,
    size: Double,
    url: String,
    uuid: String,
    datetime_removed: String = null
  ): File = {
    val __obj = js.Dynamic.literal(datetime_stored = datetime_stored.asInstanceOf[js.Any], datetime_uploaded = datetime_uploaded.asInstanceOf[js.Any], image_info = image_info.asInstanceOf[js.Any], is_image = is_image.asInstanceOf[js.Any], is_ready = is_ready.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], original_file_url = original_file_url.asInstanceOf[js.Any], original_filename = original_filename.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    if (datetime_removed != null) __obj.updateDynamic("datetime_removed")(datetime_removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

