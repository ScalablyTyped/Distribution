package typings.webpackBlocksTypescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var babelCore: js.UndefOr[String] = js.undefined
  var babelOptions: js.UndefOr[BabelOptions] = js.undefined
  var cacheDirectory: js.UndefOr[String] = js.undefined
  var compiler: js.UndefOr[String] = js.undefined
  var configFileName: js.UndefOr[String] = js.undefined
  var errorsAsWarnings: js.UndefOr[Boolean] = js.undefined
  var forceIsolatedModules: js.UndefOr[Boolean] = js.undefined
  var getCustomTransformers: js.UndefOr[String | CustomTransformersFunction] = js.undefined
  var ignoreDiagnostics: js.UndefOr[js.Array[Double]] = js.undefined
  var instance: js.UndefOr[String] = js.undefined
  var reportFiles: js.UndefOr[js.Array[String]] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var transpileOnly: js.UndefOr[Boolean] = js.undefined
  var useBabel: js.UndefOr[Boolean] = js.undefined
  var useCache: js.UndefOr[Boolean] = js.undefined
  var usePrecompiledFiles: js.UndefOr[Boolean] = js.undefined
  var useTranspileModule: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    babelCore: String = null,
    babelOptions: BabelOptions = null,
    cacheDirectory: String = null,
    compiler: String = null,
    configFileName: String = null,
    errorsAsWarnings: js.UndefOr[Boolean] = js.undefined,
    forceIsolatedModules: js.UndefOr[Boolean] = js.undefined,
    getCustomTransformers: String | CustomTransformersFunction = null,
    ignoreDiagnostics: js.Array[Double] = null,
    instance: String = null,
    reportFiles: js.Array[String] = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    transpileOnly: js.UndefOr[Boolean] = js.undefined,
    useBabel: js.UndefOr[Boolean] = js.undefined,
    useCache: js.UndefOr[Boolean] = js.undefined,
    usePrecompiledFiles: js.UndefOr[Boolean] = js.undefined,
    useTranspileModule: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (babelCore != null) __obj.updateDynamic("babelCore")(babelCore.asInstanceOf[js.Any])
    if (babelOptions != null) __obj.updateDynamic("babelOptions")(babelOptions.asInstanceOf[js.Any])
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory.asInstanceOf[js.Any])
    if (compiler != null) __obj.updateDynamic("compiler")(compiler.asInstanceOf[js.Any])
    if (configFileName != null) __obj.updateDynamic("configFileName")(configFileName.asInstanceOf[js.Any])
    if (!js.isUndefined(errorsAsWarnings)) __obj.updateDynamic("errorsAsWarnings")(errorsAsWarnings.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsolatedModules)) __obj.updateDynamic("forceIsolatedModules")(forceIsolatedModules.asInstanceOf[js.Any])
    if (getCustomTransformers != null) __obj.updateDynamic("getCustomTransformers")(getCustomTransformers.asInstanceOf[js.Any])
    if (ignoreDiagnostics != null) __obj.updateDynamic("ignoreDiagnostics")(ignoreDiagnostics.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (reportFiles != null) __obj.updateDynamic("reportFiles")(reportFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(transpileOnly)) __obj.updateDynamic("transpileOnly")(transpileOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(useBabel)) __obj.updateDynamic("useBabel")(useBabel.asInstanceOf[js.Any])
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.asInstanceOf[js.Any])
    if (!js.isUndefined(usePrecompiledFiles)) __obj.updateDynamic("usePrecompiledFiles")(usePrecompiledFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(useTranspileModule)) __obj.updateDynamic("useTranspileModule")(useTranspileModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

