package typings.vueComponentCompilerUtils

import typings.vueComponentCompilerUtils.compileStyleMod.StyleCompileOptions
import typings.vueComponentCompilerUtils.compileStyleMod.StyleCompileResults
import typings.vueComponentCompilerUtils.compileTemplateMod.TemplateCompileOptions
import typings.vueComponentCompilerUtils.compileTemplateMod.TemplateCompileResult
import typings.vueComponentCompilerUtils.parseMod.ParseOptions
import typings.vueComponentCompilerUtils.parseMod.SFCDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/component-compiler-utils", "compileStyle")
  @js.native
  def compileStyle(options: StyleCompileOptions): StyleCompileResults = js.native
  
  @JSImport("@vue/component-compiler-utils", "compileStyleAsync")
  @js.native
  def compileStyleAsync(options: StyleCompileOptions): js.Promise[StyleCompileResults] = js.native
  
  @JSImport("@vue/component-compiler-utils", "compileTemplate")
  @js.native
  def compileTemplate(options: TemplateCompileOptions): TemplateCompileResult = js.native
  
  @JSImport("@vue/component-compiler-utils", "parse")
  @js.native
  def parse(options: ParseOptions): SFCDescriptor = js.native
}
