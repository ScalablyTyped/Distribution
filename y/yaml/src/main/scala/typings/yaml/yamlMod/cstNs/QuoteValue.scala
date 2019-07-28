package typings.yaml.yamlMod.cstNs

import typings.yaml.Anon_Errors
import typings.yaml.Anon_Handle
import typings.yaml.Anon_Verbatim
import typings.yaml.yamlMod.YAMLSyntaxError
import typings.yaml.yamlStrings.QUOTE_DOUBLE
import typings.yaml.yamlStrings.QUOTE_SINGLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuoteValue
  extends Scalar
     with Node {
  val strValue: Null | String | Anon_Errors
  @JSName("type")
  var type_QuoteValue: QUOTE_DOUBLE | QUOTE_SINGLE
}

object QuoteValue {
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: QUOTE_DOUBLE | QUOTE_SINGLE,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    rawValue: String = null,
    strValue: String | Anon_Errors = null,
    tag: Anon_Verbatim | Anon_Handle = null,
    value: String = null,
    valueRange: Range = null
  ): QuoteValue = {
    val __obj = js.Dynamic.literal(hasComment = hasComment, hasProps = hasProps, jsonLike = jsonLike, props = props, valueRangeContainsNewline = valueRangeContainsNewline)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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

