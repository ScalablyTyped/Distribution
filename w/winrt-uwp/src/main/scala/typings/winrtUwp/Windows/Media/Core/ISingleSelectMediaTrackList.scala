package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media track list that allows a single item to be selected at a time. */
trait ISingleSelectMediaTrackList extends StObject {
  
  /** Gets or set the currently selected media track in the list. */
  var selectedIndex: Double
}
object ISingleSelectMediaTrackList {
  
  inline def apply(selectedIndex: Double): ISingleSelectMediaTrackList = {
    val __obj = js.Dynamic.literal(selectedIndex = selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISingleSelectMediaTrackList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISingleSelectMediaTrackList] (val x: Self) extends AnyVal {
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
  }
}
