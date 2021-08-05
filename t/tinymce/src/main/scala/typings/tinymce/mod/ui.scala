package typings.tinymce.mod

import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ui {
  
  @JSImport("tinymce", "ui.Control")
  @js.native
  class Control () extends StObject {
    
    @JSName("$el")
    var $el: JQuery[HTMLElement] = js.native
    
    def active(state: Boolean): Unit = js.native
    
    def disabled(state: Boolean): Unit = js.native
    
    def on(name: String, callback: String): Control = js.native
    
    var settings: ControlSettings = js.native
    
    def tooltip(): Control = js.native
  }
  
  trait Collection extends StObject
  
  trait Container extends StObject {
    
    def add(items: js.Any): Collection
    
    def items(): Collection
  }
  object Container {
    
    inline def apply(add: js.Any => Collection, items: () => Collection): Container = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), items = js.Any.fromFunction0(items))
      __obj.asInstanceOf[Container]
    }
    
    extension [Self <: Container](x: Self) {
      
      inline def setAdd(value: js.Any => Collection): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setItems(value: () => Collection): Self = StObject.set(x, "items", js.Any.fromFunction0(value))
    }
  }
  
  trait ControlSettings extends StObject {
    
    var menu: Menu
  }
  object ControlSettings {
    
    inline def apply(menu: Menu): ControlSettings = {
      val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlSettings]
    }
    
    extension [Self <: ControlSettings](x: Self) {
      
      inline def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    }
  }
  
  trait Factory extends StObject {
    
    def create(settings: js.Any): Control
  }
  object Factory {
    
    inline def apply(create: js.Any => Control): Factory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[Factory]
    }
    
    extension [Self <: Factory](x: Self) {
      
      inline def setCreate(value: js.Any => Control): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FloatPanel
    extends Control
       with Moveable
  
  @js.native
  trait Menu
    extends FloatPanel
       with Container
  
  trait Moveable extends StObject {
    
    def moveRel(elm: Node, rel: String): Control
  }
  object Moveable {
    
    inline def apply(moveRel: (Node, String) => Control): Moveable = {
      val __obj = js.Dynamic.literal(moveRel = js.Any.fromFunction2(moveRel))
      __obj.asInstanceOf[Moveable]
    }
    
    extension [Self <: Moveable](x: Self) {
      
      inline def setMoveRel(value: (Node, String) => Control): Self = StObject.set(x, "moveRel", js.Any.fromFunction2(value))
    }
  }
}
