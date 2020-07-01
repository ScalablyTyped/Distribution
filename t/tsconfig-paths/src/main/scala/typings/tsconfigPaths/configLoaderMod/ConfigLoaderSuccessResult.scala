package typings.tsconfigPaths.configLoaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.tsconfigPathsStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigLoaderSuccessResult extends ConfigLoaderResult {
  var absoluteBaseUrl: String
  var addMatchAll: js.UndefOr[Boolean] = js.undefined
  var baseUrl: String
  var configFileAbsolutePath: String
  var mainFields: js.UndefOr[js.Array[String]] = js.undefined
  var paths: StringDictionary[js.Array[String]]
  var resultType: success
}

object ConfigLoaderSuccessResult {
  @scala.inline
  def apply(
    absoluteBaseUrl: String,
    baseUrl: String,
    configFileAbsolutePath: String,
    paths: StringDictionary[js.Array[String]],
    resultType: success,
    addMatchAll: js.UndefOr[Boolean] = js.undefined,
    mainFields: js.Array[String] = null
  ): ConfigLoaderSuccessResult = {
    val __obj = js.Dynamic.literal(absoluteBaseUrl = absoluteBaseUrl.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], configFileAbsolutePath = configFileAbsolutePath.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
    if (!js.isUndefined(addMatchAll)) __obj.updateDynamic("addMatchAll")(addMatchAll.get.asInstanceOf[js.Any])
    if (mainFields != null) __obj.updateDynamic("mainFields")(mainFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigLoaderSuccessResult]
  }
}

