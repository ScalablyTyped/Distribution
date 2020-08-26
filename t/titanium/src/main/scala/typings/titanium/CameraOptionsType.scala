package typings.titanium

import typings.titanium.Titanium.UI.Matrix2D
import typings.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for specifying options to [showCamera](Titanium.Media.showCamera).
  */
@js.native
trait CameraOptionsType extends js.Object {
  /**
    * Specifies if the media should be editable after capture/selection.
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /**
    * Specifies if the dialog should be animated upon showing and hiding.
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * Controls the type of arrow and position of the popover.
    */
  var arrowDirection: js.UndefOr[Double] = js.native
  /**
    * Specifies if the camera should be hidden automatically after the media capture is completed.
    */
  var autohide: js.UndefOr[Boolean] = js.native
  /**
    * Determines if the camera preview should rotate or not.
    */
  var autorotate: js.UndefOr[Boolean] = js.native
  /**
    * Function to call if the user presses the cancel button.
    */
  var cancel: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  /**
    * Function to call upon receiving an error.
    */
  var error: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  /**
    * Show the camera in a popover.
    */
  var inPopOver: js.UndefOr[Boolean] = js.native
  /**
    * Array of media type constants to allow. Note: If you want to select live photos, iOS only  allows
    * you to select existing live photos from the gallery, capturing new live photos is not supported by
    * iOS public API, yet.
    */
  var mediaTypes: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * View to added as an overlay to the camera UI (on top).
    */
  var overlay: js.UndefOr[View] = js.native
  /**
    * View to position the camera or photo gallery popover on top of.
    */
  var popoverView: js.UndefOr[View] = js.native
  /**
    * Specifies if the media should be saved to the photo gallery upon successful capture.
    */
  var saveToPhotoGallery: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the built-in camera controls should be displayed.
    */
  var showControls: js.UndefOr[Boolean] = js.native
  /**
    * Function to call when the camera is closed after a successful capture/selection.
    */
  var success: js.UndefOr[js.Function1[/* param0 */ CameraMediaItemType, Unit]] = js.native
  /**
    * Transformation matrix to apply to the camera or photogallery view.
    */
  var transform: js.UndefOr[Matrix2D] = js.native
  /**
    * Maximum duration (in milliseconds) to allow video capture before completing.
    */
  var videoMaximumDuration: js.UndefOr[Double] = js.native
  /**
    * Constant to indicate the video quality during capture.
    */
  var videoQuality: js.UndefOr[Double] = js.native
  /**
    * Opens the camera with the specified camera direction.
    */
  var whichCamera: js.UndefOr[Double] = js.native
}

object CameraOptionsType {
  @scala.inline
  def apply(): CameraOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptionsType]
  }
  @scala.inline
  implicit class CameraOptionsTypeOps[Self <: CameraOptionsType] (val x: Self) extends AnyVal {
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
    def setAllowEditing(value: Boolean): Self = this.set("allowEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditing: Self = this.set("allowEditing", js.undefined)
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setArrowDirection(value: Double): Self = this.set("arrowDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowDirection: Self = this.set("arrowDirection", js.undefined)
    @scala.inline
    def setAutohide(value: Boolean): Self = this.set("autohide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutohide: Self = this.set("autohide", js.undefined)
    @scala.inline
    def setAutorotate(value: Boolean): Self = this.set("autorotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutorotate: Self = this.set("autorotate", js.undefined)
    @scala.inline
    def setCancel(value: /* param0 */ FailureResponse => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setError(value: /* param0 */ FailureResponse => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInPopOver(value: Boolean): Self = this.set("inPopOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInPopOver: Self = this.set("inPopOver", js.undefined)
    @scala.inline
    def setMediaTypesVarargs(value: java.lang.String*): Self = this.set("mediaTypes", js.Array(value :_*))
    @scala.inline
    def setMediaTypes(value: js.Array[java.lang.String]): Self = this.set("mediaTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaTypes: Self = this.set("mediaTypes", js.undefined)
    @scala.inline
    def setOverlay(value: View): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPopoverView(value: View): Self = this.set("popoverView", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverView: Self = this.set("popoverView", js.undefined)
    @scala.inline
    def setSaveToPhotoGallery(value: Boolean): Self = this.set("saveToPhotoGallery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveToPhotoGallery: Self = this.set("saveToPhotoGallery", js.undefined)
    @scala.inline
    def setShowControls(value: Boolean): Self = this.set("showControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowControls: Self = this.set("showControls", js.undefined)
    @scala.inline
    def setSuccess(value: /* param0 */ CameraMediaItemType => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTransform(value: Matrix2D): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setVideoMaximumDuration(value: Double): Self = this.set("videoMaximumDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoMaximumDuration: Self = this.set("videoMaximumDuration", js.undefined)
    @scala.inline
    def setVideoQuality(value: Double): Self = this.set("videoQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoQuality: Self = this.set("videoQuality", js.undefined)
    @scala.inline
    def setWhichCamera(value: Double): Self = this.set("whichCamera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhichCamera: Self = this.set("whichCamera", js.undefined)
  }
  
}

