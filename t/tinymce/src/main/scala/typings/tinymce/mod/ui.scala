package typings.tinymce.mod

import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait Collection extends StObject
  
  @js.native
  trait Container extends StObject {
    
    def add(items: js.Any): Collection = js.native
    
    def items(): Collection = js.native
  }
  object Container {
    
    @scala.inline
    def apply(add: js.Any => Collection, items: () => Collection): Container = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), items = js.Any.fromFunction0(items))
      __obj.asInstanceOf[Container]
    }
    
    @scala.inline
    implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: js.Any => Collection): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItems(value: () => Collection): Self = StObject.set(x, "items", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ControlSettings extends StObject {
    
    var menu: Menu = js.native
  }
  object ControlSettings {
    
    @scala.inline
    def apply(menu: Menu): ControlSettings = {
      val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlSettings]
    }
    
    @scala.inline
    implicit class ControlSettingsMutableBuilder[Self <: ControlSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Factory extends StObject {
    
    def create(settings: js.Any): Control = js.native
  }
  object Factory {
    
    @scala.inline
    def apply(create: js.Any => Control): Factory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[Factory]
    }
    
    @scala.inline
    implicit class FactoryMutableBuilder[Self <: Factory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: js.Any => Control): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
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
  
  @js.native
  trait Moveable extends StObject {
    
    def moveRel(elm: Node, rel: String): Control = js.native
  }
  object Moveable {
    
    @scala.inline
    def apply(moveRel: (Node, String) => Control): Moveable = {
      val __obj = js.Dynamic.literal(moveRel = js.Any.fromFunction2(moveRel))
      __obj.asInstanceOf[Moveable]
    }
    
    @scala.inline
    implicit class MoveableMutableBuilder[Self <: Moveable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMoveRel(value: (Node, String) => Control): Self = StObject.set(x, "moveRel", js.Any.fromFunction2(value))
    }
  }
}
