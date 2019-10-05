package typings.tinymce.tinymceMod.dom

import typings.std.Element
import typings.std.Node
import typings.std.Range
import typings.std.Window
import typings.tinymce.tinymceMod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "dom.Selection")
@js.native
class Selection protected () extends js.Object {
  def this(dom: DOMUtils, win: Window, editor: Editor, serializer: Serializer) = this()
  def collapse(): Unit = js.native
  def collapse(toStart: Boolean): Unit = js.native
  def getBookmark(): js.Object = js.native
  def getBookmark(`type`: Double): js.Object = js.native
  def getBookmark(`type`: Double, normalized: Boolean): js.Object = js.native
  def getContent(): String = js.native
  def getContent(args: js.Object): String = js.native
  def getEnd(): Element = js.native
  def getEnd(real: Boolean): Element = js.native
  def getNode(): Element = js.native
  def getRng(w3c: Boolean): Range = js.native
  def getSel(): Selection = js.native
  def getStart(): Element = js.native
  def getStart(real: Boolean): Element = js.native
  def isCollapsed(): Boolean = js.native
  def moveToBookmark(bookmark: js.Object): Boolean = js.native
  def select(node: Element): Element = js.native
  def select(node: Element, content: Boolean): Element = js.native
  def selectorChanged(selector: String, callback: js.Function0[Unit]): Unit = js.native
  def setContent(content: String): Unit = js.native
  def setContent(content: String, args: js.Object): Unit = js.native
  def setCursorLocation(): Unit = js.native
  def setCursorLocation(node: Node): Unit = js.native
  def setCursorLocation(node: Node, offset: Double): Unit = js.native
  def setNode(elm: Element): Element = js.native
  def setRng(rng: Range): Unit = js.native
  def setRng(rng: Range, forward: Boolean): Unit = js.native
}

