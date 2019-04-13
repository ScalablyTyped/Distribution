package typings
package tsutilsLib.utilConvertDashAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedAst extends NodeWrap {
  @JSName("next")
  var next_WrappedAst: NodeWrap
  @JSName("parent")
  var parent_WrappedAst: js.UndefOr[scala.Nothing]
  @JSName("skip")
  var skip_WrappedAst: js.UndefOr[scala.Nothing]
}

object WrappedAst {
  @scala.inline
  def apply(
    children: js.Array[NodeWrap],
    kind: typescriptLib.typescriptMod.SyntaxKind,
    next: NodeWrap,
    node: typescriptLib.typescriptMod.Node,
    parent: js.UndefOr[scala.Nothing] = js.undefined,
    skip: js.UndefOr[scala.Nothing] = js.undefined
  ): WrappedAst = {
    val __obj = js.Dynamic.literal(children = children, kind = kind, next = next, node = node)
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[WrappedAst]
  }
}

