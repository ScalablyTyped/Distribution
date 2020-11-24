package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object for specifying options to [openMusicLibrary](Titanium.Media.openMusicLibrary).
  */
@js.native
trait MusicLibraryOptionsType extends js.Object {
  
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
  implicit class MusicLibraryOptionsTypeOps[Self <: MusicLibraryOptionsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowMultipleSelections(value: Boolean): Self = this.set("allowMultipleSelections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultipleSelections: Self = this.set("allowMultipleSelections", js.undefined)
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setAutohide(value: Boolean): Self = this.set("autohide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutohide: Self = this.set("autohide", js.undefined)
    
    @scala.inline
    def setCancel(value: /* param0 */ FailureResponse => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setError(value: /* param0 */ FailureResponse => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setMediaTypesVarargs(value: Double*): Self = this.set("mediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setMediaTypes(value: Double | js.Array[Double]): Self = this.set("mediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaTypes: Self = this.set("mediaTypes", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* param0 */ MusicLibraryResponseType => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
