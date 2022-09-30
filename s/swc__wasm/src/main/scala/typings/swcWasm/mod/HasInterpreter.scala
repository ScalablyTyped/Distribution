package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasInterpreter extends StObject {
  
  /**
    * e.g. `/usr/bin/node` for `#!/usr/bin/node`
    */
  var interpreter: String
}
object HasInterpreter {
  
  inline def apply(interpreter: String): HasInterpreter = {
    val __obj = js.Dynamic.literal(interpreter = interpreter.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasInterpreter]
  }
  
  extension [Self <: HasInterpreter](x: Self) {
    
    inline def setInterpreter(value: String): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
  }
}
