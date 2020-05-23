package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.UI.iOS.LivePhoto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A media object from the camera or photo gallery.
  */
trait CameraMediaItemType extends SuccessResponse {
  /**
    * Simple object defining the user's selected crop rectangle, or `null` if the user has not edited the photo. `width`/`height` values are assumed to be in pixels.
    */
  var cropRect: js.UndefOr[Dimension] = js.undefined
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
  var mediaType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Simple object defining the preview image size. This will be undefined when custom camera overlay is not used. Values are assumed to be in pixels.
    */
  var previewRect: js.UndefOr[Size] = js.undefined
}

object CameraMediaItemType {
  @scala.inline
  def apply(
    code: js.UndefOr[Double] = js.undefined,
    cropRect: Dimension = null,
    error: java.lang.String = null,
    livePhoto: LivePhoto = null,
    media: Blob = null,
    mediaType: java.lang.String = null,
    previewRect: Size = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): CameraMediaItemType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (cropRect != null) __obj.updateDynamic("cropRect")(cropRect.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (livePhoto != null) __obj.updateDynamic("livePhoto")(livePhoto.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (previewRect != null) __obj.updateDynamic("previewRect")(previewRect.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraMediaItemType]
  }
}

