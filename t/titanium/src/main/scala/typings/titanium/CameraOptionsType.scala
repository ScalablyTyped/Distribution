package typings.titanium

import typings.titanium.Titanium.UI.Matrix2D
import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying options to [showCamera](Titanium.Media.showCamera).
  */
trait CameraOptionsType extends js.Object {
  /**
  	 * Specifies if the media should be editable after capture/selection.
  	 */
  var allowEditing: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Specifies if the dialog should be animated upon showing and hiding.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Controls the type of arrow and position of the popover.
  	 */
  var arrowDirection: js.UndefOr[Double] = js.undefined
  /**
  	 * Specifies if the camera should be hidden automatically after the media capture is completed.
  	 */
  var autohide: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Determines if the camera preview should rotate or not.
  	 */
  var autorotate: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Function to call if the user presses the cancel button.
  	 */
  var cancel: js.UndefOr[js.Function1[/* param0 */ FailureResponse, _]] = js.undefined
  /**
  	 * Function to call upon receiving an error.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ FailureResponse, _]] = js.undefined
  /**
  	 * Show the camera in a popover.
  	 */
  var inPopOver: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Array of media type constants to allow. Note: If you want to select live photos, iOS only  allows
  	 * you to select existing live photos from the gallery, capturing new live photos is not supported by
  	 * iOS public API, yet.
  	 */
  var mediaTypes: js.UndefOr[js.Array[String]] = js.undefined
  /**
  	 * View to added as an overlay to the camera UI (on top).
  	 */
  var overlay: js.UndefOr[View] = js.undefined
  /**
  	 * View to position the camera or photo gallery popover on top of.
  	 */
  var popoverView: js.UndefOr[View] = js.undefined
  /**
  	 * Specifies if the media should be saved to the photo gallery upon successful capture.
  	 */
  var saveToPhotoGallery: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Indicates if the built-in camera controls should be displayed.
  	 */
  var showControls: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Function to call when the camera is closed after a successful capture/selection.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ CameraMediaItemType, _]] = js.undefined
  /**
  	 * Transformation matrix to apply to the camera or photogallery view.
  	 */
  var transform: js.UndefOr[Matrix2D] = js.undefined
  /**
  	 * Maximum duration (in milliseconds) to allow video capture before completing.
  	 */
  var videoMaximumDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Constant to indicate the video quality during capture.
  	 */
  var videoQuality: js.UndefOr[Double] = js.undefined
  /**
  	 * Opens the camera with the specified camera direction.
  	 */
  var whichCamera: js.UndefOr[Double] = js.undefined
}

object CameraOptionsType {
  @scala.inline
  def apply(
    allowEditing: js.UndefOr[Boolean] = js.undefined,
    animated: js.UndefOr[Boolean] = js.undefined,
    arrowDirection: Int | Double = null,
    autohide: js.UndefOr[Boolean] = js.undefined,
    autorotate: js.UndefOr[Boolean] = js.undefined,
    cancel: /* param0 */ FailureResponse => _ = null,
    error: /* param0 */ FailureResponse => _ = null,
    inPopOver: js.UndefOr[Boolean] = js.undefined,
    mediaTypes: js.Array[String] = null,
    overlay: View = null,
    popoverView: View = null,
    saveToPhotoGallery: js.UndefOr[Boolean] = js.undefined,
    showControls: js.UndefOr[Boolean] = js.undefined,
    success: /* param0 */ CameraMediaItemType => _ = null,
    transform: Matrix2D = null,
    videoMaximumDuration: Int | Double = null,
    videoQuality: Int | Double = null,
    whichCamera: Int | Double = null
  ): CameraOptionsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (arrowDirection != null) __obj.updateDynamic("arrowDirection")(arrowDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(autohide)) __obj.updateDynamic("autohide")(autohide.asInstanceOf[js.Any])
    if (!js.isUndefined(autorotate)) __obj.updateDynamic("autorotate")(autorotate.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (!js.isUndefined(inPopOver)) __obj.updateDynamic("inPopOver")(inPopOver.asInstanceOf[js.Any])
    if (mediaTypes != null) __obj.updateDynamic("mediaTypes")(mediaTypes.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (popoverView != null) __obj.updateDynamic("popoverView")(popoverView.asInstanceOf[js.Any])
    if (!js.isUndefined(saveToPhotoGallery)) __obj.updateDynamic("saveToPhotoGallery")(saveToPhotoGallery.asInstanceOf[js.Any])
    if (!js.isUndefined(showControls)) __obj.updateDynamic("showControls")(showControls.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (videoMaximumDuration != null) __obj.updateDynamic("videoMaximumDuration")(videoMaximumDuration.asInstanceOf[js.Any])
    if (videoQuality != null) __obj.updateDynamic("videoQuality")(videoQuality.asInstanceOf[js.Any])
    if (whichCamera != null) __obj.updateDynamic("whichCamera")(whichCamera.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraOptionsType]
  }
}

