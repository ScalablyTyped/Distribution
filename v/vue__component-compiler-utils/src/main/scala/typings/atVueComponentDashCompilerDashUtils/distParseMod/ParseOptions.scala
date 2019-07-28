package typings.atVueComponentDashCompilerDashUtils.distParseMod

import typings.atVueComponentDashCompilerDashUtils.distTypesMod.VueTemplateCompiler
import typings.atVueComponentDashCompilerDashUtils.distTypesMod.VueTemplateCompilerParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var compiler: VueTemplateCompiler
  var compilerParseOptions: js.UndefOr[VueTemplateCompilerParseOptions] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var needMap: js.UndefOr[Boolean] = js.undefined
  var source: String
  var sourceRoot: js.UndefOr[String] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    compiler: VueTemplateCompiler,
    source: String,
    compilerParseOptions: VueTemplateCompilerParseOptions = null,
    filename: String = null,
    needMap: js.UndefOr[Boolean] = js.undefined,
    sourceRoot: String = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal(compiler = compiler, source = source)
    if (compilerParseOptions != null) __obj.updateDynamic("compilerParseOptions")(compilerParseOptions)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(needMap)) __obj.updateDynamic("needMap")(needMap)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    __obj.asInstanceOf[ParseOptions]
  }
}

