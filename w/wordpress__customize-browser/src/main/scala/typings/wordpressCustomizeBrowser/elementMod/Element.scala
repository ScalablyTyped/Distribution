package typings.wordpressCustomizeBrowser.elementMod

import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.wordpressCustomizeBrowser.valueMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/Element", "Element")
@js.native
class Element () extends Value[String] {
  
  var element: JQuery[HTMLElement] = js.native
  
  var events: String = js.native
  
  def find(selector: js.Any): JQuery[HTMLElement] = js.native
  
  def initialize(element: JQuery[HTMLElement]): Unit = js.native
  def initialize(element: JQuery[HTMLElement], options: js.Object): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def update(): Unit = js.native
  def update(to: String): Unit = js.native
  def update(to: JQuery[HTMLElement]): Unit = js.native
}
/* static members */
@JSImport("@wordpress/customize-browser/Element", "Element")
@js.native
object Element extends js.Object {
  
  var synchronizer: ElementSynchronizer = js.native
}
