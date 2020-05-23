package typings.vueComponentCompilerUtils.parseMod

import typings.vueComponentCompilerUtils.typesMod.VueTemplateCompiler
import typings.vueComponentCompilerUtils.typesMod.VueTemplateCompilerParseOptions
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
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (compilerParseOptions != null) __obj.updateDynamic("compilerParseOptions")(compilerParseOptions.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(needMap)) __obj.updateDynamic("needMap")(needMap.get.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

