package typings.yaml.yamlMod.ast

import typings.yaml.yamlStrings.BIN
import typings.yaml.yamlStrings.HEX
import typings.yaml.yamlStrings.OCT
import typings.yaml.yamlStrings.QUOTE_SINGLE
import typings.yaml.yamlStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuoteSingle
  extends Scalar
     with ScalarNode {
  @JSName("cstNode")
  var cstNode_QuoteSingle: js.UndefOr[typings.yaml.yamlMod.cst.QuoteSingle] = js.undefined
  @JSName("type")
  var type_QuoteSingle: QUOTE_SINGLE
}

object QuoteSingle {
  @scala.inline
  def apply(
    toJSON: () => js.Any,
    `type`: QUOTE_SINGLE,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.yamlMod.cst.QuoteSingle = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    tag: String = null,
    value: Boolean | Double | String = null
  ): QuoteSingle = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuoteSingle]
  }
}

