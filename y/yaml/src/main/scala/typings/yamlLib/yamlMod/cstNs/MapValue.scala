package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapValue extends MapItem {
  @JSName("type")
  var type_MapValue: yamlLib.yamlLibStrings.MAP_VALUE
}

object MapValue {
  @scala.inline
  def apply(
    hasComment: scala.Boolean,
    hasProps: scala.Boolean,
    jsonLike: scala.Boolean,
    props: js.Array[Range],
    `type`: yamlLib.yamlLibStrings.MAP_VALUE,
    valueRangeContainsNewline: scala.Boolean,
    anchor: java.lang.String = null,
    comment: java.lang.String = null,
    context: ParseContext = null,
    error: yamlLib.yamlMod.YAMLSyntaxError = null,
    node: ContentNode = null,
    range: Range = null,
    rawValue: java.lang.String = null,
    tag: yamlLib.Anon_Verbatim | yamlLib.Anon_Handle = null,
    value: java.lang.String = null,
    valueRange: Range = null
  ): MapValue = {
    val __obj = js.Dynamic.literal(hasComment = hasComment, hasProps = hasProps, jsonLike = jsonLike, props = props, valueRangeContainsNewline = valueRangeContainsNewline)
    __obj.updateDynamic("type")(`type`)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (context != null) __obj.updateDynamic("context")(context)
    if (error != null) __obj.updateDynamic("error")(error)
    if (node != null) __obj.updateDynamic("node")(node)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    __obj.asInstanceOf[MapValue]
  }
}

