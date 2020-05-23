package typings.wordpressComponents.anon

import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDraggableEnd extends js.Object {
  var onDraggableEnd: DragEventHandler[Element]
  var onDraggableStart: DragEventHandler[Element]
}

object OnDraggableEnd {
  @scala.inline
  def apply(onDraggableEnd: DragEvent[Element] => Unit, onDraggableStart: DragEvent[Element] => Unit): OnDraggableEnd = {
    val __obj = js.Dynamic.literal(onDraggableEnd = js.Any.fromFunction1(onDraggableEnd), onDraggableStart = js.Any.fromFunction1(onDraggableStart))
    __obj.asInstanceOf[OnDraggableEnd]
  }
}

