package typings.vueDashTemplateDashCompiler.vueDashTemplateDashCompilerMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFCBlock extends js.Object {
  var attrs: Record[String, String]
  var content: String
  var end: js.UndefOr[Double] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var module: js.UndefOr[String | Boolean] = js.undefined
  var scoped: js.UndefOr[Boolean] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var `type`: String
}

object SFCBlock {
  @scala.inline
  def apply(
    attrs: Record[String, String],
    content: String,
    `type`: String,
    end: Int | Double = null,
    lang: String = null,
    module: String | Boolean = null,
    scoped: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    start: Int | Double = null
  ): SFCBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs, content = content)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped)
    if (src != null) __obj.updateDynamic("src")(src)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCBlock]
  }
}

