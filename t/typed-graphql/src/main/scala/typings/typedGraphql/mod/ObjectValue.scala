package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectValue
  extends StObject
     with Node
     with Value {
  
  var fields: js.Array[ObjectField]
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
}
object ObjectValue {
  
  inline def apply(fields: js.Array[ObjectField], kind: String): ObjectValue = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectValue]
  }
  
  extension [Self <: ObjectValue](x: Self) {
    
    inline def setFields(value: js.Array[ObjectField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: ObjectField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
