package typings.yaml.mod.ast

import typings.yaml.yamlStrings.PAIR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pair extends Node {
  /**
    * key is always Node or null when parsed, but can be set to anything.
    */
  var key: AstNode | Null
  var `type`: PAIR
  /**
    * value is always Node or null when parsed, but can be set to anything.
    */
  var value: AstNode | Null
}

object Pair {
  @scala.inline
  def apply(
    toJSON: () => js.Any,
    `type`: PAIR,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.mod.cst.Node = null,
    key: AstNode = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    value: AstNode = null
  ): Pair = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair]
  }
}

