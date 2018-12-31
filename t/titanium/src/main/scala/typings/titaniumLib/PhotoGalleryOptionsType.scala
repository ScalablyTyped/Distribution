package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying options to
  * [openPhotoGallery](Titanium.Media.openPhotoGallery).
  */
trait PhotoGalleryOptionsType extends js.Object {
  /**
  	 * Specifies if the media should be editable after capture/selection.
  	 */
  var allowEditing: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specifies if the user should be able to select multiple photos.
  	 */
  var allowMultiple: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specifies if the dialog should be animated upon showing and hiding.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Controls the type of arrow and position of the popover.
  	 */
  var arrowDirection: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Specifies if the photo gallery should be hidden automatically after the media
  	 * selection is completed.
  	 */
  var autohide: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Function to call if the user presses the cancel button.
  	 */
  var cancel: js.UndefOr[js.Function1[/* param0 */ FailureResponse, _]] = js.undefined
  /**
  	 * Function to call upon receiving an error.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ FailureResponse, _]] = js.undefined
  /**
  	 * Array of media type constants to allow.
  	 * Live photos is only supported on the iOS platform, starting with iOS 9.1. If you want
  	 * to allow live photos with <Titanium.Media.MEDIA_TYPE_LIVEPHOTO>, you also need to specify
  	 * at least <Titanium.Media.MEDIA_TYPE_PHOTO> as a fallback. If you do not allow live
  	 * photos, they still can be selected, but will be represented as a normal static photo.
  	 */
  var mediaTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * View to position the photo gallery popover on top of.
  	 */
  var popoverView: js.UndefOr[titaniumLib.TitaniumNs.UINs.View] = js.undefined
  /**
  	 * Function to call when the photo gallery is closed after a successful selection.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ CameraMediaItemType, _]] = js.undefined
}

