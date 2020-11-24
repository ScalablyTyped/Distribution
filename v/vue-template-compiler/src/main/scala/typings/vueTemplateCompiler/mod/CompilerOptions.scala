package typings.vueTemplateCompiler.mod

import typings.std.Record
import typings.vueTemplateCompiler.vueTemplateCompilerStrings.condense
import typings.vueTemplateCompiler.vueTemplateCompilerStrings.preserve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Template compilation options / results
  */
@js.native
trait CompilerOptions extends js.Object {
  
  var directives: js.UndefOr[Record[String, DirectiveFunction]] = js.native
  
  var modules: js.UndefOr[js.Array[ModuleOptions]] = js.native
  
  var outputSourceRange: js.UndefOr[js.Any] = js.native
  
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
  
  var whitespace: js.UndefOr[preserve | condense] = js.native
}
object CompilerOptions {
  
  @scala.inline
  def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  
  @scala.inline
  implicit class CompilerOptionsOps[Self <: CompilerOptions] (val x: Self) extends AnyVal {
    
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
    def setDirectives(value: Record[String, DirectiveFunction]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    
    @scala.inline
    def setModulesVarargs(value: ModuleOptions*): Self = this.set("modules", js.Array(value :_*))
    
    @scala.inline
    def setModules(value: js.Array[ModuleOptions]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setOutputSourceRange(value: js.Any): Self = this.set("outputSourceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputSourceRange: Self = this.set("outputSourceRange", js.undefined)
    
    @scala.inline
    def setPreserveWhitespace(value: Boolean): Self = this.set("preserveWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveWhitespace: Self = this.set("preserveWhitespace", js.undefined)
    
    @scala.inline
    def setWhitespace(value: preserve | condense): Self = this.set("whitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitespace: Self = this.set("whitespace", js.undefined)
  }
}
