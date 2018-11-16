package typings
package atVueComponentDashCompilerDashUtilsLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTemplateCompiler extends js.Object {
  def compile(template: java.lang.String, options: VueTemplateCompilerOptions): VueTemplateCompilerResults = js.native
  def parseComponent(source: java.lang.String): atVueComponentDashCompilerDashUtilsLib.distParseMod.SFCDescriptor = js.native
  def parseComponent(source: java.lang.String, options: js.Any): atVueComponentDashCompilerDashUtilsLib.distParseMod.SFCDescriptor = js.native
  def ssrCompile(template: java.lang.String, options: VueTemplateCompilerOptions): VueTemplateCompilerResults = js.native
}

