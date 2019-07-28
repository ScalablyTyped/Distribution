package typings.tsutils.utilConvertDashAstMod

import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedAst extends NodeWrap {
  @JSName("next")
  var next_WrappedAst: NodeWrap
  @JSName("parent")
  var parent_WrappedAst: js.UndefOr[scala.Nothing] = js.undefined
  @JSName("skip")
  var skip_WrappedAst: js.UndefOr[scala.Nothing] = js.undefined
}

object WrappedAst {
  @scala.inline
  def apply(
    children: js.Array[NodeWrap],
    kind: SyntaxKind,
    next: NodeWrap,
    node: Node,
    parent: js.UndefOr[scala.Nothing] = js.undefined,
    skip: js.UndefOr[scala.Nothing] = js.undefined
  ): WrappedAst = {
    val __obj = js.Dynamic.literal(children = children, kind = kind, next = next, node = node)
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[WrappedAst]
  }
}

