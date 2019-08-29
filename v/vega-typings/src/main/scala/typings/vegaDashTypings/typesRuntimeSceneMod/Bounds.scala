package typings.vegaDashTypings.typesRuntimeSceneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime/scene", "Bounds")
@js.native
class Bounds () extends js.Object {
  var x1: Double = js.native
  var x2: Double = js.native
  var y1: Double = js.native
  var y2: Double = js.native
  def add(x: Double, y: Double): Bounds = js.native
  def alignsWith(b: Bounds): Boolean = js.native
  def clear(): Bounds = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def empty(): Unit = js.native
  def encloses(b: Bounds): Boolean = js.native
  def equals(b: Bounds): Boolean = js.native
  def expand(d: Double): Bounds = js.native
  def height(): Double = js.native
  def intersects(b: Bounds): Boolean = js.native
  def rotate(angle: Double, x: Double, y: Double): Bounds = js.native
  def rotatedPoints(angle: Double, x: Double, y: Double): js.Array[Double] = js.native
  def round(): Bounds = js.native
  def set(x1: Double, y1: Double, x2: Double, y2: Double): Bounds = js.native
  def translate(dx: Double, dy: Double): Bounds = js.native
  def union(b: Bounds): Bounds = js.native
  def width(): Double = js.native
}

