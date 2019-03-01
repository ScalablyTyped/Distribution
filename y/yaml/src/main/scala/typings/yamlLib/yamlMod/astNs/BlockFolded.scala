package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockFolded
  extends Scalar
     with ScalarNode {
  @JSName("cstNode")
  var cstNode_BlockFolded: js.UndefOr[yamlLib.yamlMod.cstNs.BlockFolded] = js.undefined
  @JSName("type")
  var type_BlockFolded: yamlLib.yamlLibStrings.BLOCK_FOLDED
}

object BlockFolded {
  @scala.inline
  def apply(
    toJSON: js.Function0[js.Any],
    `type`: yamlLib.yamlLibStrings.BLOCK_FOLDED,
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    cstNode: yamlLib.yamlMod.cstNs.BlockFolded = null,
    format: yamlLib.yamlLibStrings.BIN | yamlLib.yamlLibStrings.HEX | yamlLib.yamlLibStrings.OCT | yamlLib.yamlLibStrings.TIME = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tag: java.lang.String = null,
    value: scala.Boolean | scala.Double | java.lang.String = null
  ): BlockFolded = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("toJSON")(toJSON)
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

