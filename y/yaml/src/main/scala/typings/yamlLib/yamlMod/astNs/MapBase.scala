package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapBase extends Node {
  var items: js.Array[Pair | Merge]
  var `type`: js.UndefOr[yamlLib.yamlLibStrings.FLOW_MAP | yamlLib.yamlLibStrings.MAP]
}

object MapBase {
  @scala.inline
  def apply(
    items: js.Array[Pair | Merge],
    toJSON: js.Function0[js.Any],
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    cstNode: yamlLib.yamlMod.cstNs.Node = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tag: java.lang.String = null,
    `type`: yamlLib.yamlLibStrings.FLOW_MAP | yamlLib.yamlLibStrings.MAP = null
  ): MapBase = {
    val __obj = js.Dynamic.literal(items = items, toJSON = toJSON)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapBase]
  }
}

