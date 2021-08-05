package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpaceToBatchNDAttrs extends StObject {
  
  var blockShape: js.Array[Double]
  
  var paddings: js.Array[js.Array[Double]]
}
object SpaceToBatchNDAttrs {
  
  inline def apply(blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): SpaceToBatchNDAttrs = {
    val __obj = js.Dynamic.literal(blockShape = blockShape.asInstanceOf[js.Any], paddings = paddings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceToBatchNDAttrs]
  }
  
  extension [Self <: SpaceToBatchNDAttrs](x: Self) {
    
    inline def setBlockShape(value: js.Array[Double]): Self = StObject.set(x, "blockShape", value.asInstanceOf[js.Any])
    
    inline def setBlockShapeVarargs(value: Double*): Self = StObject.set(x, "blockShape", js.Array(value :_*))
    
    inline def setPaddings(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "paddings", value.asInstanceOf[js.Any])
    
    inline def setPaddingsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "paddings", js.Array(value :_*))
  }
}
