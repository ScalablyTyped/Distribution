package typings.yaml.yamlMod.cstNs

import typings.yaml.Anon_Handle
import typings.yaml.Anon_Verbatim
import typings.yaml.yamlMod.YAMLSyntaxError
import typings.yaml.yamlStrings.BLOCK_LITERAL
import typings.yaml.yamlStrings.CLIP
import typings.yaml.yamlStrings.KEEP
import typings.yaml.yamlStrings.STRIP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockLiteral extends BlockValue {
  @JSName("type")
  var type_BlockLiteral: BLOCK_LITERAL
}

object BlockLiteral {
  @scala.inline
  def apply(
    chomping: CLIP | KEEP | STRIP,
    hasComment: Boolean,
    hasProps: Boolean,
    header: Range,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: BLOCK_LITERAL,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    blockIndent: Int | Double = null,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    rawValue: String = null,
    strValue: String = null,
    tag: Anon_Verbatim | Anon_Handle = null,
    value: String = null,
    valueRange: Range = null
  ): BlockLiteral = {
    val __obj = js.Dynamic.literal(chomping = chomping.asInstanceOf[js.Any], hasComment = hasComment, hasProps = hasProps, header = header, jsonLike = jsonLike, props = props, valueRangeContainsNewline = valueRangeContainsNewline)
    __obj.updateDynamic("type")(`type`)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (blockIndent != null) __obj.updateDynamic("blockIndent")(blockIndent.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (context != null) __obj.updateDynamic("context")(context)
    if (error != null) __obj.updateDynamic("error")(error)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue)
    if (strValue != null) __obj.updateDynamic("strValue")(strValue)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    __obj.asInstanceOf[BlockLiteral]
  }
}

