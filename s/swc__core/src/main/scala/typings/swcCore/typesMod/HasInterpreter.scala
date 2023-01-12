package typings.swcCore.typesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasInterpreter] (val x: Self) extends AnyVal {
    
    inline def setInterpreter(value: String): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
  }
}
