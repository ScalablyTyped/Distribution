package typings.vueComponentCompilerUtils.parseMod

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.typesMod.RawSourceMap
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsBooleans.`true`
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
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCBlock]
  }
}

