package typings.useDoubleClick

import typings.react.mod.MouseEvent
import typings.react.mod.MutableRefObject
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Latency[T] extends StObject {
    
    /** The amount of time (in milliseconds) to wait before differentiating a single from a double click. Defaults to 300. */
    var latency: js.UndefOr[Double] = js.undefined
    
    /** A callback function for double click events */
    var onDoubleClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
    
    /** A callback function for single click events */
    var onSingleClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
    
    /** Dom node to watch for double clicks */
    var ref: RefObject[T] | MutableRefObject[T]
  }
  object Latency {
    
    inline def apply[T](ref: RefObject[T] | MutableRefObject[T]): Latency[T] = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latency[T]]
    }
    
    extension [Self <: Latency[?], T](x: Self & Latency[T]) {
      
      inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
      
      inline def setOnDoubleClick(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnSingleClick(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSingleClick", js.Any.fromFunction1(value))
      
      inline def setOnSingleClickUndefined: Self = StObject.set(x, "onSingleClick", js.undefined)
      
      inline def setRef(value: RefObject[T] | MutableRefObject[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}
