package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeqBase extends Node {
  /**
    * item is always Node or null when parsed, but can be set to anything.
    */
  var items: js.Array[AstNode | Pair | scala.Null]
  var `type`: js.UndefOr[yamlLib.yamlLibStrings.FLOW_SEQ | yamlLib.yamlLibStrings.SEQ] = js.undefined
}

object SeqBase {
  @scala.inline
  def apply(
    items: js.Array[AstNode | Pair | scala.Null],
    toJSON: () => js.Any,
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    cstNode: yamlLib.yamlMod.cstNs.Node = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tag: java.lang.String = null,
    `type`: yamlLib.yamlLibStrings.FLOW_SEQ | yamlLib.yamlLibStrings.SEQ = null
  ): SeqBase = {
    val __obj = js.Dynamic.literal(items = items, toJSON = js.Any.fromFunction0(toJSON))
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeqBase]
  }
}

