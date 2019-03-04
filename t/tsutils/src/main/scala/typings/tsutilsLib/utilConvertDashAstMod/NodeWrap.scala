package typings
package tsutilsLib.utilConvertDashAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeWrap extends js.Object {
  var children: js.Array[NodeWrap]
  var kind: typescriptLib.typescriptMod.tsNs.SyntaxKind
  var next: js.UndefOr[NodeWrap] = js.undefined
  var node: typescriptLib.typescriptMod.tsNs.Node
  var parent: js.UndefOr[NodeWrap] = js.undefined
  var skip: js.UndefOr[NodeWrap] = js.undefined
}

object NodeWrap {
  @scala.inline
  def apply(
    children: js.Array[NodeWrap],
    kind: typescriptLib.typescriptMod.tsNs.SyntaxKind,
    node: typescriptLib.typescriptMod.tsNs.Node,
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

