package typings
package vegaLib.vegaMod.vgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Bounds extends js.Object {
  var x1: scala.Double
  var x2: scala.Double
  var y1: scala.Double
  var y2: scala.Double
  def add(x: scala.Double, y: scala.Double): Bounds
  def clear(): Bounds
  def contains(x: scala.Double, y: scala.Double): scala.Boolean
  def encloses(b: Bounds): scala.Boolean
  def expand(d: scala.Double): Bounds
  def height(): scala.Double
  def intersects(b: Bounds): scala.Boolean
  def rotate(angle: scala.Double, x: scala.Double, y: scala.Double): Bounds
  def round(): Bounds
  def set(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): Bounds
  def translate(dx: scala.Double, dy: scala.Double): Bounds
  def union(b: Bounds): Bounds
  def width(): scala.Double
}

