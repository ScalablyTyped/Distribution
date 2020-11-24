package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired in response to a user finished action to refresh the contents of the
  * table view, list view or scroll view.
  */
@js.native
trait RefreshControlRefreshendEvent extends RefreshControlBaseEvent {
  
  /**
    * This is false. This event does not bubble
    */
  var bubbles: Boolean = js.native
}
object RefreshControlRefreshendEvent {
  
  @scala.inline
  def apply(bubbles: Boolean, source: RefreshControl): RefreshControlRefreshendEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControlRefreshendEvent]
  }
  
  @scala.inline
  implicit class RefreshControlRefreshendEventOps[Self <: RefreshControlRefreshendEvent] (val x: Self) extends AnyVal {
    
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
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
  }
}
