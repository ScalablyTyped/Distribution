package typings.tsutils.utilConvertDashAstMod

import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.SyntaxKind
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
    val __obj = js.Dynamic.literal(children = children, kind = kind, node = node)
    if (next != null) __obj.updateDynamic("next")(next)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (skip != null) __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[NodeWrap]
  }
}

