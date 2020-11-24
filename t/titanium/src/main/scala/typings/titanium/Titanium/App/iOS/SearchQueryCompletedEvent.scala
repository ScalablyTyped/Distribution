package typings.titanium.Titanium.App.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the query completes to inform you about it's success.
  * To receive items, use the `founditems` event.
  */
@js.native
trait SearchQueryCompletedEvent extends SearchQueryBaseEvent {
  
  /**
    * Error message, if any returned. Undefined otherwise.
    */
  var error: String = js.native
  
  /**
    * Indicates if the operation succeeded. Returns true if download succeeded, false otherwise.
    */
  var success: Boolean = js.native
}
object SearchQueryCompletedEvent {
  
  @scala.inline
  def apply(error: String, source: SearchQuery, success: Boolean): SearchQueryCompletedEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQueryCompletedEvent]
  }
  
  @scala.inline
  implicit class SearchQueryCompletedEventOps[Self <: SearchQueryCompletedEvent] (val x: Self) extends AnyVal {
    
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
