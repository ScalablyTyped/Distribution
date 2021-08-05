package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadCastToAttrs extends StObject {
  
  var inputShape: js.Array[Double]
  
  var shape: js.Array[Double]
}
object BroadCastToAttrs {
  
  inline def apply(inputShape: js.Array[Double], shape: js.Array[Double]): BroadCastToAttrs = {
    val __obj = js.Dynamic.literal(inputShape = inputShape.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadCastToAttrs]
  }
  
  extension [Self <: BroadCastToAttrs](x: Self) {
    
    inline def setInputShape(value: js.Array[Double]): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
    
    inline def setInputShapeVarargs(value: Double*): Self = StObject.set(x, "inputShape", js.Array(value :_*))
    
    inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
  }
}
