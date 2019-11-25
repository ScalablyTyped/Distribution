package typings.yaml.yamlMod.ast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  /**
    * a comment on or immediately after this
    */
  var comment: Null | String
  /**
    * a comment before this
    */
  var commentBefore: Null | String
  /**
    * only available when `keepCstNodes` is set to `true`
    */
  var cstNode: js.UndefOr[typings.yaml.yamlMod.cst.Node] = js.undefined
  /**
    * the [start, end] range of characters of the source parsed
    * into this node (undefined for pairs or if not parsed)
    */
  var range: Null | (js.Tuple2[Double, Double])
  /**
    * a blank line before this node and its commentBefore
    */
  var spaceBefore: js.UndefOr[Boolean] = js.undefined
  /**
    * a fully qualified tag, if required
    */
  var tag: Null | String
  /**
    * a plain JS representation of this node
    */
  def toJSON(): js.Any
}

object Node {
  @scala.inline
  def apply(
    toJSON: () => js.Any,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.yamlMod.cst.Node = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): Node = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

