package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the search bar gains focus.
  */
@js.native
trait SearchBarFocusEvent extends SearchBarBaseEvent {
  
  /**
    * Value of the search bar.
    */
  var value: String = js.native
}
object SearchBarFocusEvent {
  
  @scala.inline
  def apply(source: SearchBar, value: String): SearchBarFocusEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarFocusEvent]
  }
  
  @scala.inline
  implicit class SearchBarFocusEventMutableBuilder[Self <: SearchBarFocusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
