package typings.vueCompilerSfc.mod

import typings.std.SyntaxError
import typings.vueCompilerCore.mod.CompilerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCParseResult extends js.Object {
  
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
  implicit class SFCParseResultOps[Self <: SFCParseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescriptor(value: SFCDescriptor): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: (CompilerError | SyntaxError)*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[CompilerError | SyntaxError]): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
}
