package typings.vueCompilerSfc.mod

import typings.vueCompilerCore.mod.CodegenResult
import typings.vueCompilerCore.mod.CompilerOptions
import typings.vueCompilerCore.mod.ParserOptions
import typings.vueCompilerCore.mod.RootNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateCompiler extends StObject {
  
  def compile(template: String, options: CompilerOptions): CodegenResult
  
  def parse(template: String, options: ParserOptions): RootNode
}
object TemplateCompiler {
  
  inline def apply(compile: (String, CompilerOptions) => CodegenResult, parse: (String, ParserOptions) => RootNode): TemplateCompiler = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction2(compile), parse = js.Any.fromFunction2(parse))
    __obj.asInstanceOf[TemplateCompiler]
  }
  
  extension [Self <: TemplateCompiler](x: Self) {
    
    inline def setCompile(value: (String, CompilerOptions) => CodegenResult): Self = StObject.set(x, "compile", js.Any.fromFunction2(value))
    
    inline def setParse(value: (String, ParserOptions) => RootNode): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
  }
}
