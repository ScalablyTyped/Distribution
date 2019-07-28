package typings.yaml.yamlMod.astNs

import typings.yaml.yamlStrings.FLOW_MAP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowMap
  extends MapBase
     with MapNode {
  @JSName("cstNode")
  var cstNode_FlowMap: js.UndefOr[typings.yaml.yamlMod.cstNs.FlowMap] = js.undefined
  @JSName("type")
  var type_FlowMap: FLOW_MAP
}

object FlowMap {
  @scala.inline
  def apply(
    items: js.Array[Pair | Merge],
    toJSON: () => js.Any,
    `type`: FLOW_MAP,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.yamlMod.cstNs.FlowMap = null,
    range: js.Tuple2[Double, Double] = null,
    tag: String = null
  ): FlowMap = {
    val __obj = js.Dynamic.literal(items = items, toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[FlowMap]
  }
}

