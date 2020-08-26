package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video that is associated with a product listing in the Windows Store. */
@js.native
trait StoreVideo extends js.Object {
  /** Gets the caption for the video. */
  var caption: String = js.native
  /** Gets the height of the video, in pixels. */
  var height: Double = js.native
  /** Gets the preview image that is displayed for the video. */
  var previewImage: StoreImage = js.native
  /** Gets the URI of the video. */
  var uri: Uri = js.native
  /** Gets the tag for the video. */
  var videoPurposeTag: String = js.native
  /** Gets the width of the video, in pixels. */
  var width: Double = js.native
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
  @scala.inline
  implicit class StoreVideoOps[Self <: StoreVideo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviewImage(value: StoreImage): Self = this.set("previewImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoPurposeTag(value: String): Self = this.set("videoPurposeTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

