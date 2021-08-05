package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Globalization.Collation.CharacterGrouping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsCharacterGrouping extends StObject {
  
  /** The CharacterGrouping objects in the set that start at startIndex. */ var items: CharacterGrouping
  
  /** The number of objects returned. */ var returnValue: Double
}
object ItemsCharacterGrouping {
  
  inline def apply(items: CharacterGrouping, returnValue: Double): ItemsCharacterGrouping = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsCharacterGrouping]
  }
  
  extension [Self <: ItemsCharacterGrouping](x: Self) {
    
    inline def setItems(value: CharacterGrouping): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
