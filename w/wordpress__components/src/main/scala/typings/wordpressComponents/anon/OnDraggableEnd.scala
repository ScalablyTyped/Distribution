package typings.wordpressComponents.anon

import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDraggableEnd extends js.Object {
  
  var onDraggableEnd: DragEventHandler[Element] = js.native
  
  var onDraggableStart: DragEventHandler[Element] = js.native
}
object OnDraggableEnd {
  
  @scala.inline
  def apply(onDraggableEnd: DragEvent[Element] => Unit, onDraggableStart: DragEvent[Element] => Unit): OnDraggableEnd = {
    val __obj = js.Dynamic.literal(onDraggableEnd = js.Any.fromFunction1(onDraggableEnd), onDraggableStart = js.Any.fromFunction1(onDraggableStart))
    __obj.asInstanceOf[OnDraggableEnd]
  }
  
  @scala.inline
  implicit class OnDraggableEndOps[Self <: OnDraggableEnd] (val x: Self) extends AnyVal {
    
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
    def setOnDraggableEnd(value: DragEvent[Element] => Unit): Self = this.set("onDraggableEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDraggableStart(value: DragEvent[Element] => Unit): Self = this.set("onDraggableStart", js.Any.fromFunction1(value))
  }
}
