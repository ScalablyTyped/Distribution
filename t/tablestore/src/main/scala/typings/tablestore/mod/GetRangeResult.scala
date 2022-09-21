package typings.tablestore.mod

import typings.node.bufferMod.global.Buffer
import typings.tablestore.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRangeResult extends StObject {
  
  var RequestId: String
  
  var compressType: js.UndefOr[Double] = js.undefined
  
  var consumed: Consumed
  
  var dataBlockType: js.UndefOr[Double] = js.undefined
  
  var nextStartPrimaryKey: js.UndefOr[PrimaryKeyOutput] = js.undefined
  
  var nextToken: js.UndefOr[Buffer] = js.undefined
  
  var rows: js.Array[Row]
}
object GetRangeResult {
  
  inline def apply(RequestId: String, consumed: Consumed, rows: js.Array[Row]): GetRangeResult = {
    val __obj = js.Dynamic.literal(RequestId = RequestId.asInstanceOf[js.Any], consumed = consumed.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRangeResult]
  }
  
  extension [Self <: GetRangeResult](x: Self) {
    
    inline def setCompressType(value: Double): Self = StObject.set(x, "compressType", value.asInstanceOf[js.Any])
    
    inline def setCompressTypeUndefined: Self = StObject.set(x, "compressType", js.undefined)
    
    inline def setConsumed(value: Consumed): Self = StObject.set(x, "consumed", value.asInstanceOf[js.Any])
    
    inline def setDataBlockType(value: Double): Self = StObject.set(x, "dataBlockType", value.asInstanceOf[js.Any])
    
    inline def setDataBlockTypeUndefined: Self = StObject.set(x, "dataBlockType", js.undefined)
    
    inline def setNextStartPrimaryKey(value: PrimaryKeyOutput): Self = StObject.set(x, "nextStartPrimaryKey", value.asInstanceOf[js.Any])
    
    inline def setNextStartPrimaryKeyUndefined: Self = StObject.set(x, "nextStartPrimaryKey", js.undefined)
    
    inline def setNextStartPrimaryKeyVarargs(value: Name*): Self = StObject.set(x, "nextStartPrimaryKey", js.Array(value*))
    
    inline def setNextToken(value: Buffer): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
