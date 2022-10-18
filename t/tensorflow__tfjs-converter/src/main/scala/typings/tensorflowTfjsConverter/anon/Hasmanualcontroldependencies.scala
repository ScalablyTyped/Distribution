package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hasmanualcontroldependencies extends StObject {
  
  var T: Unit
  
  var Tin: Unit
  
  var Tout: Unit
  
  var _has_manual_control_dependencies: Unit
  
  var dtype: Type
  
  var shape: Unit
  
  var value: Tensor
}
object Hasmanualcontroldependencies {
  
  inline def apply(
    T: Unit,
    Tin: Unit,
    Tout: Unit,
    _has_manual_control_dependencies: Unit,
    dtype: Type,
    shape: Unit,
    value: Tensor
  ): Hasmanualcontroldependencies = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], Tin = Tin.asInstanceOf[js.Any], Tout = Tout.asInstanceOf[js.Any], _has_manual_control_dependencies = _has_manual_control_dependencies.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hasmanualcontroldependencies]
  }
  
  extension [Self <: Hasmanualcontroldependencies](x: Self) {
    
    inline def setDtype(value: Type): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Unit): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setT(value: Unit): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    
    inline def setTin(value: Unit): Self = StObject.set(x, "Tin", value.asInstanceOf[js.Any])
    
    inline def setTout(value: Unit): Self = StObject.set(x, "Tout", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Tensor): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_has_manual_control_dependencies(value: Unit): Self = StObject.set(x, "_has_manual_control_dependencies", value.asInstanceOf[js.Any])
  }
}
