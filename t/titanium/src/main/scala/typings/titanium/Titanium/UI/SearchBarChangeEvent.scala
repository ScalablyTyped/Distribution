package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the value of the search bar changes.
  */
@js.native
trait SearchBarChangeEvent extends SearchBarBaseEvent {
  
  /**
    * Value of the search bar.
    */
  var value: String = js.native
}
object SearchBarChangeEvent {
  
  @scala.inline
  def apply(source: SearchBar, value: String): SearchBarChangeEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarChangeEvent]
  }
  
  @scala.inline
  implicit class SearchBarChangeEventMutableBuilder[Self <: SearchBarChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
