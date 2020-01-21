package typings.tsutils.convertAstMod

import typings.typescript.mod.SourceFile
import typings.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedAst extends NodeWrap {
  @JSName("next")
  var next_WrappedAst: NodeWrap
  @JSName("node")
  var node_WrappedAst: SourceFile
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
    node: SourceFile,
    parent: js.UndefOr[scala.Nothing] = js.undefined,
    skip: js.UndefOr[scala.Nothing] = js.undefined
  ): WrappedAst = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedAst]
  }
}

