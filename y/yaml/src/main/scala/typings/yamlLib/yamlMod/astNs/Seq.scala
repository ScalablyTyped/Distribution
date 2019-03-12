package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seq
  extends SeqBase
     with SeqNode {
  @JSName("cstNode")
  var cstNode_Seq: js.UndefOr[yamlLib.yamlMod.cstNs.Seq] = js.undefined
  @JSName("items")
  var items_Seq: js.Array[AstNode | scala.Null]
  @JSName("type")
  var type_Seq: yamlLib.yamlLibStrings.SEQ
}

object Seq {
  @scala.inline
  def apply(
    items: js.Array[AstNode | scala.Null],
    toJSON: () => js.Any,
    `type`: yamlLib.yamlLibStrings.SEQ,
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    cstNode: yamlLib.yamlMod.cstNs.Seq = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tag: java.lang.String = null
  ): Seq = {
    val __obj = js.Dynamic.literal(items = items, toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Seq]
  }
}

