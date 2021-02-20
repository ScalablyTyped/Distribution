package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
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
  implicit class RefreshControlRefreshendEventMutableBuilder[Self <: RefreshControlRefreshendEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
  }
}
