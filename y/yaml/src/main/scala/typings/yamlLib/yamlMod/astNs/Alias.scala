package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias
  extends Node
     with AstNode {
  @JSName("cstNode")
  var cstNode_Alias: js.UndefOr[yamlLib.yamlMod.cstNs.Alias] = js.undefined
  var source: AstNode
  var `type`: yamlLib.yamlLibStrings.ALIAS
}

object Alias {
  @scala.inline
  def apply(
    source: AstNode,
    toJSON: js.Function0[js.Any],
    `type`: yamlLib.yamlLibStrings.ALIAS,
    comment: java.lang.String = null,
    commentBefore: java.lang.String = null,
    cstNode: yamlLib.yamlMod.cstNs.Alias = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    tag: java.lang.String = null
  ): Alias = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("toJSON")(toJSON)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore)
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Alias]
  }
}

