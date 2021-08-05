package typings.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NOWAIT extends StObject {
  
  var NOWAIT: String
  
  var WAIT: String
}
object NOWAIT {
  
  inline def apply(NOWAIT: String, WAIT: String): NOWAIT = {
    val __obj = js.Dynamic.literal(NOWAIT = NOWAIT.asInstanceOf[js.Any], WAIT = WAIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOWAIT]
  }
  
  extension [Self <: NOWAIT](x: Self) {
    
    inline def setNOWAIT(value: String): Self = StObject.set(x, "NOWAIT", value.asInstanceOf[js.Any])
    
    inline def setWAIT(value: String): Self = StObject.set(x, "WAIT", value.asInstanceOf[js.Any])
  }
}
