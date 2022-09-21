package typings.yaml.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var comment: String
  
  var range: typings.yaml.nodeMod.Range
  
  var `type`: typings.yaml.scalarMod.Scalar.Type | Null
  
  var value: String
}
object Value {
  
  inline def apply(comment: String, range: typings.yaml.nodeMod.Range, value: String): Value = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.yaml.nodeMod.Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.yaml.scalarMod.Scalar.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
