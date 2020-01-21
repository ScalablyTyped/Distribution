package typings.vueComponentCompilerUtils.parseMod

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.typesMod.RawSourceMap
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFCCustomBlock extends js.Object {
  var attrs: StringDictionary[String | `true`]
  var content: String
  var end: Double
  var map: js.UndefOr[RawSourceMap] = js.undefined
  var start: Double
  var `type`: String
}

object SFCCustomBlock {
  @scala.inline
  def apply(
    attrs: StringDictionary[String | `true`],
    content: String,
    end: Double,
    start: Double,
    `type`: String,
    map: RawSourceMap = null
  ): SFCCustomBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCCustomBlock]
  }
}

