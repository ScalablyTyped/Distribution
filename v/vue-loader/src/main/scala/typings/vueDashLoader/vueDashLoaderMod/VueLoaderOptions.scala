package typings.vueDashLoader.vueDashLoaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueLoaderOptions extends js.Object {
  var cacheDirectory: js.UndefOr[String] = js.undefined
  var cacheIdentifier: js.UndefOr[String] = js.undefined
  var compiler: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VueTemplateCompiler */ js.Any
  ] = js.undefined
  var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
  var exposeFilename: js.UndefOr[Boolean] = js.undefined
  var hotReload: js.UndefOr[Boolean] = js.undefined
  var optimizeSSR: js.UndefOr[Boolean] = js.undefined
  var prettify: js.UndefOr[Boolean] = js.undefined
  var productionMode: js.UndefOr[Boolean] = js.undefined
  var shadowMode: js.UndefOr[Boolean] = js.undefined
  var transformAssetUrls: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  var transpileOptions: js.UndefOr[js.Object] = js.undefined
}

object VueLoaderOptions {
  @scala.inline
  def apply(
    cacheDirectory: String = null,
    cacheIdentifier: String = null,
    compiler: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VueTemplateCompiler */ js.Any = null,
    compilerOptions: CompilerOptions = null,
    exposeFilename: js.UndefOr[Boolean] = js.undefined,
    hotReload: js.UndefOr[Boolean] = js.undefined,
    optimizeSSR: js.UndefOr[Boolean] = js.undefined,
    prettify: js.UndefOr[Boolean] = js.undefined,
    productionMode: js.UndefOr[Boolean] = js.undefined,
    shadowMode: js.UndefOr[Boolean] = js.undefined,
    transformAssetUrls: StringDictionary[String | js.Array[String]] = null,
    transpileOptions: js.Object = null
  ): VueLoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory)
    if (cacheIdentifier != null) __obj.updateDynamic("cacheIdentifier")(cacheIdentifier)
    if (compiler != null) __obj.updateDynamic("compiler")(compiler)
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions)
    if (!js.isUndefined(exposeFilename)) __obj.updateDynamic("exposeFilename")(exposeFilename)
    if (!js.isUndefined(hotReload)) __obj.updateDynamic("hotReload")(hotReload)
    if (!js.isUndefined(optimizeSSR)) __obj.updateDynamic("optimizeSSR")(optimizeSSR)
    if (!js.isUndefined(prettify)) __obj.updateDynamic("prettify")(prettify)
    if (!js.isUndefined(productionMode)) __obj.updateDynamic("productionMode")(productionMode)
    if (!js.isUndefined(shadowMode)) __obj.updateDynamic("shadowMode")(shadowMode)
    if (transformAssetUrls != null) __obj.updateDynamic("transformAssetUrls")(transformAssetUrls)
    if (transpileOptions != null) __obj.updateDynamic("transpileOptions")(transpileOptions)
    __obj.asInstanceOf[VueLoaderOptions]
  }
}

