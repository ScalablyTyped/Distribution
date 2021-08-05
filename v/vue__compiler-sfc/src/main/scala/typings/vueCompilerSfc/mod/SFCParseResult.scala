package typings.vueCompilerSfc.mod

import typings.std.SyntaxError
import typings.vueCompilerCore.mod.CompilerError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCParseResult extends StObject {
  
  var descriptor: SFCDescriptor
  
  var errors: js.Array[CompilerError | SyntaxError]
}
object SFCParseResult {
  
  inline def apply(descriptor: SFCDescriptor, errors: js.Array[CompilerError | SyntaxError]): SFCParseResult = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCParseResult]
  }
  
  extension [Self <: SFCParseResult](x: Self) {
    
    inline def setDescriptor(value: SFCDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[CompilerError | SyntaxError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: (CompilerError | SyntaxError)*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
