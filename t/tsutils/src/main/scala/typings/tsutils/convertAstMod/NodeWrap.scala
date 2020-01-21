package typings.tsutils.convertAstMod

import typings.typescript.mod.Node
import typings.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeWrap extends js.Object {
  var children: js.Array[NodeWrap]
  var kind: SyntaxKind
  var next: js.UndefOr[NodeWrap] = js.undefined
  var node: Node
  var parent: js.UndefOr[NodeWrap] = js.undefined
  var skip: js.UndefOr[NodeWrap] = js.undefined
}

object NodeWrap {
  @scala.inline
  def apply(
    children: js.Array[NodeWrap],
    kind: SyntaxKind,
    node: Node,
    next: NodeWrap = null,
    parent: NodeWrap = null,
    skip: NodeWrap = null
  ): NodeWrap = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeWrap]
  }
}

