package typings.atWordpressRichDashText.atWordpressRichDashTextMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedFormatConfiguration extends FormatConfiguration {
  var name: String
}

object NamedFormatConfiguration {
  @scala.inline
  def apply(
    edit: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<FormatProps> */ js.Any,
    name: String,
    tagName: (/* import warning: LimitUnionLength.enterTypeRef Was union type with length 119 */ js.Any) with String,
    title: String,
    attributes: Record[String, String] = null,
    className: String = null,
    keywords: js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String]) = null,
    `object`: js.UndefOr[Boolean] = js.undefined
  ): NamedFormatConfiguration = {
    val __obj = js.Dynamic.literal(edit = edit, name = name, tagName = tagName, title = title)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[NamedFormatConfiguration]
  }
}

