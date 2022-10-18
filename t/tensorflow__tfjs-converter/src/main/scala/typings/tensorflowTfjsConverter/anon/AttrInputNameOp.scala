package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrInputNameOp extends StObject {
  
  var attr: Sharedname
  
  var input: js.Array[String]
  
  var name: String
  
  var op: String
}
object AttrInputNameOp {
  
  inline def apply(attr: Sharedname, input: js.Array[String], name: String, op: String): AttrInputNameOp = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrInputNameOp]
  }
  
  extension [Self <: AttrInputNameOp](x: Self) {
    
    inline def setAttr(value: Sharedname): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setInput(value: js.Array[String]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputVarargs(value: String*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
