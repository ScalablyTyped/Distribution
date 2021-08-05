package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Core.AudioTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsReturnValue extends StObject {
  
  /** The audio tracks that start at startIndex in the list. */ var items: AudioTrack
  
  /** The number of audio tracks retrieved. */ var returnValue: Double
}
object ItemsReturnValue {
  
  inline def apply(items: AudioTrack, returnValue: Double): ItemsReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsReturnValue]
  }
  
  extension [Self <: ItemsReturnValue](x: Self) {
    
    inline def setItems(value: AudioTrack): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
