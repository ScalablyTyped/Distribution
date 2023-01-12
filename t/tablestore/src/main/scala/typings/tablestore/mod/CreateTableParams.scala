package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTableParams extends StObject {
  
  var indexMetas: js.UndefOr[js.Array[IndexMeta]] = js.undefined
  
  var reservedThroughput: ReservedThroughput
  
  var streamSpecification: js.UndefOr[StreamSpecification] = js.undefined
  
  var tableMeta: TableMeta
  
  var tableOptions: TableOptions
}
object CreateTableParams {
  
  inline def apply(reservedThroughput: ReservedThroughput, tableMeta: TableMeta, tableOptions: TableOptions): CreateTableParams = {
    val __obj = js.Dynamic.literal(reservedThroughput = reservedThroughput.asInstanceOf[js.Any], tableMeta = tableMeta.asInstanceOf[js.Any], tableOptions = tableOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTableParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTableParams] (val x: Self) extends AnyVal {
    
    inline def setIndexMetas(value: js.Array[IndexMeta]): Self = StObject.set(x, "indexMetas", value.asInstanceOf[js.Any])
    
    inline def setIndexMetasUndefined: Self = StObject.set(x, "indexMetas", js.undefined)
    
    inline def setIndexMetasVarargs(value: IndexMeta*): Self = StObject.set(x, "indexMetas", js.Array(value*))
    
    inline def setReservedThroughput(value: ReservedThroughput): Self = StObject.set(x, "reservedThroughput", value.asInstanceOf[js.Any])
    
    inline def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "streamSpecification", value.asInstanceOf[js.Any])
    
    inline def setStreamSpecificationUndefined: Self = StObject.set(x, "streamSpecification", js.undefined)
    
    inline def setTableMeta(value: TableMeta): Self = StObject.set(x, "tableMeta", value.asInstanceOf[js.Any])
    
    inline def setTableOptions(value: TableOptions): Self = StObject.set(x, "tableOptions", value.asInstanceOf[js.Any])
  }
}
