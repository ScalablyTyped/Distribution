package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "dom")
@js.native
object domNs extends js.Object {
  @js.native
  trait BookmarkManager extends js.Object {
    def getBookmark(): js.Object = js.native
    def getBookmark(`type`: scala.Double): js.Object = js.native
    def getBookmark(`type`: scala.Double, normalized: scala.Boolean): js.Object = js.native
    def isBookmarkNode(node: stdLib.HTMLElement): scala.Boolean = js.native
    def moveToBookmark(bookmark: js.Object): scala.Boolean = js.native
  }
  
  @js.native
  class DOMUtils protected () extends js.Object {
    def this(doc: stdLib.Document) = this()
    def this(doc: stdLib.Document, settings: js.Object) = this()
    def add[T](parentElm: java.lang.String, name: java.lang.String): stdLib.Element | js.Array[T] = js.native
    def add[T](parentElm: java.lang.String, name: java.lang.String, attrs: js.Object): stdLib.Element | js.Array[T] = js.native
    def add[T](parentElm: java.lang.String, name: java.lang.String, attrs: js.Object, html: java.lang.String): stdLib.Element | js.Array[T] = js.native
    def add[T](
      parentElm: java.lang.String,
      name: java.lang.String,
      attrs: js.Object,
      html: java.lang.String,
      create: scala.Boolean
    ): stdLib.Element | js.Array[T] = js.native
    def addClass[T](elm: java.lang.String, cls: java.lang.String): java.lang.String | js.Array[T] = js.native
    def addStyle(cssText: java.lang.String): scala.Unit = js.native
    def bind(target: stdLib.Element, name: java.lang.String, func: js.Function0[scala.Unit]): js.Function0[scala.Unit] = js.native
    def bind(target: stdLib.Element, name: java.lang.String, func: js.Function0[scala.Unit], scope: js.Object): js.Function0[scala.Unit] = js.native
    def create(name: java.lang.String): stdLib.Element = js.native
    def create(name: java.lang.String, attrs: js.Object): stdLib.Element = js.native
    def create(name: java.lang.String, attrs: js.Object, html: java.lang.String): stdLib.Element = js.native
    def createFragment(html: java.lang.String): stdLib.DocumentFragment = js.native
    def createHTML(name: java.lang.String): java.lang.String = js.native
    def createHTML(name: java.lang.String, attrs: js.Object): java.lang.String = js.native
    def createHTML(name: java.lang.String, attrs: js.Object, html: java.lang.String): java.lang.String = js.native
    def createRng(): stdLib.Range = js.native
    def decode(s: java.lang.String): java.lang.String = js.native
    def destroy(): scala.Unit = js.native
    def encode(text: java.lang.String): java.lang.String = js.native
    def findCommonAncestor(a: stdLib.Element, b: stdLib.Element): stdLib.Element = js.native
    def fire(target: stdLib.Node, name: java.lang.String, evt: js.Object): stdLib.Event = js.native
    def get(n: java.lang.String): stdLib.Element = js.native
    def getAttrib(elm: java.lang.String, name: java.lang.String, defaultVal: java.lang.String): java.lang.String = js.native
    def getAttribs(): stdLib.NodeList = js.native
    def getAttribs(elm: stdLib.HTMLElement): stdLib.NodeList = js.native
    def getNext(node: stdLib.Node, selector: java.lang.String): stdLib.Node = js.native
    def getOuterHTML(elm: java.lang.String): java.lang.String = js.native
    def getParent(node: stdLib.Node, selector: js.Any): stdLib.Node = js.native
    def getParent(node: stdLib.Node, selector: js.Any, root: stdLib.Node): stdLib.Node = js.native
    def getParents[T](node: stdLib.Node, selector: js.Function0[scala.Unit]): js.Array[T] = js.native
    def getParents[T](node: stdLib.Node, selector: js.Function0[scala.Unit], root: stdLib.Node): js.Array[T] = js.native
    def getPos(elm: stdLib.Element): js.Object = js.native
    def getPos(elm: stdLib.Element, rootElm: stdLib.Element): js.Object = js.native
    def getPrev(node: stdLib.Node, selector: java.lang.String): stdLib.Node = js.native
    def getRect(elm: stdLib.Element): js.Object = js.native
    def getRoot(): stdLib.Element = js.native
    def getSize(elm: stdLib.Element): js.Object = js.native
    def getStyle(elm: java.lang.String, name: java.lang.String, computed: scala.Boolean): java.lang.String = js.native
    def getViewPort(): js.Object = js.native
    def getViewPort(win: stdLib.Window): js.Object = js.native
    def hasClass(elm: java.lang.String, cls: java.lang.String): scala.Boolean = js.native
    def hide(elm: java.lang.String): scala.Unit = js.native
    def insertAfter[T](node: stdLib.Element, referenceNode: stdLib.Element): stdLib.Element | js.Array[T] = js.native
    def is(elm: stdLib.Node, selector: java.lang.String): scala.Unit = js.native
    def isBlock(node: stdLib.Node): scala.Boolean = js.native
    def isEmpty(): scala.Boolean = js.native
    def isEmpty(elements: js.Object): scala.Boolean = js.native
    def isHidden(elm: java.lang.String): scala.Boolean = js.native
    def loadCSS(url: java.lang.String): scala.Unit = js.native
    def nodeIndex(node: stdLib.Node): scala.Double = js.native
    def nodeIndex(node: stdLib.Node, normalized: scala.Boolean): scala.Double = js.native
    def parseStyle(cssText: java.lang.String): js.Object = js.native
    def remove[T](node: java.lang.String): stdLib.Element | js.Array[T] = js.native
    def remove[T](node: java.lang.String, keepChildren: scala.Boolean): stdLib.Element | js.Array[T] = js.native
    def remove[T](node: stdLib.Element): stdLib.Element | js.Array[T] = js.native
    def remove[T](node: stdLib.Element, keepChildren: scala.Boolean): stdLib.Element | js.Array[T] = js.native
    def removeAllAttribs(e: stdLib.Element): scala.Unit = js.native
    def removeClass[T](elm: java.lang.String, cls: java.lang.String): java.lang.String | js.Array[T] = js.native
    def rename(elm: stdLib.Element, name: java.lang.String): stdLib.Element = js.native
    def replace(newElm: stdLib.Element, oldElm: stdLib.Element): scala.Unit = js.native
    def replace(newElm: stdLib.Element, oldElm: stdLib.Element, keepChildren: scala.Boolean): scala.Unit = js.native
    def run[T](elm: java.lang.String, func: js.Function0[scala.Unit]): js.Object | js.Array[T] = js.native
    def run[T](elm: java.lang.String, func: js.Function0[scala.Unit], scope: js.Object): js.Object | js.Array[T] = js.native
    def select[T](selector: java.lang.String): js.Array[T] = js.native
    def select[T](selector: java.lang.String, scope: js.Object): js.Array[T] = js.native
    def serializeStyle(styles: js.Object): java.lang.String = js.native
    def serializeStyle(styles: js.Object, name: java.lang.String): java.lang.String = js.native
    def setAttrib(elm: stdLib.Element, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def setAttribs(elm: stdLib.Element, attrs: js.Object): scala.Unit = js.native
    def setHTML(elm: stdLib.Element, html: java.lang.String): scala.Unit = js.native
    def setOuterHTML(elm: stdLib.Element, html: js.Object): scala.Unit = js.native
    def setStyle(elm: java.lang.String, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
    def setStyles(elm: stdLib.Element, styles: js.Object): scala.Unit = js.native
    def show(elm: java.lang.String): scala.Unit = js.native
    def split(parentElm: stdLib.Element, splitElm: stdLib.Element): stdLib.Element = js.native
    def split(parentElm: stdLib.Element, splitElm: stdLib.Element, replacementElm: stdLib.Element): stdLib.Element = js.native
    def toHex(rgbVal: java.lang.String): java.lang.String = js.native
    def toggleClass(elm: stdLib.Element, cls: java.lang.String): scala.Unit = js.native
    def toggleClass(elm: stdLib.Element, cls: java.lang.String, state: java.lang.String): scala.Unit = js.native
    def unbind[T](target: stdLib.Element, name: java.lang.String, func: js.Function0[scala.Unit]): scala.Boolean | js.Array[T] = js.native
    def uniqueId(): java.lang.String = js.native
    def uniqueId(prefix: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  class DomQuery () extends js.Object {
    def this(selector: java.lang.String) = this()
    def this(selector: java.lang.String, context: stdLib.Document) = this()
    def add[T](items: js.Array[T]): DomQuery = js.native
    def add[T](items: js.Array[T], sort: scala.Boolean): DomQuery = js.native
    def addClass(className: java.lang.String): DomQuery = js.native
    def after(content: java.lang.String): DomQuery = js.native
    def append(content: java.lang.String): DomQuery = js.native
    def appendTo(`val`: java.lang.String): DomQuery = js.native
    def attr(name: java.lang.String): DomQuery | java.lang.String = js.native
    def attr(name: java.lang.String, value: java.lang.String): DomQuery | java.lang.String = js.native
    def before(content: java.lang.String): DomQuery = js.native
    def children(node: java.lang.String): DomQuery = js.native
    def children(node: stdLib.Element): DomQuery = js.native
    def closest(selector: java.lang.String): DomQuery = js.native
    def contents(node: java.lang.String): DomQuery = js.native
    def contents(node: stdLib.Element): DomQuery = js.native
    def css(name: java.lang.String): DomQuery | java.lang.String = js.native
    def css(name: java.lang.String, value: java.lang.String): DomQuery | java.lang.String = js.native
    def each(callback: js.Function0[scala.Unit]): DomQuery = js.native
    def each(obj: js.Object, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def empty(): DomQuery = js.native
    def eq(index: scala.Double): DomQuery = js.native
    def extend(target: js.Object, `object`: js.Object): js.Object = js.native
    def filter(selector: java.lang.String): DomQuery = js.native
    def find(selector: java.lang.String): DomQuery = js.native
    def first(): DomQuery = js.native
    def grep[T](array: js.Array[T], callback: js.Function0[scala.Unit]): js.Array[T] = js.native
    def hasClass(className: java.lang.String): scala.Boolean = js.native
    def hide(): DomQuery = js.native
    def html(): DomQuery | java.lang.String = js.native
    def html(value: java.lang.String): DomQuery | java.lang.String = js.native
    def inArray[T](item: js.Object, array: js.Array[T]): scala.Double = js.native
    def is(selector: java.lang.String): scala.Boolean = js.native
    def isArray(array: js.Object): scala.Boolean = js.native
    def last(): DomQuery = js.native
    def makeArray[T](`object`: js.Object): js.Array[T] = js.native
    def next(node: java.lang.String): DomQuery = js.native
    def next(node: stdLib.Element): DomQuery = js.native
    def nextUntil(node: java.lang.String, until: java.lang.String): DomQuery = js.native
    def nextUntil(node: stdLib.Element, until: java.lang.String): DomQuery = js.native
    def off(): DomQuery = js.native
    def off(name: java.lang.String): DomQuery = js.native
    def off(name: java.lang.String, callback: js.Function0[scala.Unit]): DomQuery = js.native
    def offset(): js.Object | DomQuery = js.native
    def offset(offset: js.Object): js.Object | DomQuery = js.native
    def on(name: java.lang.String, callback: js.Function0[scala.Unit]): DomQuery = js.native
    def parent(node: java.lang.String): DomQuery = js.native
    def parent(node: stdLib.Element): DomQuery = js.native
    def parents(node: java.lang.String): DomQuery = js.native
    def parents(node: stdLib.Element): DomQuery = js.native
    def parentsUntil(node: java.lang.String, until: java.lang.String): DomQuery = js.native
    def parentsUntil(node: stdLib.Element, until: java.lang.String): DomQuery = js.native
    def prepend(content: java.lang.String): DomQuery = js.native
    def prependTo(`val`: java.lang.String): DomQuery = js.native
    def prev(node: java.lang.String): DomQuery = js.native
    def prev(node: stdLib.Element): DomQuery = js.native
    def prevUntil(node: java.lang.String, until: java.lang.String): DomQuery = js.native
    def prevUntil(node: stdLib.Element, until: java.lang.String): DomQuery = js.native
    def remove(): DomQuery = js.native
    def removeAttr(name: java.lang.String): DomQuery | java.lang.String = js.native
    def removeClass(className: java.lang.String): DomQuery = js.native
    def replaceWith(content: java.lang.String): DomQuery = js.native
    def show(): DomQuery = js.native
    def slice(start: scala.Double): DomQuery = js.native
    def slice(start: scala.Double, end: scala.Double): DomQuery = js.native
    def text(): DomQuery | java.lang.String = js.native
    def text(value: java.lang.String): DomQuery | java.lang.String = js.native
    def toArray[T](): js.Array[T] = js.native
    def toggleClass(className: java.lang.String): DomQuery = js.native
    def toggleClass(className: java.lang.String, state: scala.Boolean): DomQuery = js.native
    def trigger(name: java.lang.String): DomQuery = js.native
    def trim(str: java.lang.String): java.lang.String = js.native
    def unwrap(): DomQuery = js.native
    def wrap(content: java.lang.String): DomQuery = js.native
    def wrapAll(content: java.lang.String): DomQuery = js.native
    def wrapInner(content: java.lang.String): DomQuery = js.native
  }
  
  @js.native
  trait EventUtils extends js.Object {
    def bind(target: js.Object, names: java.lang.String, callback: js.Function0[scala.Unit], scope: js.Object): js.Function0[scala.Unit] = js.native
    def clean(target: js.Object): EventUtils = js.native
    def fire(target: js.Object, name: java.lang.String): EventUtils = js.native
    def fire(target: js.Object, name: java.lang.String, args: js.Object): EventUtils = js.native
    def unbind(target: js.Object): EventUtils = js.native
    def unbind(target: js.Object, names: java.lang.String): EventUtils = js.native
    def unbind(target: js.Object, names: java.lang.String, callback: js.Function0[scala.Unit]): EventUtils = js.native
  }
  
  
  trait RangeUtils extends js.Object {
    def compareRanges(rng1: stdLib.Range, rng2: stdLib.Range): scala.Boolean
    def getCaretRangeFromPoint(clientX: scala.Double, clientY: scala.Double, doc: stdLib.Document): stdLib.Range
  }
  
  @js.native
  trait ScriptLoader extends js.Object {
    def add(url: java.lang.String): scala.Unit = js.native
    def add(url: java.lang.String, success: js.Function0[scala.Unit]): scala.Unit = js.native
    def add(url: java.lang.String, success: js.Function0[scala.Unit], scope: js.Object): scala.Unit = js.native
    def add(
      url: java.lang.String,
      success: js.Function0[scala.Unit],
      scope: js.Object,
      failure: js.Function0[scala.Unit]
    ): scala.Unit = js.native
    def isDone(url: java.lang.String): scala.Boolean = js.native
    def load(url: java.lang.String): scala.Unit = js.native
    def load(url: java.lang.String, callback1: js.Function0[scala.Unit]): scala.Unit = js.native
    def load(url: java.lang.String, callback1: js.Function0[scala.Unit], callback2: js.Function0[scala.Unit]): scala.Unit = js.native
    def loadQueue(): scala.Unit = js.native
    def loadQueue(success: js.Function0[scala.Unit]): scala.Unit = js.native
    def loadQueue(success: js.Function0[scala.Unit], failure: js.Function0[scala.Unit]): scala.Unit = js.native
    def loadQueue(success: js.Function0[scala.Unit], failure: js.Function0[scala.Unit], scope: js.Object): scala.Unit = js.native
    def loadScripts(scripts: js.Array[java.lang.String]): scala.Unit = js.native
    def loadScripts(scripts: js.Array[java.lang.String], callback1: js.Function0[scala.Unit]): scala.Unit = js.native
    def loadScripts(scripts: js.Array[java.lang.String], callback1: js.Function0[scala.Unit], scope: js.Object): scala.Unit = js.native
    def loadScripts(
      scripts: js.Array[java.lang.String],
      callback1: js.Function0[scala.Unit],
      scope: js.Object,
      callback2: js.Function0[scala.Unit]
    ): scala.Unit = js.native
    def markDone(url: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class Selection protected () extends js.Object {
    def this(dom: DOMUtils, win: stdLib.Window, editor: tinymceLib.tinymceMod.Editor, serializer: Serializer) = this()
    def collapse(): scala.Unit = js.native
    def collapse(toStart: scala.Boolean): scala.Unit = js.native
    def getBookmark(): js.Object = js.native
    def getBookmark(`type`: scala.Double): js.Object = js.native
    def getBookmark(`type`: scala.Double, normalized: scala.Boolean): js.Object = js.native
    def getContent(): java.lang.String = js.native
    def getContent(args: js.Object): java.lang.String = js.native
    def getEnd(): stdLib.Element = js.native
    def getEnd(real: scala.Boolean): stdLib.Element = js.native
    def getNode(): stdLib.Element = js.native
    def getRng(w3c: scala.Boolean): stdLib.Range = js.native
    def getSel(): Selection = js.native
    def getStart(): stdLib.Element = js.native
    def getStart(real: scala.Boolean): stdLib.Element = js.native
    def isCollapsed(): scala.Boolean = js.native
    def moveToBookmark(bookmark: js.Object): scala.Boolean = js.native
    def select(node: stdLib.Element): stdLib.Element = js.native
    def select(node: stdLib.Element, content: scala.Boolean): stdLib.Element = js.native
    def selectorChanged(selector: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def setContent(content: java.lang.String): scala.Unit = js.native
    def setContent(content: java.lang.String, args: js.Object): scala.Unit = js.native
    def setCursorLocation(): scala.Unit = js.native
    def setCursorLocation(node: tinymceLib.tinymceMod.htmlNs.Node): scala.Unit = js.native
    def setCursorLocation(node: tinymceLib.tinymceMod.htmlNs.Node, offset: scala.Double): scala.Unit = js.native
    def setNode(elm: stdLib.Element): stdLib.Element = js.native
    def setRng(rng: stdLib.Range): scala.Unit = js.native
    def setRng(rng: stdLib.Range, forward: scala.Boolean): scala.Unit = js.native
  }
  
  @js.native
  class Serializer protected () extends js.Object {
    def this(settings: js.Object) = this()
    def this(settings: js.Object, editor: tinymceLib.tinymceMod.Editor) = this()
    def addAttributeFilter(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def addNodeFilter(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def addRules(rules: java.lang.String): scala.Unit = js.native
    def addTempAttr(name: java.lang.String): scala.Unit = js.native
    def serialize(node: stdLib.HTMLElement, args: js.Object): scala.Unit = js.native
    def setRules(rules: java.lang.String): scala.Unit = js.native
  }
  
  
  trait TreeWalker extends js.Object {
    def current(): tinymceLib.tinymceMod.htmlNs.Node
    def next(): tinymceLib.tinymceMod.htmlNs.Node
    def prev(): tinymceLib.tinymceMod.htmlNs.Node
  }
  
}

