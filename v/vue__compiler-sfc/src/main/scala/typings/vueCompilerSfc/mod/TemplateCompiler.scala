package typings.vueCompilerSfc.mod

import typings.vueCompilerCore.mod.CodegenResult
import typings.vueCompilerCore.mod.CompilerOptions
import typings.vueCompilerCore.mod.ParserOptions
import typings.vueCompilerCore.mod.RootNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateCompiler extends StObject {
  
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
  implicit class TemplateCompilerMutableBuilder[Self <: TemplateCompiler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompile(value: (String, CompilerOptions) => CodegenResult): Self = StObject.set(x, "compile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParse(value: (String, ParserOptions) => RootNode): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
  }
}
