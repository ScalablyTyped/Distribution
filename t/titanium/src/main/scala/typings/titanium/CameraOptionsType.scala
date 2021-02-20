package typings.titanium

import typings.titanium.Titanium.UI.Matrix2D
import typings.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object for specifying options to [showCamera](Titanium.Media.showCamera).
  */
@js.native
trait CameraOptionsType extends StObject {
  
  /**
    * Specifies if the media should be editable after capture/selection.
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  
  /**
    * Function to call if the user presses the back button.
    */
  var androidback: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  
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
  var mediaTypes: js.UndefOr[js.Array[String]] = js.native
  
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
  implicit class CameraOptionsTypeMutableBuilder[Self <: CameraOptionsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
    
    @scala.inline
    def setAndroidback(value: /* param0 */ FailureResponse => Unit): Self = StObject.set(x, "androidback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAndroidbackUndefined: Self = StObject.set(x, "androidback", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setArrowDirection(value: Double): Self = StObject.set(x, "arrowDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowDirectionUndefined: Self = StObject.set(x, "arrowDirection", js.undefined)
    
    @scala.inline
    def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutohideUndefined: Self = StObject.set(x, "autohide", js.undefined)
    
    @scala.inline
    def setAutorotate(value: Boolean): Self = StObject.set(x, "autorotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutorotateUndefined: Self = StObject.set(x, "autorotate", js.undefined)
    
    @scala.inline
    def setCancel(value: /* param0 */ FailureResponse => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setError(value: /* param0 */ FailureResponse => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInPopOver(value: Boolean): Self = StObject.set(x, "inPopOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInPopOverUndefined: Self = StObject.set(x, "inPopOver", js.undefined)
    
    @scala.inline
    def setMediaTypes(value: js.Array[String]): Self = StObject.set(x, "mediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypesUndefined: Self = StObject.set(x, "mediaTypes", js.undefined)
    
    @scala.inline
    def setMediaTypesVarargs(value: String*): Self = StObject.set(x, "mediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setOverlay(value: View): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    @scala.inline
    def setPopoverView(value: View): Self = StObject.set(x, "popoverView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverViewUndefined: Self = StObject.set(x, "popoverView", js.undefined)
    
    @scala.inline
    def setSaveToPhotoGallery(value: Boolean): Self = StObject.set(x, "saveToPhotoGallery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveToPhotoGalleryUndefined: Self = StObject.set(x, "saveToPhotoGallery", js.undefined)
    
    @scala.inline
    def setShowControls(value: Boolean): Self = StObject.set(x, "showControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowControlsUndefined: Self = StObject.set(x, "showControls", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* param0 */ CameraMediaItemType => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTransform(value: Matrix2D): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setVideoMaximumDuration(value: Double): Self = StObject.set(x, "videoMaximumDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoMaximumDurationUndefined: Self = StObject.set(x, "videoMaximumDuration", js.undefined)
    
    @scala.inline
    def setVideoQuality(value: Double): Self = StObject.set(x, "videoQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoQualityUndefined: Self = StObject.set(x, "videoQuality", js.undefined)
    
    @scala.inline
    def setWhichCamera(value: Double): Self = StObject.set(x, "whichCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhichCameraUndefined: Self = StObject.set(x, "whichCamera", js.undefined)
  }
}
