package typings.tsconfigPaths.tsconfigLoaderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TsConfigLoaderResult extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var paths: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var tsConfigPath: js.UndefOr[String] = js.undefined
}

object TsConfigLoaderResult {
  @scala.inline
  def apply(
    baseUrl: String = null,
    paths: StringDictionary[js.Array[String]] = null,
    tsConfigPath: String = null
  ): TsConfigLoaderResult = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (tsConfigPath != null) __obj.updateDynamic("tsConfigPath")(tsConfigPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TsConfigLoaderResult]
  }
}

