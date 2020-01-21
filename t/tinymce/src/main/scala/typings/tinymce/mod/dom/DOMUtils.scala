package typings.tinymce.mod.dom

import typings.std.DocumentFragment
import typings.std.Document_
import typings.std.Element
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeList
import typings.std.Range
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "dom.DOMUtils")
@js.native
class DOMUtils protected () extends js.Object {
  def this(doc: Document_) = this()
  def this(doc: Document_, settings: js.Object) = this()
  def add[T](parentElm: String, name: String): Element | js.Array[T] = js.native
  def add[T](parentElm: String, name: String, attrs: js.Object): Element | js.Array[T] = js.native
  def add[T](parentElm: String, name: String, attrs: js.Object, html: String): Element | js.Array[T] = js.native
  def add[T](parentElm: String, name: String, attrs: js.Object, html: String, create: Boolean): Element | js.Array[T] = js.native
  def addClass[T](elm: String, cls: String): String | js.Array[T] = js.native
  def addStyle(cssText: String): Unit = js.native
  def bind(target: Element, name: String, func: js.Function0[Unit]): js.Function0[Unit] = js.native
  def bind(target: Element, name: String, func: js.Function0[Unit], scope: js.Object): js.Function0[Unit] = js.native
  def create(name: String): Element = js.native
  def create(name: String, attrs: js.Object): Element = js.native
  def create(name: String, attrs: js.Object, html: String): Element = js.native
  def createFragment(html: String): DocumentFragment = js.native
  def createHTML(name: String): String = js.native
  def createHTML(name: String, attrs: js.Object): String = js.native
  def createHTML(name: String, attrs: js.Object, html: String): String = js.native
  def createRng(): Range = js.native
  def decode(s: String): String = js.native
  def destroy(): Unit = js.native
  def encode(text: String): String = js.native
  def findCommonAncestor(a: Element, b: Element): Element = js.native
  def fire(target: Node, name: String, evt: js.Object): Event_ = js.native
  def get(n: String): Element = js.native
  def getAttrib(elm: String, name: String, defaultVal: String): String = js.native
  def getAttribs(): NodeList = js.native
  def getAttribs(elm: HTMLElement): NodeList = js.native
  def getNext(node: Node, selector: String): Node = js.native
  def getOuterHTML(elm: String): String = js.native
  def getParent(node: Node, selector: js.Any): Node = js.native
  def getParent(node: Node, selector: js.Any, root: Node): Node = js.native
  def getParents[T](node: Node, selector: js.Function0[Unit]): js.Array[T] = js.native
  def getParents[T](node: Node, selector: js.Function0[Unit], root: Node): js.Array[T] = js.native
  def getPos(elm: Element): js.Object = js.native
  def getPos(elm: Element, rootElm: Element): js.Object = js.native
  def getPrev(node: Node, selector: String): Node = js.native
  def getRect(elm: Element): js.Object = js.native
  def getRoot(): Element = js.native
  def getSize(elm: Element): js.Object = js.native
  def getStyle(elm: String, name: String, computed: Boolean): String = js.native
  def getViewPort(): js.Object = js.native
  def getViewPort(win: Window_): js.Object = js.native
  def hasClass(elm: String, cls: String): Boolean = js.native
  def hide(elm: String): Unit = js.native
  def insertAfter[T](node: Element, referenceNode: Element): Element | js.Array[T] = js.native
  def is(elm: Node, selector: String): Boolean = js.native
  def isBlock(node: Node): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def isEmpty(elements: js.Object): Boolean = js.native
  def isHidden(elm: String): Boolean = js.native
  def loadCSS(url: String): Unit = js.native
  def nodeIndex(node: Node): Double = js.native
  def nodeIndex(node: Node, normalized: Boolean): Double = js.native
  def parseStyle(cssText: String): js.Object = js.native
  def remove[T](node: String): Element | js.Array[T] = js.native
  def remove[T](node: String, keepChildren: Boolean): Element | js.Array[T] = js.native
  def remove[T](node: Element): Element | js.Array[T] = js.native
  def remove[T](node: Element, keepChildren: Boolean): Element | js.Array[T] = js.native
  def removeAllAttribs(e: Element): Unit = js.native
  def removeClass[T](elm: String, cls: String): String | js.Array[T] = js.native
  def rename(elm: Element, name: String): Element = js.native
  def replace(newElm: Element, oldElm: Element): Unit = js.native
  def replace(newElm: Element, oldElm: Element, keepChildren: Boolean): Unit = js.native
  def run[T](elm: String, func: js.Function0[Unit]): js.Object | js.Array[T] = js.native
  def run[T](elm: String, func: js.Function0[Unit], scope: js.Object): js.Object | js.Array[T] = js.native
  def select[T](selector: String): js.Array[T] = js.native
  def select[T](selector: String, scope: js.Object): js.Array[T] = js.native
  def serializeStyle(styles: js.Object): String = js.native
  def serializeStyle(styles: js.Object, name: String): String = js.native
  def setAttrib(elm: Element, name: String, value: String): Unit = js.native
  def setAttribs(elm: Element, attrs: js.Object): Unit = js.native
  def setHTML(elm: Element, html: String): Unit = js.native
  def setOuterHTML(elm: Element, html: js.Object): Unit = js.native
  def setStyle(elm: String, name: String, value: String): Unit = js.native
  def setStyles(elm: Element, styles: js.Object): Unit = js.native
  def show(elm: String): Unit = js.native
  def split(parentElm: Element, splitElm: Element): Element = js.native
  def split(parentElm: Element, splitElm: Element, replacementElm: Element): Element = js.native
  def toHex(rgbVal: String): String = js.native
  def toggleClass(elm: Element, cls: String): Unit = js.native
  def toggleClass(elm: Element, cls: String, state: String): Unit = js.native
  def unbind[T](target: Element, name: String, func: js.Function0[Unit]): Boolean | js.Array[T] = js.native
  def uniqueId(): String = js.native
  def uniqueId(prefix: String): String = js.native
}

