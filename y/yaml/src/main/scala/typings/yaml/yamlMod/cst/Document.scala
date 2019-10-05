package typings.yaml.yamlMod.cst

import typings.yaml.yamlMod.YAMLSyntaxError
import typings.yaml.yamlStrings.DOCUMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends Node {
  @JSName("anchor")
  val anchor_Document: Null
  @JSName("comment")
  val comment_Document: Null
  var contents: js.Array[Comment | ContentNode]
  var directives: js.Array[Comment | Directive]
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
    contents: js.Array[Comment | ContentNode],
    directives: js.Array[Comment | Directive],
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
    val __obj = js.Dynamic.literal(anchor = anchor, comment = comment, contents = contents, directives = directives, hasComment = hasComment, hasProps = hasProps, jsonLike = jsonLike, props = props, tag = tag, valueRangeContainsNewline = valueRangeContainsNewline)
    __obj.updateDynamic("type")(`type`)
    if (context != null) __obj.updateDynamic("context")(context)
    if (error != null) __obj.updateDynamic("error")(error)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    __obj.asInstanceOf[Document]
  }
}

