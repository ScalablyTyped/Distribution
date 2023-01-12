package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceInputName extends StObject {
  
  var attr: DtypeN
  
  var device: Unit
  
  var input: js.Array[String]
  
  var name: String
  
  var op: String
}
object DeviceInputName {
  
  inline def apply(attr: DtypeN, device: Unit, input: js.Array[String], name: String, op: String): DeviceInputName = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInputName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceInputName] (val x: Self) extends AnyVal {
    
    inline def setAttr(value: DtypeN): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: Unit): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setInput(value: js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
