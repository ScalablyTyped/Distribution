package typings.titanium

import typings.titanium.Titanium.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the thumbnail callback in response to the
  * [requestThumbnailImagesAtTimes](Titanium.Media.VideoPlayer.requestThumbnailImagesAtTimes)
  * method.
  */
@js.native
trait ThumbnailResponse extends ErrorResponse {
  /**
    * Thumbnail image, as a `Blob`.
    */
  var image: js.UndefOr[Blob] = js.native
  /**
    * Time offset for the thumbnail, in seconds.
    */
  var time: js.UndefOr[Double] = js.native
}

object ThumbnailResponse {
  @scala.inline
  def apply(): ThumbnailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailResponse]
  }
  @scala.inline
  implicit class ThumbnailResponseOps[Self <: ThumbnailResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImage(value: Blob): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

