package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkSelectionContext extends StObject {
  
  var bulkSelectionContext: Any
  
  var tableProps: Any
}
object BulkSelectionContext {
  
  inline def apply(bulkSelectionContext: Any, tableProps: Any): BulkSelectionContext = {
    val __obj = js.Dynamic.literal(bulkSelectionContext = bulkSelectionContext.asInstanceOf[js.Any], tableProps = tableProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkSelectionContext]
  }
  
  extension [Self <: BulkSelectionContext](x: Self) {
    
    inline def setBulkSelectionContext(value: Any): Self = StObject.set(x, "bulkSelectionContext", value.asInstanceOf[js.Any])
    
    inline def setTableProps(value: Any): Self = StObject.set(x, "tableProps", value.asInstanceOf[js.Any])
  }
}
