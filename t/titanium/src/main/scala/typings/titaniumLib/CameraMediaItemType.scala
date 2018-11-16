package typings
package titaniumLib

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
  var code: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Simple object defining the user's selected crop rectangle, or `null` if the user has not edited the photo.
  	 */
  var cropRect: js.UndefOr[CropRectType] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The live photo object, as a <Titanium.UI.iOS.LivePhoto> and
  	 * `undefined` if no live photo is selected.
  	 */
  var livePhoto: js.UndefOr[titaniumLib.TitaniumNs.UINs.iOSNs.LivePhoto] = js.undefined
  /**
  	 * The media object, as a [Blob](Titanium.Blob).
  	 */
  var media: js.UndefOr[titaniumLib.TitaniumNs.Blob] = js.undefined
  /**
  	 * The type of media, either `MEDIA_TYPE_PHOTO`, `MEDIA_TYPE_LIVEPHOTO` or `MEDIA_TYPE_VIDEO` defined in <Titanium.Media>.
  	 */
  var mediaType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Simple object defining the preview image size.
  	 */
  var previewRect: js.UndefOr[PreviewRectType] = js.undefined
  /**
  	 * Indicates if the operation succeeded. Returns `true`.
  	 */
  var success: js.UndefOr[scala.Boolean] = js.undefined
}

