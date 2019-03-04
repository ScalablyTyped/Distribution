package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends Node {
  @JSName("anchor")
  val anchor_Document: scala.Null
  @JSName("comment")
  val comment_Document: scala.Null
  var contents: js.Array[Comment | ContentNode]
  var directives: js.Array[Comment | Directive]
  @JSName("tag")
  val tag_Document: scala.Null
  @JSName("type")
  var type_Document: yamlLib.yamlLibStrings.DOCUMENT
}

object Document {
  @scala.inline
  def apply(
    anchor: scala.Null,
    comment: scala.Null,
    contents: js.Array[Comment | ContentNode],
    directives: js.Array[Comment | Directive],
    hasComment: scala.Boolean,
    hasProps: scala.Boolean,
    jsonLike: scala.Boolean,
    props: js.Array[Range],
    tag: scala.Null,
    `type`: yamlLib.yamlLibStrings.DOCUMENT,
    valueRangeContainsNewline: scala.Boolean,
    context: ParseContext = null,
    error: yamlLib.yamlMod.YAMLSyntaxError = null,
    range: Range = null,
    rawValue: java.lang.String = null,
    value: java.lang.String = null,
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

