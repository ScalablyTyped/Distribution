package typings.yaml.mod.ast

import typings.yaml.yamlStrings.MERGE_PAIR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Merge extends Node {
  @JSName("cstNode")
  var cstNode_Merge: js.UndefOr[typings.yaml.mod.cst.PlainValue] = js.undefined
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
    cstNode: typings.yaml.mod.cst.PlainValue = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): Merge = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Merge]
  }
}

