package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowSeq
  extends SeqBase
     with SeqNode {
  @JSName("cstNode")
  var cstNode_FlowSeq: js.UndefOr[yamlLib.yamlMod.cstNs.FlowSeq] = js.undefined
  @JSName("items")
  var items_FlowSeq: js.Array[AstNode | Pair]
  @JSName("type")
  var type_FlowSeq: yamlLib.yamlLibStrings.FLOW_SEQ
}

object FlowSeq {
  @scala.inline
  def apply(
    items: js.Array[AstNode | Pair],
    toJSON: () => js.Any,
    `type`: yamlLib.yamlLibStrings.FLOW_SEQ,
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    cstNode: yamlLib.yamlMod.cstNs.FlowSeq = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tag: java.lang.String = null
  ): FlowSeq = {
    val __obj = js.Dynamic.literal(items = items, toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[FlowSeq]
  }
}

