package typings
package vueDashLoaderLib.vueDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueLoaderOptions extends js.Object {
  var cacheDirectory: js.UndefOr[java.lang.String] = js.undefined
  var cacheIdentifier: js.UndefOr[java.lang.String] = js.undefined
  var compiler: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VueTemplateCompiler */ js.Any
  ] = js.undefined
  var compilerOptions: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CompilerOptions */ js.Any
  ] = js.undefined
  var exposeFilename: js.UndefOr[scala.Boolean] = js.undefined
  var hotReload: js.UndefOr[scala.Boolean] = js.undefined
  var optimizeSSR: js.UndefOr[scala.Boolean] = js.undefined
  var prettify: js.UndefOr[scala.Boolean] = js.undefined
  var productionMode: js.UndefOr[scala.Boolean] = js.undefined
  var shadowMode: js.UndefOr[scala.Boolean] = js.undefined
  var transformAssetUrls: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ] = js.undefined
  var transpileOptions: js.UndefOr[js.Object] = js.undefined
}

object VueLoaderOptions {
  @scala.inline
  def apply(
    cacheDirectory: java.lang.String = null,
    cacheIdentifier: java.lang.String = null,
    compiler: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify VueTemplateCompiler */ js.Any = null,
    compilerOptions: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CompilerOptions */ js.Any = null,
    exposeFilename: js.UndefOr[scala.Boolean] = js.undefined,
    hotReload: js.UndefOr[scala.Boolean] = js.undefined,
    optimizeSSR: js.UndefOr[scala.Boolean] = js.undefined,
    prettify: js.UndefOr[scala.Boolean] = js.undefined,
    productionMode: js.UndefOr[scala.Boolean] = js.undefined,
    shadowMode: js.UndefOr[scala.Boolean] = js.undefined,
    transformAssetUrls: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null,
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

