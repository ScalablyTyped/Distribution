package typings.tinymce.tinymceMod

import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.std.Node
import typings.tinymce.tinymceMod.uiNs.Collection
import typings.tinymce.tinymceMod.uiNs.Container
import typings.tinymce.tinymceMod.uiNs.Control
import typings.tinymce.tinymceMod.uiNs.ControlSettings
import typings.tinymce.tinymceMod.uiNs.FloatPanel
import typings.tinymce.tinymceMod.uiNs.Menu
import typings.tinymce.tinymceMod.uiNs.Moveable
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
    var $el: JQuery[HTMLElement] = js.native
    var settings: ControlSettings = js.native
    def active(state: Boolean): Unit = js.native
    def disabled(state: Boolean): Unit = js.native
    def on(name: String, callback: String): Control = js.native
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
    def moveRel(elm: Node, rel: String): Control
  }
  
}

