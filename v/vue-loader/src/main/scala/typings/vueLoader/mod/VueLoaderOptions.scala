package typings.vueLoader.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.typesMod.VueTemplateCompiler
import typings.vueTemplateCompiler.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueLoaderOptions extends js.Object {
  var cacheDirectory: js.UndefOr[String] = js.undefined
  var cacheIdentifier: js.UndefOr[String] = js.undefined
  var compiler: js.UndefOr[VueTemplateCompiler] = js.undefined
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
    compiler: VueTemplateCompiler = null,
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
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory.asInstanceOf[js.Any])
    if (cacheIdentifier != null) __obj.updateDynamic("cacheIdentifier")(cacheIdentifier.asInstanceOf[js.Any])
    if (compiler != null) __obj.updateDynamic("compiler")(compiler.asInstanceOf[js.Any])
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(exposeFilename)) __obj.updateDynamic("exposeFilename")(exposeFilename.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hotReload)) __obj.updateDynamic("hotReload")(hotReload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeSSR)) __obj.updateDynamic("optimizeSSR")(optimizeSSR.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prettify)) __obj.updateDynamic("prettify")(prettify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(productionMode)) __obj.updateDynamic("productionMode")(productionMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowMode)) __obj.updateDynamic("shadowMode")(shadowMode.get.asInstanceOf[js.Any])
    if (transformAssetUrls != null) __obj.updateDynamic("transformAssetUrls")(transformAssetUrls.asInstanceOf[js.Any])
    if (transpileOptions != null) __obj.updateDynamic("transpileOptions")(transpileOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueLoaderOptions]
  }
}

