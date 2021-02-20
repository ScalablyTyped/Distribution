package typings.vueCompilerSfc.mod

import typings.std.SyntaxError
import typings.vueCompilerCore.mod.CompilerError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCParseResult extends StObject {
  
  var descriptor: SFCDescriptor = js.native
  
  var errors: js.Array[CompilerError | SyntaxError] = js.native
}
object SFCParseResult {
  
  @scala.inline
  def apply(descriptor: SFCDescriptor, errors: js.Array[CompilerError | SyntaxError]): SFCParseResult = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCParseResult]
  }
  
  @scala.inline
  implicit class SFCParseResultMutableBuilder[Self <: SFCParseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptor(value: SFCDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Array[CompilerError | SyntaxError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: (CompilerError | SyntaxError)*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
