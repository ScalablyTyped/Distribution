package typings.atVueComponentDashCompilerDashUtils.distTypesMod

import typings.atVueComponentDashCompilerDashUtils.distParseMod.SFCDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTemplateCompiler extends js.Object {
  def compile(template: String, options: VueTemplateCompilerOptions): VueTemplateCompilerResults = js.native
  def parseComponent(source: String): SFCDescriptor = js.native
  def parseComponent(source: String, options: js.Any): SFCDescriptor = js.native
  def ssrCompile(template: String, options: VueTemplateCompilerOptions): VueTemplateCompilerResults = js.native
}

