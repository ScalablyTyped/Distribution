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
    code: Int | Double = null,
    error: java.lang.String = null,
    image: Blob = null,
    success: js.UndefOr[Boolean] = js.undefined,
    time: Int | Double = null
  ): ThumbnailResponse = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbnailResponse]
  }
}

