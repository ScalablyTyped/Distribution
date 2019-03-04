package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias
  extends Node
     with ContentNode {
  /** contain the anchor without the * prefix */
  @JSName("rawValue")
  val rawValue_Alias: java.lang.String
  @JSName("type")
  var type_Alias: yamlLib.yamlLibStrings.ALIAS
}

object Alias {
  @scala.inline
  def apply(
    hasComment: scala.Boolean,
    hasProps: scala.Boolean,
    jsonLike: scala.Boolean,
    props: js.Array[Range],
    rawValue: java.lang.String,
    `type`: yamlLib.yamlLibStrings.ALIAS,
    valueRangeContainsNewline: scala.Boolean,
    anchor: java.lang.String = null,
    comment: java.lang.String = null,
    context: ParseContext = null,
    error: yamlLib.yamlMod.YAMLSyntaxError = null,
    range: Range = null,
    tag: yamlLib.Anon_Verbatim | yamlLib.Anon_Handle = null,
    value: java.lang.String = null,
    valueRange: Range = null
  ): Alias = {
    val __obj = js.Dynamic.literal(hasComment = hasComment, hasProps = hasProps, jsonLike = jsonLike, props = props, rawValue = rawValue, valueRangeContainsNewline = valueRangeContainsNewline)
    __obj.updateDynamic("type")(`type`)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (context != null) __obj.updateDynamic("context")(context)
    if (error != null) __obj.updateDynamic("error")(error)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    __obj.asInstanceOf[Alias]
  }
}

