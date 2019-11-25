package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.UI.iOS.LivePhoto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A media object from the camera or photo gallery.
  */
trait CameraMediaItemType extends js.Object {
  /**
  	 * Error code. Returns 0.
  	 */
  var code: js.UndefOr[Double] = js.undefined
  /**
  	 * Simple object defining the user's selected crop rectangle, or `null` if the user has not edited the photo.
  	 */
  var cropRect: js.UndefOr[CropRectType] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[String] = js.undefined
  /**
  	 * The live photo object, as a <Titanium.UI.iOS.LivePhoto> and
  	 * `undefined` if no live photo is selected.
  	 */
  var livePhoto: js.UndefOr[LivePhoto] = js.undefined
  /**
  	 * The media object, as a [Blob](Titanium.Blob).
  	 */
  var media: js.UndefOr[Blob] = js.undefined
  /**
  	 * The type of media, either `MEDIA_TYPE_PHOTO`, `MEDIA_TYPE_LIVEPHOTO` or `MEDIA_TYPE_VIDEO` defined in <Titanium.Media>.
  	 */
  var mediaType: js.UndefOr[String] = js.undefined
  /**
  	 * Simple object defining the preview image size.
  	 */
  var previewRect: js.UndefOr[PreviewRectType] = js.undefined
  /**
  	 * Indicates if the operation succeeded. Returns `true`.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
}

object CameraMediaItemType {
  @scala.inline
  def apply(
    code: Int | Double = null,
    cropRect: CropRectType = null,
    error: String = null,
    livePhoto: LivePhoto = null,
    media: Blob = null,
    mediaType: String = null,
    previewRect: PreviewRectType = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): CameraMediaItemType = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (cropRect != null) __obj.updateDynamic("cropRect")(cropRect.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (livePhoto != null) __obj.updateDynamic("livePhoto")(livePhoto.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (previewRect != null) __obj.updateDynamic("previewRect")(previewRect.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraMediaItemType]
  }
}

