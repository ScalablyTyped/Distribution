package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set extends StObject {
  
  var set: Any
}
object Set {
  
  inline def apply(set: Any): Set = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Set]
  }
  
  extension [Self <: Set](x: Self) {
    
    inline def setSet(value: Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
