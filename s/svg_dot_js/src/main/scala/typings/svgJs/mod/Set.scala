package typings.svgJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Set
  extends Instantiable0[Set]
     with Instantiable1[/* members */ js.Array[Element], Set] {
  def add(elments: Element*): this.type = js.native
  def bbox(): BBox = js.native
  def clear(): this.type = js.native
  def click(cb: js.Function): Set = js.native
  def each(block: js.Function2[/* index */ Double, /* members */ js.Array[Element], Unit]): this.type = js.native
  def first(): Element = js.native
  def get(i: Double): Element = js.native
  def has(element: Element): this.type = js.native
  def index(element: Element): Double = js.native
  def last(): Element = js.native
  def length(): Double = js.native
  def remove(element: Element): this.type = js.native
}

