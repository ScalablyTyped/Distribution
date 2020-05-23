package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video that is associated with a product listing in the Windows Store. */
trait StoreVideo extends js.Object {
  /** Gets the caption for the video. */
  var caption: String
  /** Gets the height of the video, in pixels. */
  var height: Double
  /** Gets the preview image that is displayed for the video. */
  var previewImage: StoreImage
  /** Gets the URI of the video. */
  var uri: Uri
  /** Gets the tag for the video. */
  var videoPurposeTag: String
  /** Gets the width of the video, in pixels. */
  var width: Double
}

object StoreVideo {
  @scala.inline
  def apply(
    caption: String,
    height: Double,
    previewImage: StoreImage,
    uri: Uri,
    videoPurposeTag: String,
    width: Double
  ): StoreVideo = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], previewImage = previewImage.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], videoPurposeTag = videoPurposeTag.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreVideo]
  }
}

