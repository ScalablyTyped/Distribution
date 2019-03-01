package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuoteValue
  extends Scalar
     with Node {
  val strValue: scala.Null | java.lang.String | yamlLib.Anon_Errors
  @JSName("type")
  var type_QuoteValue: yamlLib.yamlLibStrings.QUOTE_DOUBLE | yamlLib.yamlLibStrings.QUOTE_SINGLE
}

object QuoteValue {
  @scala.inline
  def apply(
    hasComment: scala.Boolean,
    hasProps: scala.Boolean,
    jsonLike: scala.Boolean,
    props: js.Array[Range],
    `type`: yamlLib.yamlLibStrings.QUOTE_DOUBLE | yamlLib.yamlLibStrings.QUOTE_SINGLE,
    valueRangeContainsNewline: scala.Boolean,
    anchor: java.lang.String = null,
    comment: java.lang.String = null,
    context: ParseContext = null,
    error: yamlLib.yamlMod.YAMLSyntaxError = null,
    range: Range = null,
    rawValue: java.lang.String = null,
    strValue: java.lang.String | yamlLib.Anon_Errors = null,
    tag: yamlLib.Anon_Verbatim | yamlLib.Anon_Handle = null,
    value: java.lang.String = null,
    valueRange: Range = null
  ): QuoteValue = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("hasComment")(hasComment)
    __obj.updateDynamic("hasProps")(hasProps)
    __obj.updateDynamic("jsonLike")(jsonLike)
    __obj.updateDynamic("props")(props)
    __obj.updateDynamic("valueRangeContainsNewline")(valueRangeContainsNewline)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (context != null) __obj.updateDynamic("context")(context)
    if (error != null) __obj.updateDynamic("error")(error)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue)
    if (strValue != null) __obj.updateDynamic("strValue")(strValue.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    __obj.asInstanceOf[QuoteValue]
  }
}

