package typings.useResizeObserver

import typings.react.mod.RefObject
import typings.std.Element
import typings.useResizeObserver.mod.ObservedSize
import typings.useResizeObserver.mod.ResizeHandler
import typings.useResizeObserver.mod.ResizeObserverBoxOptions
import typings.useResizeObserver.mod.RoundingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Box[T /* <: Element */] extends StObject {
    
    var box: js.UndefOr[ResizeObserverBoxOptions] = js.undefined
    
    var onResize: js.UndefOr[ResizeHandler] = js.undefined
    
    var ref: js.UndefOr[RefObject[T] | T | Null] = js.undefined
    
    var round: js.UndefOr[RoundingFunction] = js.undefined
  }
  object Box {
    
    inline def apply[T /* <: Element */](): Box[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Box[T]]
    }
    
    extension [Self <: Box[?], T /* <: Element */](x: Self & Box[T]) {
      
      inline def setBox(value: ResizeObserverBoxOptions): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
      
      inline def setOnResize(value: /* size */ ObservedSize => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setRef(value: RefObject[T] | T): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRound(value: /* n */ Double => Double): Self = StObject.set(x, "round", js.Any.fromFunction1(value))
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    }
  }
}
