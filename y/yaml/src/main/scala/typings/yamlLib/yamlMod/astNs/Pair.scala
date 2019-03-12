package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pair extends Node {
  @JSName("cstNode")
  var cstNode_Pair: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * key is always Node or null when parsed, but can be set to anything.
    */
  var key: AstNode | scala.Null
  var `type`: yamlLib.yamlLibStrings.PAIR
  /**
    * value is always Node or null when parsed, but can be set to anything.
    */
  var value: AstNode | scala.Null
}

object Pair {
  @scala.inline
  def apply(
    toJSON: () => js.Any,
    `type`: yamlLib.yamlLibStrings.PAIR,
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    cstNode: js.UndefOr[scala.Nothing] = js.undefined,
    key: AstNode = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tag: java.lang.String = null,
    value: AstNode = null
  ): Pair = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (!js.isUndefined(cstNode)) __obj.updateDynamic("cstNode")(cstNode)
    if (key != null) __obj.updateDynamic("key")(key)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Pair]
  }
}

