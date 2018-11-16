package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ungroup.js
@js.native
trait Parent extends Element {
  def add(element: Element): this.type = js.native
  def add(element: Element, i: scala.Double): this.type = js.native
  def children(): js.Array[Element] = js.native
  def clear(): this.type = js.native
  def defs(): Defs = js.native
  def each(block: js.Function2[/* index */ scala.Double, /* children */ js.Array[Element], scala.Unit]): this.type = js.native
  def each(
    block: js.Function2[/* index */ scala.Double, /* children */ js.Array[Element], scala.Unit],
    deep: scala.Boolean
  ): this.type = js.native
  def element(element: java.lang.String): Bare = js.native
  def element(element: java.lang.String, inherit: js.Object): Bare = js.native
  def first(): Element = js.native
  def flatten(parent: Parent): this.type = js.native
  def flatten(parent: Parent, depth: scala.Double): this.type = js.native
  def font(font: FontData): this.type = js.native
  def get(i: scala.Double): Element = js.native
  def has(element: Element): scala.Boolean = js.native
  def index(element: Element): scala.Double = js.native
  def last(): Element = js.native
  def put(element: Element): Element = js.native
  def put(element: Element, i: scala.Double): Element = js.native
  def removeElement(element: Element): this.type = js.native
  def select(query: java.lang.String): Set = js.native
  def ungroup(parent: Parent): this.type = js.native
  def ungroup(parent: Parent, depth: scala.Double): this.type = js.native
}

