package typings.yaml.yamlMod.astNs

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
    cstNode: typings.yaml.yamlMod.cstNs.Node = null,
    key: AstNode = null,
    range: js.Tuple2[Double, Double] = null,
    tag: String = null,
    value: AstNode = null
  ): Pair = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (key != null) __obj.updateDynamic("key")(key)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Pair]
  }
}

