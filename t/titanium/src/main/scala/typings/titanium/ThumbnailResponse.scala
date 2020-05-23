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
trait ThumbnailResponse extends ErrorResponse {
  /**
    * Thumbnail image, as a `Blob`.
    */
  var image: js.UndefOr[Blob] = js.undefined
  /**
    * Time offset for the thumbnail, in seconds.
    */
  var time: js.UndefOr[Double] = js.undefined
}

object ThumbnailResponse {
  @scala.inline
  def apply(
    code: js.UndefOr[Double] = js.undefined,
    error: java.lang.String = null,
    image: Blob = null,
    success: js.UndefOr[Boolean] = js.undefined,
    time: js.UndefOr[Double] = js.undefined
  ): ThumbnailResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbnailResponse]
  }
}

