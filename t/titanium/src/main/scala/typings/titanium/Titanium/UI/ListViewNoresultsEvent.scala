package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the search using either [searchView](Titanium.UI.ListView.searchView) or [searchText](Titanium.UI.ListView.searchText) has no results.
  */
@js.native
trait ListViewNoresultsEvent extends ListViewBaseEvent {
  
  /**
    * false. This event does not bubble.
    */
  var bubbles: Boolean = js.native
}
object ListViewNoresultsEvent {
  
  @scala.inline
  def apply(bubbles: Boolean, source: ListView): ListViewNoresultsEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewNoresultsEvent]
  }
  
  @scala.inline
  implicit class ListViewNoresultsEventMutableBuilder[Self <: ListViewNoresultsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
  }
}
