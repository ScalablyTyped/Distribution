package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directive extends Node {
  @JSName("anchor")
  val anchor_Directive: scala.Null
  var name: java.lang.String
  val parameters: js.Array[java.lang.String]
  @JSName("tag")
  val tag_Directive: scala.Null
  @JSName("type")
  var type_Directive: yamlLib.yamlLibStrings.DIRECTIVE
}

object Directive {
  @scala.inline
  def apply(
    anchor: scala.Null,
    hasComment: scala.Boolean,
    hasProps: scala.Boolean,
    jsonLike: scala.Boolean,
    name: java.lang.String,
    parameters: js.Array[java.lang.String],
    props: js.Array[Range],
    tag: scala.Null,
    `type`: yamlLib.yamlLibStrings.DIRECTIVE,
    valueRangeContainsNewline: scala.Boolean,
    comment: java.lang.String = null,
    context: ParseContext = null,
    error: yamlLib.yamlMod.YAMLSyntaxError = null,
    range: Range = null,
    rawValue: java.lang.String = null,
    value: java.lang.String = null,
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

