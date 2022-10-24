package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Helpers extends StObject {
  
  var helpers: BulkSelectionState
  
  var notSelectedIds: Null
  
  var selectedIds: Any
}
object Helpers {
  
  inline def apply(helpers: BulkSelectionState, notSelectedIds: Null, selectedIds: Any): Helpers = {
    val __obj = js.Dynamic.literal(helpers = helpers.asInstanceOf[js.Any], notSelectedIds = notSelectedIds.asInstanceOf[js.Any], selectedIds = selectedIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Helpers]
  }
  
  extension [Self <: Helpers](x: Self) {
    
    inline def setHelpers(value: BulkSelectionState): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    inline def setNotSelectedIds(value: Null): Self = StObject.set(x, "notSelectedIds", value.asInstanceOf[js.Any])
    
    inline def setSelectedIds(value: Any): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
  }
}
