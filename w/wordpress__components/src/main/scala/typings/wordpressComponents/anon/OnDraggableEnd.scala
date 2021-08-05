package typings.wordpressComponents.anon

import typings.react.mod.DragEvent
import typings.react.mod.DragEventHandler
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDraggableEnd extends StObject {
  
  var onDraggableEnd: DragEventHandler[Element]
  
  var onDraggableStart: DragEventHandler[Element]
}
object OnDraggableEnd {
  
  inline def apply(onDraggableEnd: DragEvent[Element] => Unit, onDraggableStart: DragEvent[Element] => Unit): OnDraggableEnd = {
    val __obj = js.Dynamic.literal(onDraggableEnd = js.Any.fromFunction1(onDraggableEnd), onDraggableStart = js.Any.fromFunction1(onDraggableStart))
    __obj.asInstanceOf[OnDraggableEnd]
  }
  
  extension [Self <: OnDraggableEnd](x: Self) {
    
    inline def setOnDraggableEnd(value: DragEvent[Element] => Unit): Self = StObject.set(x, "onDraggableEnd", js.Any.fromFunction1(value))
    
    inline def setOnDraggableStart(value: DragEvent[Element] => Unit): Self = StObject.set(x, "onDraggableStart", js.Any.fromFunction1(value))
  }
}
