package typings.tsLoader.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compiler extends js.Object {
  
  var compiler: js.UndefOr[Typeoftypescript] = js.native
  
  var compilerCompatible: Boolean = js.native
  
  var compilerDetailsLogMessage: js.UndefOr[String] = js.native
  
  var errorMessage: js.UndefOr[String] = js.native
}
object Compiler {
  
  @scala.inline
  def apply(compilerCompatible: Boolean): Compiler = {
    val __obj = js.Dynamic.literal(compilerCompatible = compilerCompatible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
  
  @scala.inline
  implicit class CompilerOps[Self <: Compiler] (val x: Self) extends AnyVal {
    
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
    def setCompilerCompatible(value: Boolean): Self = this.set("compilerCompatible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompiler(value: Typeoftypescript): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiler: Self = this.set("compiler", js.undefined)
    
    @scala.inline
    def setCompilerDetailsLogMessage(value: String): Self = this.set("compilerDetailsLogMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilerDetailsLogMessage: Self = this.set("compilerDetailsLogMessage", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
  }
}
