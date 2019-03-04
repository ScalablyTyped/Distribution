package typings
package atVueComponentDashCompilerDashUtilsLib.distParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFCBlock extends SFCCustomBlock {
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var module: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var scoped: js.UndefOr[scala.Boolean] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
}

object SFCBlock {
  @scala.inline
  def apply(
    attrs: org.scalablytyped.runtime.StringDictionary[
      java.lang.String | atVueComponentDashCompilerDashUtilsLib.atVueComponentDashCompilerDashUtilsLibNumbers.`true`
    ],
    content: java.lang.String,
    end: scala.Double,
    start: scala.Double,
    `type`: java.lang.String,
    lang: java.lang.String = null,
    map: atVueComponentDashCompilerDashUtilsLib.distTypesMod.RawSourceMap = null,
    module: java.lang.String | scala.Boolean = null,
    scoped: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String = null
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

