package typings.yaml.yamlMod.cst

import typings.yaml.Anon_Handle
import typings.yaml.Anon_Verbatim
import typings.yaml.yamlMod.YAMLSyntaxError
import typings.yaml.yamlStrings.ALIAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias
  extends Node
     with ContentNode {
  /** contain the anchor without the * prefix */
  @JSName("rawValue")
  val rawValue_Alias: String
  @JSName("type")
  var type_Alias: ALIAS
}

object Alias {
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    rawValue: String,
    `type`: ALIAS,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    tag: Anon_Verbatim | Anon_Handle = null,
    value: String = null,
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

