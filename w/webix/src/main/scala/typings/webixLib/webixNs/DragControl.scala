package typings
package webixLib.webixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragControl extends js.Object {
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  var left: scala.Double = js.native
  var top: scala.Double = js.native
  @JSName("$drag")
  def $drag(source: stdLib.HTMLElement, ev: stdLib.Event): stdLib.HTMLElement = js.native
  @JSName("$dragIn")
  def $dragIn(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
  @JSName("$dragOut")
  def $dragOut(
    source: stdLib.HTMLElement,
    target: stdLib.HTMLElement,
    drop: stdLib.HTMLElement,
    event: stdLib.Event
  ): scala.Unit = js.native
  @JSName("$dragPos")
  def $dragPos(args: js.Any*): js.Any = js.native
  @JSName("$drop")
  def $drop(source: stdLib.HTMLElement, target: stdLib.HTMLElement, ev: stdLib.Event): scala.Unit = js.native
  def addDrag(node: java.lang.String, ctrl: js.Any): scala.Unit = js.native
  def addDrag(node: scala.Double, ctrl: js.Any): scala.Unit = js.native
  def addDrag(node: stdLib.HTMLElement, ctrl: js.Any): scala.Unit = js.native
  def addDrop(node: java.lang.String, ctrl: js.Any): scala.Unit = js.native
  def addDrop(node: java.lang.String, ctrl: js.Any, master_mode: scala.Boolean): scala.Unit = js.native
  def addDrop(node: scala.Double, ctrl: js.Any): scala.Unit = js.native
  def addDrop(node: scala.Double, ctrl: js.Any, master_mode: scala.Boolean): scala.Unit = js.native
  def addDrop(node: stdLib.HTMLElement, ctrl: js.Any): scala.Unit = js.native
  def addDrop(node: stdLib.HTMLElement, ctrl: js.Any, master_mode: scala.Boolean): scala.Unit = js.native
  def createDrag(event: stdLib.Event): scala.Unit = js.native
  def destroyDrag(): scala.Unit = js.native
  def getContext(): js.Any = js.native
  def getMaster(target: js.Any): js.Any = js.native
  def getNode(): stdLib.HTMLElement = js.native
  def sendSignal(signal: java.lang.String): scala.Unit = js.native
}

