package typings.atVueComponentDashCompilerDashUtils

import typings.atVueComponentDashCompilerDashUtils.distCompileStyleMod.StyleCompileOptions
import typings.atVueComponentDashCompilerDashUtils.distCompileStyleMod.StyleCompileResults
import typings.atVueComponentDashCompilerDashUtils.distCompileTemplateMod.TemplateCompileOptions
import typings.atVueComponentDashCompilerDashUtils.distCompileTemplateMod.TemplateCompileResult
import typings.atVueComponentDashCompilerDashUtils.distParseMod.ParseOptions
import typings.atVueComponentDashCompilerDashUtils.distParseMod.SFCDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@vue/component-compiler-utils", JSImport.Namespace)
@js.native
object atVueComponentDashCompilerDashUtilsMod extends js.Object {
  def compileStyle(options: StyleCompileOptions): StyleCompileResults = js.native
  def compileStyleAsync(options: StyleCompileOptions): js.Promise[StyleCompileResults] = js.native
  def compileTemplate(options: TemplateCompileOptions): TemplateCompileResult = js.native
  def parse(options: ParseOptions): SFCDescriptor = js.native
}

