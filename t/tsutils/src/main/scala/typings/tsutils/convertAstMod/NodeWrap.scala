package typings.tsutils.convertAstMod

import typings.typescript.mod.Node
import typings.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeWrap extends js.Object {
  
  var children: js.Array[NodeWrap] = js.native
  
  var kind: SyntaxKind = js.native
  
  var next: js.UndefOr[NodeWrap] = js.native
  
  var node: Node = js.native
  
  var parent: js.UndefOr[NodeWrap] = js.native
  
  var skip: js.UndefOr[NodeWrap] = js.native
}
object NodeWrap {
  
  @scala.inline
  def apply(children: js.Array[NodeWrap], kind: SyntaxKind, node: Node): NodeWrap = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeWrap]
  }
  
  @scala.inline
  implicit class NodeWrapOps[Self <: NodeWrap] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: NodeWrap*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[NodeWrap]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: SyntaxKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: NodeWrap): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setParent(value: NodeWrap): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setSkip(value: NodeWrap): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
  }
}
