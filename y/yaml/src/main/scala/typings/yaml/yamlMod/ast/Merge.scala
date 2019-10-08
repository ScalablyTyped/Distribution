package typings.yaml.yamlMod.ast

import typings.yaml.yamlStrings.MERGE_PAIR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Merge extends Node {
  @JSName("cstNode")
  var cstNode_Merge: js.UndefOr[typings.yaml.yamlMod.cst.PlainValue] = js.undefined
  /**
    * key is always Scalar('<<'), defined by the type specification
    */
  var key: PlainValue
  var `type`: MERGE_PAIR
  /**
    * value is always Seq<Alias(Map)>, stringified as *A if length = 1
    */
  var value: SeqBase
}

object Merge {
  @scala.inline
  def apply(
    key: PlainValue,
    toJSON: () => js.Any,
    `type`: MERGE_PAIR,
    value: SeqBase,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.yamlMod.cst.PlainValue = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): Merge = {
    val __obj = js.Dynamic.literal(key = key, toJSON = js.Any.fromFunction0(toJSON), value = value)
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Merge]
  }
}

