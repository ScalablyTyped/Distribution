package typings.tensorflowTfjsCore.distKernelNamesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BroadCastToAttrs] (val x: Self) extends AnyVal {
    
    inline def setInputShape(value: js.Array[Double]): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
    
    inline def setInputShapeVarargs(value: Double*): Self = StObject.set(x, "inputShape", js.Array(value*))
    
    inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
  }
}
