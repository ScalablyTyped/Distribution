package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchSizeNumber extends StObject {
  
  var batchSize: Double = js.native
}
object BatchSizeNumber {
  
  @scala.inline
  def apply(batchSize: Double): BatchSizeNumber = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchSizeNumber]
  }
  
  @scala.inline
  implicit class BatchSizeNumberMutableBuilder[Self <: BatchSizeNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
  }
}
