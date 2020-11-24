package typings.tinymce.mod.Events

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeChangeEvent extends Event {
  
  var element: Node = js.native
  
  var parents: js.Array[Node] = js.native
  
  var selectionChange: Boolean = js.native
}
object NodeChangeEvent {
  
  @scala.inline
  def apply(
    element: Node,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    parents: js.Array[Node],
    preventDefault: () => Unit,
    selectionChange: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: String,
    `type`: String
  ): NodeChangeEvent = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), parents = parents.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), selectionChange = selectionChange.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeChangeEvent]
  }
  
  @scala.inline
  implicit class NodeChangeEventOps[Self <: NodeChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setElement(value: Node): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsVarargs(value: Node*): Self = this.set("parents", js.Array(value :_*))
    
    @scala.inline
    def setParents(value: js.Array[Node]): Self = this.set("parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionChange(value: Boolean): Self = this.set("selectionChange", value.asInstanceOf[js.Any])
  }
}
