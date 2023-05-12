package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dy extends StObject {
  
  var dy: Tensor4D
  
  var filter: Tensor3D
  
  var x: Tensor4D
}
object Dy {
  
  inline def apply(dy: Tensor4D, filter: Tensor3D, x: Tensor4D): Dy = {
    val __obj = js.Dynamic.literal(dy = dy.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dy] (val x: Self) extends AnyVal {
    
    inline def setDy(value: Tensor4D): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: Tensor3D): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setX(value: Tensor4D): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
