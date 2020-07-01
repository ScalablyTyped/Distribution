package typings.tsconfigPaths.configLoaderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplicitParams extends js.Object {
  var addMatchAll: js.UndefOr[Boolean] = js.undefined
  var baseUrl: String
  var mainFields: js.UndefOr[js.Array[String]] = js.undefined
  var paths: StringDictionary[js.Array[String]]
}

object ExplicitParams {
  @scala.inline
  def apply(
    baseUrl: String,
    paths: StringDictionary[js.Array[String]],
    addMatchAll: js.UndefOr[Boolean] = js.undefined,
    mainFields: js.Array[String] = null
  ): ExplicitParams = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    if (!js.isUndefined(addMatchAll)) __obj.updateDynamic("addMatchAll")(addMatchAll.get.asInstanceOf[js.Any])
    if (mainFields != null) __obj.updateDynamic("mainFields")(mainFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitParams]
  }
}

