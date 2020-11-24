package typings.webix.webix

import typings.std.HTMLElement
import typings.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomScroll extends js.Object {
  
  def enable(html_node: HTMLElement): Unit = js.native
  def enable(html_node: baseview): Unit = js.native
  
  def init(): Unit = js.native
  
  def resize(): Unit = js.native
  
  var scrollStep: Double = js.native
}
