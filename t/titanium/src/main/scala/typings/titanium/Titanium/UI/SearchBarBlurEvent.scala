package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the search bar loses focus.
  */
@js.native
trait SearchBarBlurEvent extends SearchBarBaseEvent {
  
  /**
    * Value of the search bar.
    */
  var value: String = js.native
}
object SearchBarBlurEvent {
  
  @scala.inline
  def apply(source: SearchBar, value: String): SearchBarBlurEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarBlurEvent]
  }
  
  @scala.inline
  implicit class SearchBarBlurEventMutableBuilder[Self <: SearchBarBlurEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
