package typings.yaml.yamlMod.ast

import typings.yaml.yamlStrings.ALIAS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias
  extends Node
     with AstNode {
  @JSName("cstNode")
  var cstNode_Alias: js.UndefOr[typings.yaml.yamlMod.cst.Alias] = js.undefined
  var source: AstNode
  var `type`: ALIAS
}

object Alias {
  @scala.inline
  def apply(
    source: AstNode,
    toJSON: () => js.Any,
    `type`: ALIAS,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.yamlMod.cst.Alias = null,
    range: js.Tuple2[Double, Double] = null,
    tag: String = null
  ): Alias = {
    val __obj = js.Dynamic.literal(source = source, toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Alias]
  }
}

