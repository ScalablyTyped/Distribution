package typings.tsutils.convertAstMod

import typings.typescript.mod.SourceFile
import typings.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappedAst extends NodeWrap {
  
  @JSName("next")
  var next_WrappedAst: NodeWrap = js.native
  
  @JSName("node")
  var node_WrappedAst: SourceFile = js.native
  
  @JSName("parent")
  var parent_WrappedAst: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("skip")
  var skip_WrappedAst: js.UndefOr[scala.Nothing] = js.native
}
object WrappedAst {
  
  @scala.inline
  def apply(children: js.Array[NodeWrap], kind: SyntaxKind, next: NodeWrap, node: SourceFile): WrappedAst = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedAst]
  }
  
  @scala.inline
  implicit class WrappedAstOps[Self <: WrappedAst] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNext(value: NodeWrap): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: SourceFile): Self = this.set("node", value.asInstanceOf[js.Any])
  }
}
