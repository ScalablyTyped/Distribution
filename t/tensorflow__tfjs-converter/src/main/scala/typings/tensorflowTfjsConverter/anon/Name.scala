package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var attr: Tin
  
  var input: Unit
  
  var name: String
  
  var op: String
}
object Name {
  
  inline def apply(attr: Tin, input: Unit, name: String, op: String): Name = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setAttr(value: Tin): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Unit): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
