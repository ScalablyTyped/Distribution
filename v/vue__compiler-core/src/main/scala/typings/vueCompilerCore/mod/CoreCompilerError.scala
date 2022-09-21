package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.vueCompilerCore.mod.InferCompilerError because Already inherited */ trait CoreCompilerError
  extends StObject
     with CompilerError {
  
  @JSName("code")
  var code_CoreCompilerError: ErrorCodes
}
object CoreCompilerError {
  
  inline def apply(code: ErrorCodes, message: String, name: String): CoreCompilerError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreCompilerError]
  }
  
  extension [Self <: CoreCompilerError](x: Self) {
    
    inline def setCode(value: ErrorCodes): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
