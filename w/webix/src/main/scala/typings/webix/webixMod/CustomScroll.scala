package typings.webix.webixMod

import typings.std.HTMLElement
import typings.webix.webixMod.uiNs.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomScroll extends js.Object {
  var scrollStep: Double = js.native
  def enable(html_node: HTMLElement): Unit = js.native
  def enable(html_node: baseview): Unit = js.native
  def init(): Unit = js.native
  def resize(): Unit = js.native
}

