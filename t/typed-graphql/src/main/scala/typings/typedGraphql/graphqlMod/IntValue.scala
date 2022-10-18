package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntValue
  extends StObject
     with Node
     with Value {
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var value: String
}
object IntValue {
  
  inline def apply(kind: String, value: String): IntValue = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntValue]
  }
  
  extension [Self <: IntValue](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
