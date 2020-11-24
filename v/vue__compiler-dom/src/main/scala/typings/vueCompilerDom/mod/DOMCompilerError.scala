package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.CompilerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMCompilerError extends CompilerError {
  
  @JSName("code")
  var code_DOMCompilerError: DOMErrorCodes = js.native
}
object DOMCompilerError {
  
  @scala.inline
  def apply(code: DOMErrorCodes, message: String, name: String): DOMCompilerError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMCompilerError]
  }
  
  @scala.inline
  implicit class DOMCompilerErrorOps[Self <: DOMCompilerError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: DOMErrorCodes): Self = this.set("code", value.asInstanceOf[js.Any])
  }
}
