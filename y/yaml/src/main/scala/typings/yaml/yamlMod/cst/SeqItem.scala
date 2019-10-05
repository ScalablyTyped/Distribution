package typings.yaml.yamlMod.cst

import typings.yaml.Anon_Handle
import typings.yaml.Anon_Verbatim
import typings.yaml.yamlMod.YAMLSyntaxError
import typings.yaml.yamlStrings.SEQ_ITEM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeqItem extends Node {
  var node: ContentNode | Null
  @JSName("type")
  var type_SeqItem: SEQ_ITEM
}

object SeqItem {
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: SEQ_ITEM,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    node: ContentNode = null,
    range: Range = null,
    rawValue: String = null,
    tag: Anon_Verbatim | Anon_Handle = null,
    value: String = null,
    valueRange: Range = null
  ): SeqItem = {
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
    __obj.asInstanceOf[SeqItem]
  }
}

