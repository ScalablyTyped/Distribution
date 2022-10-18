package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keydtype extends StObject {
  
  var T: Unit
  
  var Tin: Unit
  
  var Tout: Unit
  
  var _acd_function_control_output: Unit
  
  var _has_manual_control_dependencies: B
  
  var container: S
  
  var dtype: Unit
  
  var key_dtype: Type
  
  var shared_name: S
  
  var use_node_name_sharing: B
  
  var value: Unit
  
  var value_dtype: Type
}
object Keydtype {
  
  inline def apply(
    T: Unit,
    Tin: Unit,
    Tout: Unit,
    _acd_function_control_output: Unit,
    _has_manual_control_dependencies: B,
    container: S,
    dtype: Unit,
    key_dtype: Type,
    shared_name: S,
    use_node_name_sharing: B,
    value: Unit,
    value_dtype: Type
  ): Keydtype = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], Tin = Tin.asInstanceOf[js.Any], Tout = Tout.asInstanceOf[js.Any], _acd_function_control_output = _acd_function_control_output.asInstanceOf[js.Any], _has_manual_control_dependencies = _has_manual_control_dependencies.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], key_dtype = key_dtype.asInstanceOf[js.Any], shared_name = shared_name.asInstanceOf[js.Any], use_node_name_sharing = use_node_name_sharing.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], value_dtype = value_dtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keydtype]
  }
  
  extension [Self <: Keydtype](x: Self) {
    
    inline def setContainer(value: S): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setDtype(value: Unit): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setKey_dtype(value: Type): Self = StObject.set(x, "key_dtype", value.asInstanceOf[js.Any])
    
    inline def setShared_name(value: S): Self = StObject.set(x, "shared_name", value.asInstanceOf[js.Any])
    
    inline def setT(value: Unit): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    
    inline def setTin(value: Unit): Self = StObject.set(x, "Tin", value.asInstanceOf[js.Any])
    
    inline def setTout(value: Unit): Self = StObject.set(x, "Tout", value.asInstanceOf[js.Any])
    
    inline def setUse_node_name_sharing(value: B): Self = StObject.set(x, "use_node_name_sharing", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValue_dtype(value: Type): Self = StObject.set(x, "value_dtype", value.asInstanceOf[js.Any])
    
    inline def set_acd_function_control_output(value: Unit): Self = StObject.set(x, "_acd_function_control_output", value.asInstanceOf[js.Any])
    
    inline def set_has_manual_control_dependencies(value: B): Self = StObject.set(x, "_has_manual_control_dependencies", value.asInstanceOf[js.Any])
  }
}
