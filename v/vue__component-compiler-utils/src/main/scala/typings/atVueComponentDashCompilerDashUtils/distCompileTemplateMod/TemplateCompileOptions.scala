package typings.atVueComponentDashCompilerDashUtils.distCompileTemplateMod

import typings.atVueComponentDashCompilerDashUtils.distTemplateCompilerModulesAssetUrlMod.AssetURLOptions
import typings.atVueComponentDashCompilerDashUtils.distTypesMod.VueTemplateCompiler
import typings.atVueComponentDashCompilerDashUtils.distTypesMod.VueTemplateCompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateCompileOptions extends js.Object {
  var compiler: VueTemplateCompiler
  var compilerOptions: js.UndefOr[VueTemplateCompilerOptions] = js.undefined
  var filename: String
  var isFunctional: js.UndefOr[Boolean] = js.undefined
  var isProduction: js.UndefOr[Boolean] = js.undefined
  var optimizeSSR: js.UndefOr[Boolean] = js.undefined
  var preprocessLang: js.UndefOr[String] = js.undefined
  var preprocessOptions: js.UndefOr[js.Any] = js.undefined
  var prettify: js.UndefOr[Boolean] = js.undefined
  var source: String
  var transformAssetUrls: js.UndefOr[AssetURLOptions | Boolean] = js.undefined
  var transpileOptions: js.UndefOr[js.Any] = js.undefined
}

object TemplateCompileOptions {
  @scala.inline
  def apply(
    compiler: VueTemplateCompiler,
    filename: String,
    source: String,
    compilerOptions: VueTemplateCompilerOptions = null,
    isFunctional: js.UndefOr[Boolean] = js.undefined,
    isProduction: js.UndefOr[Boolean] = js.undefined,
    optimizeSSR: js.UndefOr[Boolean] = js.undefined,
    preprocessLang: String = null,
    preprocessOptions: js.Any = null,
    prettify: js.UndefOr[Boolean] = js.undefined,
    transformAssetUrls: AssetURLOptions | Boolean = null,
    transpileOptions: js.Any = null
  ): TemplateCompileOptions = {
    val __obj = js.Dynamic.literal(compiler = compiler, filename = filename, source = source)
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions)
    if (!js.isUndefined(isFunctional)) __obj.updateDynamic("isFunctional")(isFunctional)
    if (!js.isUndefined(isProduction)) __obj.updateDynamic("isProduction")(isProduction)
    if (!js.isUndefined(optimizeSSR)) __obj.updateDynamic("optimizeSSR")(optimizeSSR)
    if (preprocessLang != null) __obj.updateDynamic("preprocessLang")(preprocessLang)
    if (preprocessOptions != null) __obj.updateDynamic("preprocessOptions")(preprocessOptions)
    if (!js.isUndefined(prettify)) __obj.updateDynamic("prettify")(prettify)
    if (transformAssetUrls != null) __obj.updateDynamic("transformAssetUrls")(transformAssetUrls.asInstanceOf[js.Any])
    if (transpileOptions != null) __obj.updateDynamic("transpileOptions")(transpileOptions)
    __obj.asInstanceOf[TemplateCompileOptions]
  }
}

