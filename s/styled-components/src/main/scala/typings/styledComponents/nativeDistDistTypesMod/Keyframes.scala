package typings.styledComponents.nativeDistDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyframes
  extends StObject
     with _FlattenerResult[Any]
     with _Interpolation[Any] {
  
  var id: String
  
  var name: String
  
  var rules: String
}
object Keyframes {
  
  inline def apply(id: String, name: String, rules: String): Keyframes = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyframes]
  }
  
  extension [Self <: Keyframes](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRules(value: String): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
  }
}
