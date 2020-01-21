package typings.svgJs.mod

import typings.svgJs.AnonX1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointArray extends Array {
  def bbox(): BBox = js.native
  def move(x: Double, y: Double): this.type = js.native
  @JSName("parse")
  def parse_Array(points: PointArrayAlias): js.Array[ArrayPoint] = js.native
  def size(): this.type = js.native
  def size(width: Double): this.type = js.native
  def size(width: Double, height: Double): this.type = js.native
  def toLine(): AnonX1 = js.native
}

