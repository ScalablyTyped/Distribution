package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomScroll extends js.Object {
  var scrollStep: scala.Double = js.native
  def enable(html_node: stdLib.HTMLElement): scala.Unit = js.native
  def enable(html_node: webixLib.webixMod.uiNs.baseview): scala.Unit = js.native
  def init(): scala.Unit = js.native
  def resize(): scala.Unit = js.native
}

