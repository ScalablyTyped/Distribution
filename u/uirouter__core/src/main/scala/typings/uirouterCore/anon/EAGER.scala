package typings.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EAGER extends StObject {
  
  var EAGER: String
  
  var LAZY: String
}
object EAGER {
  
  inline def apply(EAGER: String, LAZY: String): EAGER = {
    val __obj = js.Dynamic.literal(EAGER = EAGER.asInstanceOf[js.Any], LAZY = LAZY.asInstanceOf[js.Any])
    __obj.asInstanceOf[EAGER]
  }
  
  extension [Self <: EAGER](x: Self) {
    
    inline def setEAGER(value: String): Self = StObject.set(x, "EAGER", value.asInstanceOf[js.Any])
    
    inline def setLAZY(value: String): Self = StObject.set(x, "LAZY", value.asInstanceOf[js.Any])
  }
}
