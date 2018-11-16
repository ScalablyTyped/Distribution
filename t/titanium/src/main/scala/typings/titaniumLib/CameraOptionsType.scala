package typings
package titaniumLib

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
  var allowEditing: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specifies if the dialog should be animated upon showing and hiding.
  	 */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Controls the type of arrow and position of the popover.
  	 */
  var arrowDirection: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Specifies if the camera should be hidden automatically after the media capture is completed.
  	 */
  var autohide: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Determines if the camera preview should rotate or not.
  	 */
  var autorotate: js.UndefOr[scala.Boolean] = js.undefined
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
  var inPopOver: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Array of media type constants to allow. Note: If you want to select live photos, iOS only  allows
  	 * you to select existing live photos from the gallery, capturing new live photos is not supported by
  	 * iOS public API, yet.
  	 */
  var mediaTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * View to added as an overlay to the camera UI (on top).
  	 */
  var overlay: js.UndefOr[titaniumLib.TitaniumNs.UINs.View] = js.undefined
  /**
  	 * View to position the camera or photo gallery popover on top of.
  	 */
  var popoverView: js.UndefOr[titaniumLib.TitaniumNs.UINs.View] = js.undefined
  /**
  	 * Specifies if the media should be saved to the photo gallery upon successful capture.
  	 */
  var saveToPhotoGallery: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indicates if the built-in camera controls should be displayed.
  	 */
  var showControls: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Function to call when the camera is closed after a successful capture/selection.
  	 */
  var success: js.UndefOr[js.Function1[/* param0 */ CameraMediaItemType, _]] = js.undefined
  /**
  	 * Transformation matrix to apply to the camera or photogallery view.
  	 */
  var transform: js.UndefOr[titaniumLib.TitaniumNs.UINs.Matrix2D] = js.undefined
  /**
  	 * Maximum duration (in milliseconds) to allow video capture before completing.
  	 */
  var videoMaximumDuration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Constant to indicate the video quality during capture.
  	 */
  var videoQuality: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Opens the camera with the specified camera direction.
  	 */
  var whichCamera: js.UndefOr[scala.Double] = js.undefined
}

