package typings.tablestore.mod

import typings.tablestore.anon.PartialTableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableParams extends StObject {
  
  var reservedThroughput: js.UndefOr[ReservedThroughput] = js.undefined
  
  var streamSpecification: js.UndefOr[StreamSpecification] = js.undefined
  
  var tableName: String
  
  var tableOptions: PartialTableOptions
}
object UpdateTableParams {
  
  inline def apply(tableName: String, tableOptions: PartialTableOptions): UpdateTableParams = {
    val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any], tableOptions = tableOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTableParams] (val x: Self) extends AnyVal {
    
    inline def setReservedThroughput(value: ReservedThroughput): Self = StObject.set(x, "reservedThroughput", value.asInstanceOf[js.Any])
    
    inline def setReservedThroughputUndefined: Self = StObject.set(x, "reservedThroughput", js.undefined)
    
    inline def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "streamSpecification", value.asInstanceOf[js.Any])
    
    inline def setStreamSpecificationUndefined: Self = StObject.set(x, "streamSpecification", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableOptions(value: PartialTableOptions): Self = StObject.set(x, "tableOptions", value.asInstanceOf[js.Any])
  }
}
