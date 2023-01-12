package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatherV2Attrs extends StObject {
  
  var axis: Double
  
  var batchDims: Double
}
object GatherV2Attrs {
  
  inline def apply(axis: Double, batchDims: Double): GatherV2Attrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], batchDims = batchDims.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatherV2Attrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GatherV2Attrs] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setBatchDims(value: Double): Self = StObject.set(x, "batchDims", value.asInstanceOf[js.Any])
  }
}
