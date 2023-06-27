package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUComputePassTimestampWrites extends StObject {
  
  /**
    * If defined, indicates the query index in {@link GPURenderPassTimestampWrites#querySet} into
    * which the timestamp at the beginning of the compute pass will be written.
    */
  var beginningOfPassWriteIndex: js.UndefOr[GPUSize32] = js.undefined
  
  /**
    * If defined, indicates the query index in {@link GPURenderPassTimestampWrites#querySet} into
    * which the timestamp at the end of the compute pass will be written.
    */
  var endOfPassWriteIndex: js.UndefOr[GPUSize32] = js.undefined
  
  /**
    * The {@link GPUQuerySet}, of type {@link GPUQueryType#"timestamp"}, that the query results will be
    * written to.
    */
  var querySet: GPUQuerySet
}
object GPUComputePassTimestampWrites {
  
  inline def apply(querySet: GPUQuerySet): GPUComputePassTimestampWrites = {
    val __obj = js.Dynamic.literal(querySet = querySet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUComputePassTimestampWrites]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUComputePassTimestampWrites] (val x: Self) extends AnyVal {
    
    inline def setBeginningOfPassWriteIndex(value: GPUSize32): Self = StObject.set(x, "beginningOfPassWriteIndex", value.asInstanceOf[js.Any])
    
    inline def setBeginningOfPassWriteIndexUndefined: Self = StObject.set(x, "beginningOfPassWriteIndex", js.undefined)
    
    inline def setEndOfPassWriteIndex(value: GPUSize32): Self = StObject.set(x, "endOfPassWriteIndex", value.asInstanceOf[js.Any])
    
    inline def setEndOfPassWriteIndexUndefined: Self = StObject.set(x, "endOfPassWriteIndex", js.undefined)
    
    inline def setQuerySet(value: GPUQuerySet): Self = StObject.set(x, "querySet", value.asInstanceOf[js.Any])
  }
}
