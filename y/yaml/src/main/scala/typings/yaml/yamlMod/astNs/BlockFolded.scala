package typings.yaml.yamlMod.astNs

import typings.yaml.yamlStrings.BIN
import typings.yaml.yamlStrings.BLOCK_FOLDED
import typings.yaml.yamlStrings.HEX
import typings.yaml.yamlStrings.OCT
import typings.yaml.yamlStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockFolded
  extends Scalar
     with ScalarNode {
  @JSName("cstNode")
  var cstNode_BlockFolded: js.UndefOr[typings.yaml.yamlMod.cstNs.BlockFolded] = js.undefined
  @JSName("type")
  var type_BlockFolded: BLOCK_FOLDED
}

object BlockFolded {
  @scala.inline
  def apply(
    toJSON: () => js.Any,
    `type`: BLOCK_FOLDED,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.yamlMod.cstNs.BlockFolded = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    tag: String = null,
    value: Boolean | Double | String = null
  ): BlockFolded = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockFolded]
  }
}

