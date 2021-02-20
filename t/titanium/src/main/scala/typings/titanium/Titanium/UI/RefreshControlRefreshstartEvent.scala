package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired in response to a user initiated an action to refresh the contents of the
  * table view, list view or scroll view.
  */
@js.native
trait RefreshControlRefreshstartEvent extends RefreshControlBaseEvent {
  
  /**
    * This is false. This event does not bubble
    */
  var bubbles: Boolean = js.native
}
object RefreshControlRefreshstartEvent {
  
  @scala.inline
  def apply(bubbles: Boolean, source: RefreshControl): RefreshControlRefreshstartEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControlRefreshstartEvent]
  }
  
  @scala.inline
  implicit class RefreshControlRefreshstartEventMutableBuilder[Self <: RefreshControlRefreshstartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
  }
}
