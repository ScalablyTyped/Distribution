package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "ui")
@js.native
object uiNs extends js.Object {
  trait Collection extends js.Object
  
  trait Container extends js.Object {
    def add(items: js.Any): Collection
    def items(): Collection
  }
  
  @js.native
  class Control () extends js.Object {
    @JSName("$el")
    var $el: jqueryLib.JQuery[stdLib.HTMLElement] = js.native
    var settings: ControlSettings = js.native
    def active(state: scala.Boolean): scala.Unit = js.native
    def disabled(state: scala.Boolean): scala.Unit = js.native
    def on(name: java.lang.String, callback: java.lang.String): Control = js.native
    def tooltip(): Control = js.native
  }
  
  trait ControlSettings extends js.Object {
    var menu: Menu
  }
  
  trait Factory extends js.Object {
    def create(settings: js.Any): Control
  }
  
  @js.native
  trait FloatPanel
    extends Control
       with Moveable
  
  @js.native
  trait Menu
    extends FloatPanel
       with Container
  
  trait Moveable extends js.Object {
    def moveRel(elm: stdLib.Node, rel: java.lang.String): Control
  }
  
}

