package typings.yaml.anon

import typings.yaml.distNodesScalarMod.Scalar.PLAIN
import typings.yaml.distNodesScalarMod.Scalar.QUOTE_DOUBLE
import typings.yaml.distNodesScalarMod.Scalar.QUOTE_SINGLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var comment: String
  
  var range: typings.yaml.distNodesNodeMod.Range
  
  var `type`: PLAIN | QUOTE_DOUBLE | QUOTE_SINGLE | Null
  
  var value: String
}
object Type {
  
  inline def apply(comment: String, range: typings.yaml.distNodesNodeMod.Range, value: String): Type = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.yaml.distNodesNodeMod.Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: PLAIN | QUOTE_DOUBLE | QUOTE_SINGLE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
