package typings.tsconfigPaths.configLoaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.tsconfigPathsStrings.failed
import typings.tsconfigPaths.tsconfigPathsStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tsconfigPaths.configLoaderMod.ConfigLoaderSuccessResult
  - typings.tsconfigPaths.configLoaderMod.ConfigLoaderFailResult
*/
trait ConfigLoaderResult extends js.Object

object ConfigLoaderResult {
  @scala.inline
  def ConfigLoaderSuccessResult(
    absoluteBaseUrl: String,
    baseUrl: String,
    configFileAbsolutePath: String,
    paths: StringDictionary[js.Array[String]],
    resultType: success
  ): ConfigLoaderResult = {
    val __obj = js.Dynamic.literal(absoluteBaseUrl = absoluteBaseUrl.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], configFileAbsolutePath = configFileAbsolutePath.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigLoaderResult]
  }
  @scala.inline
  def ConfigLoaderFailResult(message: String, resultType: failed): ConfigLoaderResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigLoaderResult]
  }
}

