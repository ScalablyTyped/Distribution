package typings.winrtUwp.Windows.Media.Import

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PhotoImportFindItemsResult::SelectionChanged event. */
trait PhotoImportSelectionChangedEventArgs extends StObject {
  
  /** Gets a value indicating whether no items are selected after the selection has changed. */
  var isSelectionEmpty: Boolean
}
object PhotoImportSelectionChangedEventArgs {
  
  inline def apply(isSelectionEmpty: Boolean): PhotoImportSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(isSelectionEmpty = isSelectionEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportSelectionChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhotoImportSelectionChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setIsSelectionEmpty(value: Boolean): Self = StObject.set(x, "isSelectionEmpty", value.asInstanceOf[js.Any])
  }
}
