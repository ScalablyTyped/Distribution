package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object for specifying options to [openMusicLibrary](Titanium.Media.openMusicLibrary).
  */
@js.native
trait MusicLibraryOptionsType extends StObject {
  
  /**
    * Set to `true` to allow the user to select multiple items from the library.
    */
  var allowMultipleSelections: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the dialog should be animated when showing and hiding.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies that the library should be hidden automatically after media selection is completed.
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
    * An array of media type constants defining selectable media.
    */
  var mediaTypes: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * Function to call when the music library selection is made.
    */
  var success: js.UndefOr[js.Function1[/* param0 */ MusicLibraryResponseType, Unit]] = js.native
}
object MusicLibraryOptionsType {
  
  @scala.inline
  def apply(): MusicLibraryOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MusicLibraryOptionsType]
  }
  
  @scala.inline
  implicit class MusicLibraryOptionsTypeMutableBuilder[Self <: MusicLibraryOptionsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowMultipleSelections(value: Boolean): Self = StObject.set(x, "allowMultipleSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMultipleSelectionsUndefined: Self = StObject.set(x, "allowMultipleSelections", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
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
    def setMediaTypes(value: Double | js.Array[Double]): Self = StObject.set(x, "mediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaTypesUndefined: Self = StObject.set(x, "mediaTypes", js.undefined)
    
    @scala.inline
    def setMediaTypesVarargs(value: Double*): Self = StObject.set(x, "mediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* param0 */ MusicLibraryResponseType => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
