package typings.yaml.parseCstMod.CST

import typings.yaml.utilMod.Type.DOCUMENT
import typings.yaml.utilMod.YAMLSyntaxError
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
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRange = valueRange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

