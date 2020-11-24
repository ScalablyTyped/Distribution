package typings.vueCompilerSfc.mod

import typings.vueCompilerCore.mod.CodegenResult
import typings.vueCompilerCore.mod.CompilerOptions
import typings.vueCompilerCore.mod.ParserOptions
import typings.vueCompilerCore.mod.RootNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateCompiler extends js.Object {
  
  def compile(template: String, options: CompilerOptions): CodegenResult = js.native
  
  def parse(template: String, options: ParserOptions): RootNode = js.native
}
object TemplateCompiler {
  
  @scala.inline
  def apply(compile: (String, CompilerOptions) => CodegenResult, parse: (String, ParserOptions) => RootNode): TemplateCompiler = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction2(compile), parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[TemplateCompiler]
  }
  
  @scala.inline
  implicit class TemplateCompilerOps[Self <: TemplateCompiler] (val x: Self) extends AnyVal {
    
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
    def setCompile(value: (String, CompilerOptions) => CodegenResult): Self = this.set("compile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParse(value: (String, ParserOptions) => RootNode): Self = this.set("parse", js.Any.fromFunction2(value))
  }
}
