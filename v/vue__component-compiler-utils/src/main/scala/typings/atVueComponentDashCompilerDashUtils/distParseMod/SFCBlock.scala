package typings.atVueComponentDashCompilerDashUtils.distParseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atVueComponentDashCompilerDashUtils.atVueComponentDashCompilerDashUtilsNumbers.`true`
import typings.atVueComponentDashCompilerDashUtils.distTypesMod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFCBlock extends SFCCustomBlock {
  var lang: js.UndefOr[String] = js.undefined
  var module: js.UndefOr[String | Boolean] = js.undefined
  var scoped: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object SFCBlock {
  @scala.inline
  def apply(
    attrs: StringDictionary[String | `true`],
    content: String,
    end: Double,
    start: Double,
    `type`: String,
    lang: String = null,
    map: RawSourceMap = null,
    module: String | Boolean = null,
    scoped: js.UndefOr[Boolean] = js.undefined,
    src: String = null
  ): SFCBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs, content = content, end = end, start = start)
    __obj.updateDynamic("type")(`type`)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (map != null) __obj.updateDynamic("map")(map)
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[SFCBlock]
  }
}

