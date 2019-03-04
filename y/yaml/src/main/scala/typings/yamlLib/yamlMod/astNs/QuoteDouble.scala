package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuoteDouble
  extends Scalar
     with ScalarNode {
  @JSName("cstNode")
  var cstNode_QuoteDouble: js.UndefOr[yamlLib.yamlMod.cstNs.QuoteDouble] = js.undefined
  @JSName("type")
  var type_QuoteDouble: yamlLib.yamlLibStrings.QUOTE_DOUBLE
}

object QuoteDouble {
  @scala.inline
  def apply(
    toJSON: js.Function0[js.Any],
    `type`: yamlLib.yamlLibStrings.QUOTE_DOUBLE,
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    cstNode: yamlLib.yamlMod.cstNs.QuoteDouble = null,
    format: yamlLib.yamlLibStrings.BIN | yamlLib.yamlLibStrings.HEX | yamlLib.yamlLibStrings.OCT | yamlLib.yamlLibStrings.TIME = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tag: java.lang.String = null,
    value: scala.Boolean | scala.Double | java.lang.String = null
  ): QuoteDouble = {
    val __obj = js.Dynamic.literal(toJSON = toJSON)
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuoteDouble]
  }
}

