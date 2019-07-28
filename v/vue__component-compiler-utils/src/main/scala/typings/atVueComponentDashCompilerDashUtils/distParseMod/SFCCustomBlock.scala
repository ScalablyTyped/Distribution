package typings.atVueComponentDashCompilerDashUtils.distParseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atVueComponentDashCompilerDashUtils.atVueComponentDashCompilerDashUtilsNumbers.`true`
import typings.atVueComponentDashCompilerDashUtils.distTypesMod.RawSourceMap
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
    val __obj = js.Dynamic.literal(attrs = attrs, content = content, end = end, start = start)
    __obj.updateDynamic("type")(`type`)
    if (map != null) __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[SFCCustomBlock]
  }
}

