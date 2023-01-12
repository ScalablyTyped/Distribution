package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PhotoImportFindItemsResult::ItemImported event. */
trait PhotoImportItemImportedEventArgs extends StObject {
  
  /** Gets the imported item associated with the PhotoImportFindItemsResult::ItemImported event. */
  var importedItem: PhotoImportItem
}
object PhotoImportItemImportedEventArgs {
  
  inline def apply(importedItem: PhotoImportItem): PhotoImportItemImportedEventArgs = {
    val __obj = js.Dynamic.literal(importedItem = importedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportItemImportedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhotoImportItemImportedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setImportedItem(value: PhotoImportItem): Self = StObject.set(x, "importedItem", value.asInstanceOf[js.Any])
  }
}
