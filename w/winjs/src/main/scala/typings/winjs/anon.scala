package typings.winjs

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import typings.winjs.WinJS.Utilities.IPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Element extends StObject {
    
    var element: Promise[HTMLElement]
    
    var renderComplete: Promise[Any]
  }
  object Element {
    
    inline def apply(element: Promise[HTMLElement], renderComplete: Promise[Any]): typings.winjs.anon.Element = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], renderComplete = renderComplete.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.winjs.anon.Element]
    }
    
    extension [Self <: typings.winjs.anon.Element](x: Self) {
      
      inline def setElement(value: Promise[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setRenderComplete(value: Promise[Any]): Self = StObject.set(x, "renderComplete", value.asInstanceOf[js.Any])
    }
  }
  
  trait Empty extends StObject {
    
    var empty: js.UndefOr[Boolean] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object Empty {
    
    inline def apply(value: String): Empty = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Empty]
    }
    
    extension [Self <: Empty](x: Self) {
      
      inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entrance extends StObject {
    
    var entrance: js.Function
    
    var exit: js.Function
  }
  object Entrance {
    
    inline def apply(entrance: js.Function, exit: js.Function): Entrance = {
      val __obj = js.Dynamic.literal(entrance = entrance.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entrance]
    }
    
    extension [Self <: Entrance](x: Self) {
      
      inline def setEntrance(value: js.Function): Self = StObject.set(x, "entrance", value.asInstanceOf[js.Any])
      
      inline def setExit(value: js.Function): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
  
  trait Item[T] extends StObject {
    
    var item: T
    
    var position: IPosition
  }
  object Item {
    
    inline def apply[T](item: T, position: IPosition): Item[T] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item[T]]
    }
    
    extension [Self <: Item[?], T](x: Self & Item[T]) {
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: IPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyCode extends StObject {
    
    var keyCode: Double
    
    var nextFocusElement: HTMLElement
    
    var previousFocusElement: HTMLElement
  }
  object KeyCode {
    
    inline def apply(keyCode: Double, nextFocusElement: HTMLElement, previousFocusElement: HTMLElement): KeyCode = {
      val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any], nextFocusElement = nextFocusElement.asInstanceOf[js.Any], previousFocusElement = previousFocusElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyCode]
    }
    
    extension [Self <: KeyCode](x: Self) {
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setNextFocusElement(value: HTMLElement): Self = StObject.set(x, "nextFocusElement", value.asInstanceOf[js.Any])
      
      inline def setPreviousFocusElement(value: HTMLElement): Self = StObject.set(x, "previousFocusElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollLeft extends StObject {
    
    var scrollLeft: Double
    
    var scrollTop: Double
  }
  object ScrollLeft {
    
    inline def apply(scrollLeft: Double, scrollTop: Double): ScrollLeft = {
      val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollLeft]
    }
    
    extension [Self <: ScrollLeft](x: Self) {
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
