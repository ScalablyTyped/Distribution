package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowMap
  extends MapBase
     with MapNode {
  @JSName("cstNode")
  var cstNode_FlowMap: js.UndefOr[yamlLib.yamlMod.cstNs.FlowMap] = js.undefined
  @JSName("type")
  var type_FlowMap: yamlLib.yamlLibStrings.FLOW_MAP
}

object FlowMap {
  @scala.inline
  def apply(
    items: js.Array[Pair | Merge],
    toJSON: js.Function0[js.Any],
    `type`: yamlLib.yamlLibStrings.FLOW_MAP,
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    cstNode: yamlLib.yamlMod.cstNs.FlowMap = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tag: java.lang.String = null
  ): FlowMap = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("toJSON")(toJSON)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[FlowMap]
  }
}

