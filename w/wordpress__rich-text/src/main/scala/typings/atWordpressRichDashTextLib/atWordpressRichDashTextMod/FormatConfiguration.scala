package typings
package atWordpressRichDashTextLib.atWordpressRichDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatConfiguration extends js.Object {
  /**
    * Maps react prop name to html attribute name.
    *
    * { className: 'class' } => <tag class={<className attr here>}></tag>
    */
  var attributes: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  var className: java.lang.String | scala.Null
  var edit: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<FormatProps> */ js.Any
  var keywords: js.UndefOr[
    js.Array[java.lang.String] | (js.Tuple2[java.lang.String, java.lang.String]) | (js.Tuple3[java.lang.String, java.lang.String, java.lang.String])
  ] = js.undefined
  var `object`: js.UndefOr[scala.Boolean] = js.undefined
  var tagName: (/* import warning: LimitUnionLength.enterTypeRef Was union type with length 119 */ js.Any) with java.lang.String
  var title: java.lang.String
}

object FormatConfiguration {
  @scala.inline
  def apply(
    edit: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<FormatProps> */ js.Any,
    tagName: (/* import warning: LimitUnionLength.enterTypeRef Was union type with length 119 */ js.Any) with java.lang.String,
    title: java.lang.String,
    attributes: stdLib.Record[java.lang.String, java.lang.String] = null,
    className: java.lang.String = null,
    keywords: js.Array[java.lang.String] | (js.Tuple2[java.lang.String, java.lang.String]) | (js.Tuple3[java.lang.String, java.lang.String, java.lang.String]) = null,
    `object`: js.UndefOr[scala.Boolean] = js.undefined
  ): FormatConfiguration = {
    val __obj = js.Dynamic.literal(edit = edit, tagName = tagName, title = title)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (className != null) __obj.updateDynamic("className")(className)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[FormatConfiguration]
  }
}

