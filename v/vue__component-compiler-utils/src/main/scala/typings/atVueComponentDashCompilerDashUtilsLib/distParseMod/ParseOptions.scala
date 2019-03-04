package typings
package atVueComponentDashCompilerDashUtilsLib.distParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var compiler: atVueComponentDashCompilerDashUtilsLib.distTypesMod.VueTemplateCompiler
  var compilerParseOptions: js.UndefOr[
    atVueComponentDashCompilerDashUtilsLib.distTypesMod.VueTemplateCompilerParseOptions
  ] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var needMap: js.UndefOr[scala.Boolean] = js.undefined
  var source: java.lang.String
  var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    compiler: atVueComponentDashCompilerDashUtilsLib.distTypesMod.VueTemplateCompiler,
    source: java.lang.String,
    compilerParseOptions: atVueComponentDashCompilerDashUtilsLib.distTypesMod.VueTemplateCompilerParseOptions = null,
    filename: java.lang.String = null,
    needMap: js.UndefOr[scala.Boolean] = js.undefined,
    sourceRoot: java.lang.String = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal(compiler = compiler, source = source)
    if (compilerParseOptions != null) __obj.updateDynamic("compilerParseOptions")(compilerParseOptions)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(needMap)) __obj.updateDynamic("needMap")(needMap)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    __obj.asInstanceOf[ParseOptions]
  }
}

