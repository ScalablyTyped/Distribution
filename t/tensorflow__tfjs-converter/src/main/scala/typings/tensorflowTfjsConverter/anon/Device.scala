package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  var attr: Shape
  
  var device: Unit
  
  var input: Unit
  
  var name: String
  
  var op: String
}
object Device {
  
  inline def apply(attr: Shape, device: Unit, input: Unit, name: String, op: String): Device = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setAttr(value: Shape): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: Unit): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Unit): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
