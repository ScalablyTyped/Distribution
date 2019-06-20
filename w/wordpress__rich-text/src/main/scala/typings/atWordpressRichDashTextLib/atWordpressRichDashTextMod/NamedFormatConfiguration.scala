package typings
package atWordpressRichDashTextLib.atWordpressRichDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedFormatConfiguration extends FormatConfiguration {
  var name: java.lang.String
}

object NamedFormatConfiguration {
  @scala.inline
  def apply(
    edit: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<FormatProps> */ js.Any,
    name: java.lang.String,
    tagName: (/* import warning: LimitUnionLength.enterTypeRef Was union type with length 119 */ js.Any) with java.lang.String,
    title: java.lang.String,
    attributes: stdLib.Record[java.lang.String, java.lang.String] = null,
    className: java.lang.String = null,
    keywords: js.Array[java.lang.String] | (js.Tuple2[java.lang.String, java.lang.String]) | (js.Tuple3[java.lang.String, java.lang.String, java.lang.String]) = null,
    `object`: js.UndefOr[scala.Boolean] = js.undefined
  ): NamedFormatConfiguration = {
    val __obj = js.Dynamic.literal(edit = edit, name = name, tagName = tagName, title = title)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[NamedFormatConfiguration]
  }
}

