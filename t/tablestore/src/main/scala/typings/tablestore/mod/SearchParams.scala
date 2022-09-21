package typings.tablestore.mod

import typings.tablestore.anon.GetTotalCount
import typings.tablestore.anon.ReturnNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchParams extends StObject {
  
  var columnToGet: ReturnNames
  
  var indexName: String
  
  var searchQuery: GetTotalCount
  
  var tableName: String
  
  var timeoutMs: js.UndefOr[Double] = js.undefined
}
object SearchParams {
  
  inline def apply(columnToGet: ReturnNames, indexName: String, searchQuery: GetTotalCount, tableName: String): SearchParams = {
    val __obj = js.Dynamic.literal(columnToGet = columnToGet.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], searchQuery = searchQuery.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParams]
  }
  
  extension [Self <: SearchParams](x: Self) {
    
    inline def setColumnToGet(value: ReturnNames): Self = StObject.set(x, "columnToGet", value.asInstanceOf[js.Any])
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setSearchQuery(value: GetTotalCount): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
  }
}
