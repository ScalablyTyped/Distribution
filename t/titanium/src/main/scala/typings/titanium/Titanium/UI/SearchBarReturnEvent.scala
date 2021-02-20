package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when keyboard search button is pressed.
  */
@js.native
trait SearchBarReturnEvent extends SearchBarBaseEvent {
  
  /**
    * Value of the search bar.
    */
  var value: String = js.native
}
object SearchBarReturnEvent {
  
  @scala.inline
  def apply(source: SearchBar, value: String): SearchBarReturnEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarReturnEvent]
  }
  
  @scala.inline
  implicit class SearchBarReturnEventMutableBuilder[Self <: SearchBarReturnEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
