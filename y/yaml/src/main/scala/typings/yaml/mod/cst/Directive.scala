package typings.yaml.mod.cst

import typings.yaml.mod.YAMLSyntaxError
import typings.yaml.yamlStrings.DIRECTIVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directive extends Node {
  @JSName("anchor")
  val anchor_Directive: Null
  var name: String
  val parameters: js.Array[String]
  @JSName("tag")
  val tag_Directive: Null
  @JSName("type")
  var type_Directive: DIRECTIVE
}

object Directive {
  @scala.inline
  def apply(
    anchor: Null,
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    name: String,
    parameters: js.Array[String],
    props: js.Array[Range],
    tag: Null,
    `type`: DIRECTIVE,
    valueRangeContainsNewline: Boolean,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    rawValue: String = null,
    value: String = null,
    valueRange: Range = null
  ): Directive = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
}

