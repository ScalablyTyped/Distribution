package typings
package atVueComponentDashCompilerDashUtilsLib.distCompileTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateCompileOptions extends js.Object {
  var compiler: atVueComponentDashCompilerDashUtilsLib.distTypesMod.VueTemplateCompiler
  var compilerOptions: js.UndefOr[atVueComponentDashCompilerDashUtilsLib.distTypesMod.VueTemplateCompilerOptions] = js.undefined
  var filename: java.lang.String
  var isFunctional: js.UndefOr[scala.Boolean] = js.undefined
  var isProduction: js.UndefOr[scala.Boolean] = js.undefined
  var optimizeSSR: js.UndefOr[scala.Boolean] = js.undefined
  var preprocessLang: js.UndefOr[java.lang.String] = js.undefined
  var preprocessOptions: js.UndefOr[js.Any] = js.undefined
  var prettify: js.UndefOr[scala.Boolean] = js.undefined
  var source: java.lang.String
  var transformAssetUrls: js.UndefOr[
    atVueComponentDashCompilerDashUtilsLib.distTemplateCompilerModulesAssetUrlMod.AssetURLOptions | scala.Boolean
  ] = js.undefined
  var transpileOptions: js.UndefOr[js.Any] = js.undefined
}

object TemplateCompileOptions {
  @scala.inline
  def apply(
    compiler: atVueComponentDashCompilerDashUtilsLib.distTypesMod.VueTemplateCompiler,
    filename: java.lang.String,
    source: java.lang.String,
    compilerOptions: atVueComponentDashCompilerDashUtilsLib.distTypesMod.VueTemplateCompilerOptions = null,
    isFunctional: js.UndefOr[scala.Boolean] = js.undefined,
    isProduction: js.UndefOr[scala.Boolean] = js.undefined,
    optimizeSSR: js.UndefOr[scala.Boolean] = js.undefined,
    preprocessLang: java.lang.String = null,
    preprocessOptions: js.Any = null,
    prettify: js.UndefOr[scala.Boolean] = js.undefined,
    transformAssetUrls: atVueComponentDashCompilerDashUtilsLib.distTemplateCompilerModulesAssetUrlMod.AssetURLOptions | scala.Boolean = null,
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

