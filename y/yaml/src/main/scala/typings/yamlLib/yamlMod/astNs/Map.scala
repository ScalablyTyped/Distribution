package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map
  extends MapBase
     with MapNode {
  @JSName("cstNode")
  var cstNode_Map: js.UndefOr[yamlLib.yamlMod.cstNs.Map] = js.undefined
  @JSName("type")
  var type_Map: yamlLib.yamlLibStrings.MAP
}

object Map {
  @scala.inline
  def apply(
    items: js.Array[Pair | Merge],
    toJSON: js.Function0[js.Any],
    `type`: yamlLib.yamlLibStrings.MAP,
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    cstNode: yamlLib.yamlMod.cstNs.Map = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tag: java.lang.String = null
  ): Map = {
    val __obj = js.Dynamic.literal(items = items, toJSON = toJSON)
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Map]
  }
}

