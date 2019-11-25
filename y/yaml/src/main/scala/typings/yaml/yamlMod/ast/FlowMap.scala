package typings.yaml.yamlMod.ast

import typings.yaml.yamlStrings.FLOW_MAP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowMap
  extends MapBase
     with MapNode {
  @JSName("cstNode")
  var cstNode_FlowMap: js.UndefOr[typings.yaml.yamlMod.cst.FlowMap] = js.undefined
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
    cstNode: typings.yaml.yamlMod.cst.FlowMap = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): FlowMap = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowMap]
  }
}

