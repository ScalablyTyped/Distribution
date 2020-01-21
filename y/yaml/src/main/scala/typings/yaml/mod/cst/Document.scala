package typings.yaml.mod.cst

import typings.yaml.mod.YAMLSyntaxError
import typings.yaml.yamlStrings.DOCUMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends Node {
  @JSName("anchor")
  val anchor_Document: Null
  @JSName("comment")
  val comment_Document: Null
  var contents: js.Array[BlankLine | Comment | ContentNode]
  var directives: js.Array[BlankLine | Comment | Directive]
  @JSName("tag")
  val tag_Document: Null
  @JSName("type")
  var type_Document: DOCUMENT
}

object Document {
  @scala.inline
  def apply(
    anchor: Null,
    comment: Null,
    contents: js.Array[BlankLine | Comment | ContentNode],
    directives: js.Array[BlankLine | Comment | Directive],
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    tag: Null,
    `type`: DOCUMENT,
    valueRangeContainsNewline: Boolean,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    rawValue: String = null,
    value: String = null,
    valueRange: Range = null
  ): Document = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

