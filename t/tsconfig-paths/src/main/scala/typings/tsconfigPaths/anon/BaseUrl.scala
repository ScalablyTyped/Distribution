package typings.tsconfigPaths.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUrl extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var paths: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object BaseUrl {
  @scala.inline
  def apply(
    baseUrl: String = null,
    paths: StringDictionary[js.Array[String]] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): BaseUrl = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrl]
  }
}

