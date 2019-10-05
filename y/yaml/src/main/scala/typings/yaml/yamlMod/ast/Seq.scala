package typings.yaml.yamlMod.ast

import typings.yaml.yamlStrings.SEQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Seq
  extends SeqBase
     with SeqNode {
  @JSName("cstNode")
  var cstNode_Seq: js.UndefOr[typings.yaml.yamlMod.cst.Seq] = js.undefined
  @JSName("items")
  var items_Seq: js.Array[AstNode | Null]
  @JSName("type")
  var type_Seq: SEQ
}

object Seq {
  @scala.inline
  def apply(
    items: js.Array[AstNode | Null],
    toJSON: () => js.Any,
    `type`: SEQ,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.yamlMod.cst.Seq = null,
    range: js.Tuple2[Double, Double] = null,
    tag: String = null
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

