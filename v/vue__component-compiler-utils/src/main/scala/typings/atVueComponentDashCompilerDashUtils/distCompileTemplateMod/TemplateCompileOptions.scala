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
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(isFunctional)) __obj.updateDynamic("isFunctional")(isFunctional.asInstanceOf[js.Any])
    if (!js.isUndefined(isProduction)) __obj.updateDynamic("isProduction")(isProduction.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeSSR)) __obj.updateDynamic("optimizeSSR")(optimizeSSR.asInstanceOf[js.Any])
    if (preprocessLang != null) __obj.updateDynamic("preprocessLang")(preprocessLang.asInstanceOf[js.Any])
    if (preprocessOptions != null) __obj.updateDynamic("preprocessOptions")(preprocessOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(prettify)) __obj.updateDynamic("prettify")(prettify.asInstanceOf[js.Any])
    if (transformAssetUrls != null) __obj.updateDynamic("transformAssetUrls")(transformAssetUrls.asInstanceOf[js.Any])
    if (transpileOptions != null) __obj.updateDynamic("transpileOptions")(transpileOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateCompileOptions]
  }
}

