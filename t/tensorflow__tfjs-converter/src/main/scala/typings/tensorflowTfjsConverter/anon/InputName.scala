package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputName extends StObject {
  
  var attr: Acdfunctioncontroloutput
  
  var input: Unit
  
  var name: String
  
  var op: String
}
object InputName {
  
  inline def apply(attr: Acdfunctioncontroloutput, input: Unit, name: String, op: String): InputName = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputName] (val x: Self) extends AnyVal {
    
    inline def setAttr(value: Acdfunctioncontroloutput): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Unit): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
