package typings.tsconfigPaths.configLoaderMod

import typings.tsconfigPaths.tsconfigPathsStrings.failed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigLoaderFailResult extends ConfigLoaderResult {
  var message: String
  var resultType: failed
}

object ConfigLoaderFailResult {
  @scala.inline
  def apply(message: String, resultType: failed): ConfigLoaderFailResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigLoaderFailResult]
  }
}

