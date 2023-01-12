package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Storage.Search.SortEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsSortEntry extends StObject {
  
  /** The sort entries in the collection that start at startIndex. */ var items: SortEntry
  
  /** The number of items retrieved. */ var returnValue: Double
}
object ItemsSortEntry {
  
  inline def apply(items: SortEntry, returnValue: Double): ItemsSortEntry = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsSortEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsSortEntry] (val x: Self) extends AnyVal {
    
    inline def setItems(value: SortEntry): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
