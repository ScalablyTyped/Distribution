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
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

