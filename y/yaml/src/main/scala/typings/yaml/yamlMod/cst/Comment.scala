package typings.yaml.yamlMod.cst

import typings.yaml.yamlMod.YAMLSyntaxError
import typings.yaml.yamlStrings.COMMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends Node {
  @JSName("anchor")
  val anchor_Comment: Null
  @JSName("comment")
  val comment_Comment: String
  @JSName("rawValue")
  val rawValue_Comment: Null
  @JSName("tag")
  val tag_Comment: Null
  @JSName("type")
  var type_Comment: COMMENT
}

object Comment {
  @scala.inline
  def apply(
    anchor: Null,
    comment: String,
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    rawValue: Null,
    tag: Null,
    `type`: COMMENT,
    valueRangeContainsNewline: Boolean,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    value: String = null,
    valueRange: Range = null
  ): Comment = {
    val __obj = js.Dynamic.literal(anchor = anchor, comment = comment, hasComment = hasComment, hasProps = hasProps, jsonLike = jsonLike, props = props, rawValue = rawValue, tag = tag, valueRangeContainsNewline = valueRangeContainsNewline)
    __obj.updateDynamic("type")(`type`)
    if (context != null) __obj.updateDynamic("context")(context)
    if (error != null) __obj.updateDynamic("error")(error)
    if (range != null) __obj.updateDynamic("range")(range)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    __obj.asInstanceOf[Comment]
  }
}

