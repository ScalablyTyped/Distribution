package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsStorageFile extends StObject {
  
  /** The items in the collection that start at startIndex. */ var items: StorageFile
  
  /** The number of items returned. */ var returnValue: Double
}
object ItemsStorageFile {
  
  inline def apply(items: StorageFile, returnValue: Double): ItemsStorageFile = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsStorageFile]
  }
  
  extension [Self <: ItemsStorageFile](x: Self) {
    
    inline def setItems(value: StorageFile): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
