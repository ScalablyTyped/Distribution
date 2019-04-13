package typings
package winjsLib.WinJSNs.UINs.XYFocusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.XYFocus")
@js.native
object ^ extends js.Object {
  var focusRoot: stdLib.HTMLElement = js.native
  def addEventListener(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  def findNextFocusElement(direction: java.lang.String): stdLib.HTMLElement = js.native
  def findNextFocusElement(direction: java.lang.String, options: XYFocusOptions): stdLib.HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_down(direction: winjsLib.winjsLibStrings.down): stdLib.HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_down(direction: winjsLib.winjsLibStrings.down, options: XYFocusOptions): stdLib.HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_left(direction: winjsLib.winjsLibStrings.left): stdLib.HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_left(direction: winjsLib.winjsLibStrings.left, options: XYFocusOptions): stdLib.HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_right(direction: winjsLib.winjsLibStrings.right): stdLib.HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_right(direction: winjsLib.winjsLibStrings.right, options: XYFocusOptions): stdLib.HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_up(direction: winjsLib.winjsLibStrings.up): stdLib.HTMLElement = js.native
  @JSName("findNextFocusElement")
  def findNextFocusElement_up(direction: winjsLib.winjsLibStrings.up, options: XYFocusOptions): stdLib.HTMLElement = js.native
  def moveFocus(direction: java.lang.String): stdLib.HTMLElement = js.native
  def moveFocus(direction: java.lang.String, options: XYFocusOptions): stdLib.HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_down(direction: winjsLib.winjsLibStrings.down): stdLib.HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_down(direction: winjsLib.winjsLibStrings.down, options: XYFocusOptions): stdLib.HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_left(direction: winjsLib.winjsLibStrings.left): stdLib.HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_left(direction: winjsLib.winjsLibStrings.left, options: XYFocusOptions): stdLib.HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_right(direction: winjsLib.winjsLibStrings.right): stdLib.HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_right(direction: winjsLib.winjsLibStrings.right, options: XYFocusOptions): stdLib.HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_up(direction: winjsLib.winjsLibStrings.up): stdLib.HTMLElement = js.native
  @JSName("moveFocus")
  def moveFocus_up(direction: winjsLib.winjsLibStrings.up, options: XYFocusOptions): stdLib.HTMLElement = js.native
  def onfocuschanged(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  def onfocuschanging(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, handler: stdLib.EventListener): scala.Unit = js.native
}

