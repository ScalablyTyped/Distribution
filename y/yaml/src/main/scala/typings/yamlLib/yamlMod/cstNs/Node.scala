package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  val anchor: java.lang.String | scala.Null
  val comment: java.lang.String | scala.Null
  var context: ParseContext | scala.Null
  /** if not null, indicates a parser failure */
  var error: yamlLib.yamlMod.YAMLSyntaxError | scala.Null
  val hasComment: scala.Boolean
  val hasProps: scala.Boolean
  val jsonLike: scala.Boolean
  /** anchors, tags and comments */
  var props: js.Array[Range]
  /** span of context.src parsed into this node */
  var range: Range | scala.Null
  val rawValue: java.lang.String | scala.Null
  val tag: scala.Null | yamlLib.Anon_Verbatim | yamlLib.Anon_Handle
  /** specific node type */
  var `type`: java.lang.String
  /** if non-null, overrides source value */
  var value: java.lang.String | scala.Null
  var valueRange: Range | scala.Null
  val valueRangeContainsNewline: scala.Boolean
}

object Node {
  @scala.inline
  def apply(
    hasComment: scala.Boolean,
    hasProps: scala.Boolean,
    jsonLike: scala.Boolean,
    props: js.Array[Range],
    `type`: java.lang.String,
    valueRangeContainsNewline: scala.Boolean,
    anchor: java.lang.String = null,
    comment: java.lang.String = null,
    context: ParseContext = null,
    error: yamlLib.yamlMod.YAMLSyntaxError = null,
    range: Range = null,
    rawValue: java.lang.String = null,
    tag: yamlLib.Anon_Verbatim | yamlLib.Anon_Handle = null,
    value: java.lang.String = null,
    valueRange: Range = null
  ): Node = {
    val __obj = js.Dynamic.literal(hasComment = hasComment, hasProps = hasProps, jsonLike = jsonLike, props = props, valueRangeContainsNewline = valueRangeContainsNewline)
    __obj.updateDynamic("type")(`type`)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (context != null) __obj.updateDynamic("context")(context)
    if (error != null) __obj.updateDynamic("error")(error)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rawValue != null) __obj.updateDynamic("rawValue")(rawValue)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    __obj.asInstanceOf[Node]
  }
}

