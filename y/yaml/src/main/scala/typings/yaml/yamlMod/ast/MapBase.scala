package typings.yaml.yamlMod.ast

import typings.yaml.yamlStrings.FLOW_MAP
import typings.yaml.yamlStrings.MAP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapBase extends Node {
  var items: js.Array[Pair | Merge]
  var `type`: js.UndefOr[FLOW_MAP | MAP] = js.undefined
}

object MapBase {
  @scala.inline
  def apply(
    items: js.Array[Pair | Merge],
    toJSON: () => js.Any,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.yamlMod.cst.Node = null,
    range: js.Tuple2[Double, Double] = null,
    tag: String = null,
    `type`: FLOW_MAP | MAP = null
  ): MapBase = {
    val __obj = js.Dynamic.literal(items = items, toJSON = js.Any.fromFunction0(toJSON))
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapBase]
  }
}

