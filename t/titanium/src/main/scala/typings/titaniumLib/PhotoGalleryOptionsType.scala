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

object PhotoGalleryOptionsType {
  @scala.inline
  def apply(
    allowEditing: js.UndefOr[scala.Boolean] = js.undefined,
    allowMultiple: js.UndefOr[scala.Boolean] = js.undefined,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    arrowDirection: scala.Int | scala.Double = null,
    autohide: js.UndefOr[scala.Boolean] = js.undefined,
    cancel: /* param0 */ FailureResponse => _ = null,
    error: /* param0 */ FailureResponse => _ = null,
    mediaTypes: js.Array[java.lang.String] = null,
    popoverView: titaniumLib.TitaniumNs.UINs.View = null,
    success: /* param0 */ CameraMediaItemType => _ = null
  ): PhotoGalleryOptionsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing)
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (arrowDirection != null) __obj.updateDynamic("arrowDirection")(arrowDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (mediaTypes != null) __obj.updateDynamic("mediaTypes")(mediaTypes)
    if (popoverView != null) __obj.updateDynamic("popoverView")(popoverView)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PhotoGalleryOptionsType]
  }
}

