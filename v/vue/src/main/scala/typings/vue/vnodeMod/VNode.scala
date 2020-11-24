package typings.vue.vnodeMod

import typings.std.Node
import typings.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VNode extends _ScopedSlotReturnValue {
  
  var children: js.UndefOr[js.Array[VNode]] = js.native
  
  var componentInstance: js.UndefOr[Vue] = js.native
  
  var componentOptions: js.UndefOr[VNodeComponentOptions] = js.native
  
  var context: js.UndefOr[Vue] = js.native
  
  var data: js.UndefOr[VNodeData] = js.native
  
  var elm: js.UndefOr[Node] = js.native
  
  var isComment: Boolean = js.native
  
  var isRootInsert: Boolean = js.native
  
  var isStatic: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String | Double] = js.native
  
  var ns: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[VNode] = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object VNode {
  
  @scala.inline
  def apply(isComment: Boolean, isRootInsert: Boolean): VNode = {
    val __obj = js.Dynamic.literal(isComment = isComment.asInstanceOf[js.Any], isRootInsert = isRootInsert.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode]
  }
  
  @scala.inline
  implicit class VNodeOps[Self <: VNode] (val x: Self) extends AnyVal {
    
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
    def setIsComment(value: Boolean): Self = this.set("isComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRootInsert(value: Boolean): Self = this.set("isRootInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: VNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[VNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setComponentInstance(value: Vue): Self = this.set("componentInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentInstance: Self = this.set("componentInstance", js.undefined)
    
    @scala.inline
    def setComponentOptions(value: VNodeComponentOptions): Self = this.set("componentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentOptions: Self = this.set("componentOptions", js.undefined)
    
    @scala.inline
    def setContext(value: Vue): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setData(value: VNodeData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setElm(value: Node): Self = this.set("elm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElm: Self = this.set("elm", js.undefined)
    
    @scala.inline
    def setIsStatic(value: Boolean): Self = this.set("isStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStatic: Self = this.set("isStatic", js.undefined)
    
    @scala.inline
    def setKey(value: String | Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setNs(value: String): Self = this.set("ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNs: Self = this.set("ns", js.undefined)
    
    @scala.inline
    def setParent(value: VNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
