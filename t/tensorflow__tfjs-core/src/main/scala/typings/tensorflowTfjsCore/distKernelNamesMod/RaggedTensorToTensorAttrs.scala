package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaggedTensorToTensorAttrs extends StObject {
  
  var rowPartitionTypes: js.Array[String]
}
object RaggedTensorToTensorAttrs {
  
  inline def apply(rowPartitionTypes: js.Array[String]): RaggedTensorToTensorAttrs = {
    val __obj = js.Dynamic.literal(rowPartitionTypes = rowPartitionTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaggedTensorToTensorAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RaggedTensorToTensorAttrs] (val x: Self) extends AnyVal {
    
    inline def setRowPartitionTypes(value: js.Array[String]): Self = StObject.set(x, "rowPartitionTypes", value.asInstanceOf[js.Any])
    
    inline def setRowPartitionTypesVarargs(value: String*): Self = StObject.set(x, "rowPartitionTypes", js.Array(value*))
  }
}
