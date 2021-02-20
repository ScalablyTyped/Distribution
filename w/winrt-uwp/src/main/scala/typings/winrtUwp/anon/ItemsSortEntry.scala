package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Storage.Search.SortEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsSortEntry extends StObject {
  
  /** The sort entries in the collection that start at startIndex. */ var items: SortEntry = js.native
  
  /** The number of items retrieved. */ var returnValue: Double = js.native
}
object ItemsSortEntry {
  
  @scala.inline
  def apply(items: SortEntry, returnValue: Double): ItemsSortEntry = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsSortEntry]
  }
  
  @scala.inline
  implicit class ItemsSortEntryMutableBuilder[Self <: ItemsSortEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: SortEntry): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
