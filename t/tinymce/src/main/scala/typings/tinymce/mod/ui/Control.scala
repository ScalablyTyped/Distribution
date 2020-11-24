package typings.tinymce.mod.ui

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tinymce", "ui.Control")
@js.native
class Control () extends js.Object {
  
  @JSName("$el")
  var $el: JQuery[HTMLElement] = js.native
  
  def active(state: Boolean): Unit = js.native
  
  def disabled(state: Boolean): Unit = js.native
  
  def on(name: String, callback: String): Control = js.native
  
  var settings: ControlSettings = js.native
  
  def tooltip(): Control = js.native
}
