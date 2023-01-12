package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tout extends StObject {
  
  var T: Unit
  
  var Tin: Type
  
  var Tout: Type
  
  var _has_manual_control_dependencies: B
  
  var dtype: Unit
  
  var shape: Unit
  
  var value: Unit
}
object Tout {
  
  inline def apply(
    T: Unit,
    Tin: Type,
    Tout: Type,
    _has_manual_control_dependencies: B,
    dtype: Unit,
    shape: Unit,
    value: Unit
  ): Tout = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], Tin = Tin.asInstanceOf[js.Any], Tout = Tout.asInstanceOf[js.Any], _has_manual_control_dependencies = _has_manual_control_dependencies.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tout] (val x: Self) extends AnyVal {
    
    inline def setDtype(value: Unit): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Unit): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setT(value: Unit): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    
    inline def setTin(value: Type): Self = StObject.set(x, "Tin", value.asInstanceOf[js.Any])
    
    inline def setTout(value: Type): Self = StObject.set(x, "Tout", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_has_manual_control_dependencies(value: B): Self = StObject.set(x, "_has_manual_control_dependencies", value.asInstanceOf[js.Any])
  }
}
