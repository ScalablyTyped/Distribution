package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the bookmark button is pressed.
  */
@js.native
trait SearchBarBookmarkEvent extends SearchBarBaseEvent {
  
  /**
    * Value of the search bar.
    */
  var value: String = js.native
}
object SearchBarBookmarkEvent {
  
  @scala.inline
  def apply(source: SearchBar, value: String): SearchBarBookmarkEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarBookmarkEvent]
  }
  
  @scala.inline
  implicit class SearchBarBookmarkEventMutableBuilder[Self <: SearchBarBookmarkEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
