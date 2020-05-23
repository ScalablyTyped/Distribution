package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.COMMENT
import typings.yaml.utilMod.YAMLSyntaxError
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
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRange = valueRange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

