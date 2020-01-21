package typings.tinymce.mod.dom

import typings.std.Document_
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "dom.DomQuery")
@js.native
class DomQuery () extends js.Object {
  def this(selector: String) = this()
  def this(selector: String, context: Document_) = this()
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

