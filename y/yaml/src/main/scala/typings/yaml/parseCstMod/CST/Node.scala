package typings.yaml.parseCstMod.CST

import typings.yaml.anon.Handle
import typings.yaml.anon.Verbatim
import typings.yaml.utilMod.Type
import typings.yaml.utilMod.YAMLSyntaxError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  val anchor: String | Null
  val comment: String | Null
  var context: ParseContext | Null
  /** if not null, indicates a parser failure */
  var error: YAMLSyntaxError | Null
  val hasComment: Boolean
  val hasProps: Boolean
  val jsonLike: Boolean
  /** anchors, tags and comments */
  var props: js.Array[Range]
  /** span of context.src parsed into this node */
  var range: Range | Null
  val rawValue: String | Null
  val tag: Null | Verbatim | Handle
  /** specific node type */
  var `type`: Type
  /** if non-null, overrides source value */
  var value: String | Null
  var valueRange: Range | Null
  val valueRangeContainsNewline: Boolean
}

object Node {
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: Type,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    rawValue: String = null,
    tag: Verbatim | Handle = null,
    value: String = null,
    valueRange: Range = null
  ): Node = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRange = valueRange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

