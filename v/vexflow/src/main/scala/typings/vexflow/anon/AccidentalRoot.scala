package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccidentalRoot extends StObject {
  
  var accidental: String
  
  var root: String
  
  var `type`: String
}
object AccidentalRoot {
  
  inline def apply(accidental: String, root: String, `type`: String): AccidentalRoot = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccidentalRoot]
  }
  
  extension [Self <: AccidentalRoot](x: Self) {
    
    inline def setAccidental(value: String): Self = StObject.set(x, "accidental", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
