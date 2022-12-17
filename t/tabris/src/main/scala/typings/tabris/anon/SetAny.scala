package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAny extends StObject {
  
  var set: Any
}
object SetAny {
  
  inline def apply(set: Any): SetAny = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAny]
  }
  
  extension [Self <: SetAny](x: Self) {
    
    inline def setSet(value: Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
