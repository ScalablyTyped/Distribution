package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchSizeNumber extends StObject {
  
  var batchSize: Double
}
object BatchSizeNumber {
  
  inline def apply(batchSize: Double): BatchSizeNumber = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchSizeNumber]
  }
  
  extension [Self <: BatchSizeNumber](x: Self) {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
  }
}
