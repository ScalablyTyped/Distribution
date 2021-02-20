package typings.titanium

import typings.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object for specifying options to
  * [openPhotoGallery](Titanium.Media.openPhotoGallery).
  */
@js.native
trait PhotoGalleryOptionsType extends StObject {
  
  /**
    * Specifies if the media should be editable after capture/selection.
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies if the user should be able to select multiple photos.
    */
  var allowMultiple: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies if the video should be transcoded (using highest quality preset) . If set to false no video transcoding will be performed.
    */
  var allowTranscoding: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies if the dialog should be animated upon showing and hiding.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls the type of arrow and position of the popover.
    */
  var arrowDirection: js.UndefOr[Double] = js.native
  
  /**
    * Specifies if the photo gallery should be hidden automatically after the media
    * selection is completed.
    */
  var autohide: js.UndefOr[Boolean] = js.native
  
  /**
    * Function to call if the user presses the cancel button.
    */
  var cancel: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  
  /**
    * Function to call upon receiving an error.
    */
  var error: js.UndefOr[js.Function1[/* param0 */ FailureResponse, Unit]] = js.native
  
  /**
    * Array of media type constants to allow.
    * Live photos is only supported on the iOS platform, starting with iOS 9.1. If you want
    * to allow live photos with <Titanium.Media.MEDIA_TYPE_LIVEPHOTO>, you also need to specify
    * at least <Titanium.Media.MEDIA_TYPE_PHOTO> as a fallback. If you do not allow live
    * photos, they still can be selected, but will be represented as a normal static photo.
    */
  var mediaTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * View to position the photo gallery popover on top of.
    */
  var popoverView: js.UndefOr[View] = js.native
  
  /**
    * Specifies number of media item that can be selected.
    */
  var selectionLimit: js.UndefOr[Boolean] = js.native
  
  /**
    * Function to call when the photo gallery is closed after a successful selection.
    */
  var success: js.UndefOr[
    js.Function1[
      (/* param0 */ CameraMediaItemType) | (/* param0 */ CameraMediaMultipleItemsType), 
      Unit
    ]
  ] = js.native
}
object PhotoGalleryOptionsType {
  
  @scala.inline
  def apply(): PhotoGalleryOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhotoGalleryOptionsType]
  }
  
  @scala.inline
  implicit class PhotoGalleryOptionsTypeMutableBuilder[Self <: PhotoGalleryOptionsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
    
    @scala.inline
    def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
    
    @scala.inline
    def setAllowTranscoding(value: Boolean): Self = StObject.set(x, "allowTranscoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTranscodingUndefined: Self = StObject.set(x, "allowTranscoding", js.undefined)
    
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
    def setCancel(value: /* param0 */ FailureResponse => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setError(value: /* param0 */ FailureResponse => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setMediaTypes(value: js.Array[String]): Self = StObject.set(x, "mediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypesUndefined: Self = StObject.set(x, "mediaTypes", js.undefined)
    
    @scala.inline
    def setMediaTypesVarargs(value: String*): Self = StObject.set(x, "mediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setPopoverView(value: View): Self = StObject.set(x, "popoverView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverViewUndefined: Self = StObject.set(x, "popoverView", js.undefined)
    
    @scala.inline
    def setSelectionLimit(value: Boolean): Self = StObject.set(x, "selectionLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionLimitUndefined: Self = StObject.set(x, "selectionLimit", js.undefined)
    
    @scala.inline
    def setSuccess(value: (/* param0 */ CameraMediaItemType) | (/* param0 */ CameraMediaMultipleItemsType) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
