package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockFolded extends BlockValue {
  @JSName("type")
  var type_BlockFolded: yamlLib.yamlLibStrings.BLOCK_FOLDED
}

object BlockFolded {
  @scala.inline
  def apply(
    chomping: yamlLib.yamlLibStrings.CLIP | yamlLib.yamlLibStrings.KEEP | yamlLib.yamlLibStrings.STRIP,
    hasComment: scala.Boolean,
    hasProps: scala.Boolean,
    header: Range,
    jsonLike: scala.Boolean,
    props: js.Array[Range],
    `type`: yamlLib.yamlLibStrings.BLOCK_FOLDED,
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
  ): BlockFolded = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("chomping")(chomping.asInstanceOf[js.Any])
    __obj.updateDynamic("hasComment")(hasComment)
    __obj.updateDynamic("hasProps")(hasProps)
    __obj.updateDynamic("header")(header)
    __obj.updateDynamic("jsonLike")(jsonLike)
    __obj.updateDynamic("props")(props)
    __obj.updateDynamic("valueRangeContainsNewline")(valueRangeContainsNewline)
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
    __obj.asInstanceOf[BlockFolded]
  }
}

