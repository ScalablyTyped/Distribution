package typings.svgDotJs.svgDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ungroup.js
@js.native
trait Parent extends Element {
  def add(element: Element): this.type = js.native
  def add(element: Element, i: Double): this.type = js.native
  def children(): js.Array[Element] = js.native
  def clear(): this.type = js.native
  def defs(): Defs = js.native
  def each(block: js.Function2[/* index */ Double, /* children */ js.Array[Element], Unit]): this.type = js.native
  def each(block: js.Function2[/* index */ Double, /* children */ js.Array[Element], Unit], deep: Boolean): this.type = js.native
  def element(element: String): Bare = js.native
  def element(element: String, inherit: js.Object): Bare = js.native
  def first(): Element = js.native
  def flatten(parent: Parent): this.type = js.native
  def flatten(parent: Parent, depth: Double): this.type = js.native
  def font(font: FontData): this.type = js.native
  def get(i: Double): Element = js.native
  def has(element: Element): Boolean = js.native
  def index(element: Element): Double = js.native
  def last(): Element = js.native
  def put(element: Element): Element = js.native
  def put(element: Element, i: Double): Element = js.native
  def removeElement(element: Element): this.type = js.native
  def select(query: String): Set = js.native
  def ungroup(parent: Parent): this.type = js.native
  def ungroup(parent: Parent, depth: Double): this.type = js.native
}

