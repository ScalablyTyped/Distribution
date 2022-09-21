package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleRowResult extends StObject {
  
  var RequestId: String
  
  var consumed: Consumed
  
  var row: js.UndefOr[Row] = js.undefined
}
object SingleRowResult {
  
  inline def apply(RequestId: String, consumed: Consumed): SingleRowResult = {
    val __obj = js.Dynamic.literal(RequestId = RequestId.asInstanceOf[js.Any], consumed = consumed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleRowResult]
  }
  
  extension [Self <: SingleRowResult](x: Self) {
    
    inline def setConsumed(value: Consumed): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Row): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
