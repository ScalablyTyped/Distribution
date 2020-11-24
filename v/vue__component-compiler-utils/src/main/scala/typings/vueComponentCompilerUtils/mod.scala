package typings.vueComponentCompilerUtils

import typings.vueComponentCompilerUtils.compileStyleMod.StyleCompileOptions
import typings.vueComponentCompilerUtils.compileStyleMod.StyleCompileResults
import typings.vueComponentCompilerUtils.compileTemplateMod.TemplateCompileOptions
import typings.vueComponentCompilerUtils.compileTemplateMod.TemplateCompileResult
import typings.vueComponentCompilerUtils.parseMod.ParseOptions
import typings.vueComponentCompilerUtils.parseMod.SFCDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/component-compiler-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def compileStyle(options: StyleCompileOptions): StyleCompileResults = js.native
  
  def compileStyleAsync(options: StyleCompileOptions): js.Promise[StyleCompileResults] = js.native
  
  def compileTemplate(options: TemplateCompileOptions): TemplateCompileResult = js.native
  
  def parse(options: ParseOptions): SFCDescriptor = js.native
}
