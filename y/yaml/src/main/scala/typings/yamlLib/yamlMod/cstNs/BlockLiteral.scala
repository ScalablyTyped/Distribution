package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockLiteral extends BlockValue {
  @JSName("type")
  var type_BlockLiteral: yamlLib.yamlLibStrings.BLOCK_LITERAL
}

object BlockLiteral {
  @scala.inline
  def apply(
    chomping: yamlLib.yamlLibStrings.CLIP | yamlLib.yamlLibStrings.KEEP | yamlLib.yamlLibStrings.STRIP,
    hasComment: scala.Boolean,
    hasProps: scala.Boolean,
    header: Range,
    jsonLike: scala.Boolean,
    props: js.Array[Range],
    `type`: yamlLib.yamlLibStrings.BLOCK_LITERAL,
    valueRangeContainsNewline: scala.Boolean,
    anchor: java.lang.String = null,
    blockIndent: scala.Int | scala.Double = null,
    comment: java.lang.String = null,
    context: ParseContext = null,
    error: yamlLib.yamlMod.YAMLSyntaxError = null,
    range: Range = null,
    rawValue: java.lang.String = null,
    strValue: java.lang.String = null,
    tag: yamlLib.Anon_Verbatim | yamlLib.Anon_Handle = null,
    value: java.lang.String = null,
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

