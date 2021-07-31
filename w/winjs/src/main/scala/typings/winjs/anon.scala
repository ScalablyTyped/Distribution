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
    
    var renderComplete: Promise[js.Any]
  }
  object Element {
    
    @scala.inline
    def apply(element: Promise[HTMLElement], renderComplete: Promise[js.Any]): typings.winjs.anon.Element = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], renderComplete = renderComplete.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.winjs.anon.Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: typings.winjs.anon.Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: Promise[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderComplete(value: Promise[js.Any]): Self = StObject.set(x, "renderComplete", value.asInstanceOf[js.Any])
    }
  }
  
  trait Empty extends StObject {
    
    var empty: js.UndefOr[Boolean] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object Empty {
    
    @scala.inline
    def apply(value: String): Empty = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Empty]
    }
    
    @scala.inline
    implicit class EmptyMutableBuilder[Self <: Empty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Entrance extends StObject {
    
    var entrance: js.Function
    
    var exit: js.Function
  }
  object Entrance {
    
    @scala.inline
    def apply(entrance: js.Function, exit: js.Function): Entrance = {
      val __obj = js.Dynamic.literal(entrance = entrance.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entrance]
    }
    
    @scala.inline
    implicit class EntranceMutableBuilder[Self <: Entrance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntrance(value: js.Function): Self = StObject.set(x, "entrance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit(value: js.Function): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
  
  trait Item[T] extends StObject {
    
    var item: T
    
    var position: IPosition
  }
  object Item {
    
    @scala.inline
    def apply[T](item: T, position: IPosition): Item[T] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item[T]]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item[?], T] (val x: Self & Item[T]) extends AnyVal {
      
      @scala.inline
      def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: IPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyCode extends StObject {
    
    var keyCode: Double
    
    var nextFocusElement: HTMLElement
    
    var previousFocusElement: HTMLElement
  }
  object KeyCode {
    
    @scala.inline
    def apply(keyCode: Double, nextFocusElement: HTMLElement, previousFocusElement: HTMLElement): KeyCode = {
      val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any], nextFocusElement = nextFocusElement.asInstanceOf[js.Any], previousFocusElement = previousFocusElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyCode]
    }
    
    @scala.inline
    implicit class KeyCodeMutableBuilder[Self <: KeyCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextFocusElement(value: HTMLElement): Self = StObject.set(x, "nextFocusElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousFocusElement(value: HTMLElement): Self = StObject.set(x, "previousFocusElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollLeft extends StObject {
    
    var scrollLeft: Double
    
    var scrollTop: Double
  }
  object ScrollLeft {
    
    @scala.inline
    def apply(scrollLeft: Double, scrollTop: Double): ScrollLeft = {
      val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollLeft]
    }
    
    @scala.inline
    implicit class ScrollLeftMutableBuilder[Self <: ScrollLeft] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
