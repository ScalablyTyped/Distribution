package typings.yaml.yamlMod.cstNs

import typings.yaml.yamlMod.YAMLSyntaxError
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
    val __obj = js.Dynamic.literal(anchor = anchor, hasComment = hasComment, hasProps = hasProps, jsonLike = jsonLike, name = name, parameters = parameters, props = props, tag = tag, valueRangeContainsNewline = valueRangeContainsNewline)
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (context != null) __obj.updateDynamic("context")(context)
    if (error != null) __obj.updateDynamic("error")(error)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    __obj.asInstanceOf[Directive]
  }
}

