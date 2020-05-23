package typings.vueTemplateCompiler.mod

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
    end: js.UndefOr[Double] = js.undefined,
    lang: String = null,
    module: String | Boolean = null,
    scoped: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    start: js.UndefOr[Double] = js.undefined
  ): SFCBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped.get.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCBlock]
  }
}

