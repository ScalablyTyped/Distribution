package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var grads: NamedTensorMap
  
  var value: Scalar
}
object Value {
  
  inline def apply(grads: NamedTensorMap, value: Scalar): Value = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setGrads(value: NamedTensorMap): Self = StObject.set(x, "grads", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Scalar): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
