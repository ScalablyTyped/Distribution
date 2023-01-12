package typings.tablestore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTableResult extends StObject {
  
  var reservedThroughputDetails: ReservedThroughput
  
  var shard_splits: Any
  
  var streamDetails: StreamSpecification
  
  var tableMeta: TableMeta
  
  var tableOptions: TableOptions
}
object DescribeTableResult {
  
  inline def apply(
    reservedThroughputDetails: ReservedThroughput,
    shard_splits: Any,
    streamDetails: StreamSpecification,
    tableMeta: TableMeta,
    tableOptions: TableOptions
  ): DescribeTableResult = {
    val __obj = js.Dynamic.literal(reservedThroughputDetails = reservedThroughputDetails.asInstanceOf[js.Any], shard_splits = shard_splits.asInstanceOf[js.Any], streamDetails = streamDetails.asInstanceOf[js.Any], tableMeta = tableMeta.asInstanceOf[js.Any], tableOptions = tableOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTableResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTableResult] (val x: Self) extends AnyVal {
    
    inline def setReservedThroughputDetails(value: ReservedThroughput): Self = StObject.set(x, "reservedThroughputDetails", value.asInstanceOf[js.Any])
    
    inline def setShard_splits(value: Any): Self = StObject.set(x, "shard_splits", value.asInstanceOf[js.Any])
    
    inline def setStreamDetails(value: StreamSpecification): Self = StObject.set(x, "streamDetails", value.asInstanceOf[js.Any])
    
    inline def setTableMeta(value: TableMeta): Self = StObject.set(x, "tableMeta", value.asInstanceOf[js.Any])
    
    inline def setTableOptions(value: TableOptions): Self = StObject.set(x, "tableOptions", value.asInstanceOf[js.Any])
  }
}
