package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Core.TimedMetadataTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsTimedMetadataTrack extends StObject {
  
  /** The timed metadata tracks that start at startIndex in the list. */ var items: TimedMetadataTrack
  
  /** The number of timed metadata tracks retrieved. */ var returnValue: Double
}
object ItemsTimedMetadataTrack {
  
  inline def apply(items: TimedMetadataTrack, returnValue: Double): ItemsTimedMetadataTrack = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsTimedMetadataTrack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsTimedMetadataTrack] (val x: Self) extends AnyVal {
    
    inline def setItems(value: TimedMetadataTrack): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
