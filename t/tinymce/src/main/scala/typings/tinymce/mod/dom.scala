package typings.tinymce.mod

import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeList
import typings.std.Range
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dom {
  
  @JSImport("tinymce", "dom.DOMUtils")
  @js.native
  class DOMUtils protected () extends StObject {
    def this(doc: Document) = this()
    def this(doc: Document, settings: js.Object) = this()
    
    def add[T](parentElm: String, name: String): Element | js.Array[T] = js.native
    def add[T](parentElm: String, name: String, attrs: js.Object): Element | js.Array[T] = js.native
    def add[T](parentElm: String, name: String, attrs: js.Object, html: String): Element | js.Array[T] = js.native
    def add[T](parentElm: String, name: String, attrs: js.Object, html: String, create: Boolean): Element | js.Array[T] = js.native
    def add[T](parentElm: String, name: String, attrs: js.Object, html: Unit, create: Boolean): Element | js.Array[T] = js.native
    def add[T](parentElm: String, name: String, attrs: Unit, html: String): Element | js.Array[T] = js.native
    def add[T](parentElm: String, name: String, attrs: Unit, html: String, create: Boolean): Element | js.Array[T] = js.native
    def add[T](parentElm: String, name: String, attrs: Unit, html: Unit, create: Boolean): Element | js.Array[T] = js.native
    
    def addClass[T](elm: String, cls: String): String | js.Array[T] = js.native
    
    def addStyle(cssText: String): Unit = js.native
    
    def bind(target: Element, name: String, func: js.Function0[Unit]): js.Function0[Unit] = js.native
    def bind(target: Element, name: String, func: js.Function0[Unit], scope: js.Object): js.Function0[Unit] = js.native
    
    def create(name: String): Element = js.native
    def create(name: String, attrs: js.Object): Element = js.native
    def create(name: String, attrs: js.Object, html: String): Element = js.native
    def create(name: String, attrs: Unit, html: String): Element = js.native
    
    def createFragment(html: String): DocumentFragment = js.native
    
    def createHTML(name: String): String = js.native
    def createHTML(name: String, attrs: js.Object): String = js.native
    def createHTML(name: String, attrs: js.Object, html: String): String = js.native
    def createHTML(name: String, attrs: Unit, html: String): String = js.native
    
    def createRng(): Range = js.native
    
    def decode(s: String): String = js.native
    
    def destroy(): Unit = js.native
    
    def encode(text: String): String = js.native
    
    def findCommonAncestor(a: Element, b: Element): Element = js.native
    
    def fire(target: Node, name: String, evt: js.Object): Event = js.native
    
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
    def getViewPort(win: Window): js.Object = js.native
    
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
  
  @JSImport("tinymce", "dom.DomQuery")
  @js.native
  class DomQuery () extends StObject {
    def this(selector: String) = this()
    def this(selector: String, context: Document) = this()
    def this(selector: Unit, context: Document) = this()
    
    def add[T](items: js.Array[T]): DomQuery = js.native
    def add[T](items: js.Array[T], sort: Boolean): DomQuery = js.native
    
    def addClass(className: String): DomQuery = js.native
    
    def after(content: String): DomQuery = js.native
    
    def append(content: String): DomQuery = js.native
    
    def appendTo(`val`: String): DomQuery = js.native
    
    def attr(name: String): DomQuery | String = js.native
    def attr(name: String, value: String): DomQuery | String = js.native
    
    def before(content: String): DomQuery = js.native
    
    def children(node: String): DomQuery = js.native
    def children(node: Element): DomQuery = js.native
    
    def closest(selector: String): DomQuery = js.native
    
    def contents(node: String): DomQuery = js.native
    def contents(node: Element): DomQuery = js.native
    
    def css(name: String): DomQuery | String = js.native
    def css(name: String, value: String): DomQuery | String = js.native
    
    def each(callback: js.Function0[Unit]): DomQuery = js.native
    def each(obj: js.Object, callback: js.Function0[Unit]): Unit = js.native
    
    def empty(): DomQuery = js.native
    
    def eq(index: Double): DomQuery = js.native
    
    def extend(target: js.Object, `object`: js.Object): js.Object = js.native
    
    def filter(selector: String): DomQuery = js.native
    
    def find(selector: String): DomQuery = js.native
    
    def first(): DomQuery = js.native
    
    def grep[T](array: js.Array[T], callback: js.Function0[Unit]): js.Array[T] = js.native
    
    def hasClass(className: String): Boolean = js.native
    
    def hide(): DomQuery = js.native
    
    def html(): DomQuery | String = js.native
    def html(value: String): DomQuery | String = js.native
    
    def inArray[T](item: js.Object, array: js.Array[T]): Double = js.native
    
    def is(selector: String): Boolean = js.native
    
    def isArray(array: js.Object): Boolean = js.native
    
    def last(): DomQuery = js.native
    
    def makeArray[T](`object`: js.Object): js.Array[T] = js.native
    
    def next(node: String): DomQuery = js.native
    def next(node: Element): DomQuery = js.native
    
    def nextUntil(node: String, until: String): DomQuery = js.native
    def nextUntil(node: Element, until: String): DomQuery = js.native
    
    def off(): DomQuery = js.native
    def off(name: String): DomQuery = js.native
    def off(name: String, callback: js.Function0[Unit]): DomQuery = js.native
    def off(name: Unit, callback: js.Function0[Unit]): DomQuery = js.native
    
    def offset(): js.Object | DomQuery = js.native
    def offset(offset: js.Object): js.Object | DomQuery = js.native
    
    def on(name: String, callback: js.Function0[Unit]): DomQuery = js.native
    
    def parent(node: String): DomQuery = js.native
    def parent(node: Element): DomQuery = js.native
    
    def parents(node: String): DomQuery = js.native
    def parents(node: Element): DomQuery = js.native
    
    def parentsUntil(node: String, until: String): DomQuery = js.native
    def parentsUntil(node: Element, until: String): DomQuery = js.native
    
    def prepend(content: String): DomQuery = js.native
    
    def prependTo(`val`: String): DomQuery = js.native
    
    def prev(node: String): DomQuery = js.native
    def prev(node: Element): DomQuery = js.native
    
    def prevUntil(node: String, until: String): DomQuery = js.native
    def prevUntil(node: Element, until: String): DomQuery = js.native
    
    def remove(): DomQuery = js.native
    
    def removeAttr(name: String): DomQuery | String = js.native
    
    def removeClass(className: String): DomQuery = js.native
    
    def replaceWith(content: String): DomQuery = js.native
    
    def show(): DomQuery = js.native
    
    def slice(start: Double): DomQuery = js.native
    def slice(start: Double, end: Double): DomQuery = js.native
    
    def text(): DomQuery | String = js.native
    def text(value: String): DomQuery | String = js.native
    
    def toArray[T](): js.Array[T] = js.native
    
    def toggleClass(className: String): DomQuery = js.native
    def toggleClass(className: String, state: Boolean): DomQuery = js.native
    
    def trigger(name: String): DomQuery = js.native
    
    def trim(str: String): String = js.native
    
    def unwrap(): DomQuery = js.native
    
    def wrap(content: String): DomQuery = js.native
    
    def wrapAll(content: String): DomQuery = js.native
    
    def wrapInner(content: String): DomQuery = js.native
  }
  
  @JSImport("tinymce", "dom.Selection")
  @js.native
  class Selection protected () extends StObject {
    def this(dom: DOMUtils, win: Window, editor: Editor, serializer: Serializer) = this()
    
    def collapse(): Unit = js.native
    def collapse(toStart: Boolean): Unit = js.native
    
    def getBookmark(): js.Object = js.native
    def getBookmark(`type`: Double): js.Object = js.native
    def getBookmark(`type`: Double, normalized: Boolean): js.Object = js.native
    def getBookmark(`type`: Unit, normalized: Boolean): js.Object = js.native
    
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
    def setCursorLocation(node: Unit, offset: Double): Unit = js.native
    def setCursorLocation(node: Node): Unit = js.native
    def setCursorLocation(node: Node, offset: Double): Unit = js.native
    
    def setNode(elm: Element): Element = js.native
    
    def setRng(rng: Range): Unit = js.native
    def setRng(rng: Range, forward: Boolean): Unit = js.native
  }
  
  @JSImport("tinymce", "dom.Serializer")
  @js.native
  class Serializer protected () extends StObject {
    def this(settings: js.Object) = this()
    def this(settings: js.Object, editor: Editor) = this()
    
    def addAttributeFilter(callback: js.Function0[Unit]): Unit = js.native
    
    def addNodeFilter(callback: js.Function0[Unit]): Unit = js.native
    
    def addRules(rules: String): Unit = js.native
    
    def addTempAttr(name: String): Unit = js.native
    
    def serialize(node: HTMLElement, args: js.Object): Unit = js.native
    
    def setRules(rules: String): Unit = js.native
  }
  
  @js.native
  trait BookmarkManager extends StObject {
    
    def getBookmark(): js.Object = js.native
    def getBookmark(`type`: Double): js.Object = js.native
    def getBookmark(`type`: Double, normalized: Boolean): js.Object = js.native
    def getBookmark(`type`: Unit, normalized: Boolean): js.Object = js.native
    
    def isBookmarkNode(node: HTMLElement): Boolean = js.native
    
    def moveToBookmark(bookmark: js.Object): Boolean = js.native
  }
  
  @js.native
  trait EventUtils extends StObject {
    
    def bind(target: js.Object, names: String, callback: js.Function0[Unit], scope: js.Object): js.Function0[Unit] = js.native
    
    def clean(target: js.Object): EventUtils = js.native
    
    def fire(target: js.Object, name: String): EventUtils = js.native
    def fire(target: js.Object, name: String, args: js.Object): EventUtils = js.native
    
    def unbind(target: js.Object): EventUtils = js.native
    def unbind(target: js.Object, names: String): EventUtils = js.native
    def unbind(target: js.Object, names: String, callback: js.Function0[Unit]): EventUtils = js.native
    def unbind(target: js.Object, names: Unit, callback: js.Function0[Unit]): EventUtils = js.native
  }
  
  trait RangeUtils extends StObject {
    
    def compareRanges(rng1: Range, rng2: Range): Boolean
    
    def getCaretRangeFromPoint(clientX: Double, clientY: Double, doc: Document): Range
  }
  object RangeUtils {
    
    @scala.inline
    def apply(
      compareRanges: (Range, Range) => Boolean,
      getCaretRangeFromPoint: (Double, Double, Document) => Range
    ): RangeUtils = {
      val __obj = js.Dynamic.literal(compareRanges = js.Any.fromFunction2(compareRanges), getCaretRangeFromPoint = js.Any.fromFunction3(getCaretRangeFromPoint))
      __obj.asInstanceOf[RangeUtils]
    }
    
    @scala.inline
    implicit class RangeUtilsMutableBuilder[Self <: RangeUtils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompareRanges(value: (Range, Range) => Boolean): Self = StObject.set(x, "compareRanges", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetCaretRangeFromPoint(value: (Double, Double, Document) => Range): Self = StObject.set(x, "getCaretRangeFromPoint", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait ScriptLoader extends StObject {
    
    def add(url: String): Unit = js.native
    def add(url: String, success: js.Function0[Unit]): Unit = js.native
    def add(url: String, success: js.Function0[Unit], scope: js.Object): Unit = js.native
    def add(url: String, success: js.Function0[Unit], scope: js.Object, failure: js.Function0[Unit]): Unit = js.native
    def add(url: String, success: js.Function0[Unit], scope: Unit, failure: js.Function0[Unit]): Unit = js.native
    def add(url: String, success: Unit, scope: js.Object): Unit = js.native
    def add(url: String, success: Unit, scope: js.Object, failure: js.Function0[Unit]): Unit = js.native
    def add(url: String, success: Unit, scope: Unit, failure: js.Function0[Unit]): Unit = js.native
    
    def isDone(url: String): Boolean = js.native
    
    def load(url: String): Unit = js.native
    def load(url: String, callback1: js.Function0[Unit]): Unit = js.native
    def load(url: String, callback1: js.Function0[Unit], callback2: js.Function0[Unit]): Unit = js.native
    def load(url: String, callback1: Unit, callback2: js.Function0[Unit]): Unit = js.native
    
    def loadQueue(): Unit = js.native
    def loadQueue(success: js.Function0[Unit]): Unit = js.native
    def loadQueue(success: js.Function0[Unit], failure: js.Function0[Unit]): Unit = js.native
    def loadQueue(success: js.Function0[Unit], failure: js.Function0[Unit], scope: js.Object): Unit = js.native
    def loadQueue(success: js.Function0[Unit], failure: Unit, scope: js.Object): Unit = js.native
    def loadQueue(success: Unit, failure: js.Function0[Unit]): Unit = js.native
    def loadQueue(success: Unit, failure: js.Function0[Unit], scope: js.Object): Unit = js.native
    def loadQueue(success: Unit, failure: Unit, scope: js.Object): Unit = js.native
    
    def loadScripts(scripts: js.Array[String]): Unit = js.native
    def loadScripts(scripts: js.Array[String], callback1: js.Function0[Unit]): Unit = js.native
    def loadScripts(scripts: js.Array[String], callback1: js.Function0[Unit], scope: js.Object): Unit = js.native
    def loadScripts(
      scripts: js.Array[String],
      callback1: js.Function0[Unit],
      scope: js.Object,
      callback2: js.Function0[Unit]
    ): Unit = js.native
    def loadScripts(
      scripts: js.Array[String],
      callback1: js.Function0[Unit],
      scope: Unit,
      callback2: js.Function0[Unit]
    ): Unit = js.native
    def loadScripts(scripts: js.Array[String], callback1: Unit, scope: js.Object): Unit = js.native
    def loadScripts(scripts: js.Array[String], callback1: Unit, scope: js.Object, callback2: js.Function0[Unit]): Unit = js.native
    def loadScripts(scripts: js.Array[String], callback1: Unit, scope: Unit, callback2: js.Function0[Unit]): Unit = js.native
    
    def markDone(url: String): Unit = js.native
  }
  
  trait TreeWalker extends StObject {
    
    def current(): typings.tinymce.mod.html.Node
    
    def next(): typings.tinymce.mod.html.Node
    
    def prev(): typings.tinymce.mod.html.Node
  }
  object TreeWalker {
    
    @scala.inline
    def apply(
      current: () => typings.tinymce.mod.html.Node,
      next: () => typings.tinymce.mod.html.Node,
      prev: () => typings.tinymce.mod.html.Node
    ): typings.tinymce.mod.dom.TreeWalker = {
      val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev))
      __obj.asInstanceOf[typings.tinymce.mod.dom.TreeWalker]
    }
    
    @scala.inline
    implicit class TreeWalkerMutableBuilder[Self <: typings.tinymce.mod.dom.TreeWalker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: () => typings.tinymce.mod.html.Node): Self = StObject.set(x, "current", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNext(value: () => typings.tinymce.mod.html.Node): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrev(value: () => typings.tinymce.mod.html.Node): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    }
  }
}
