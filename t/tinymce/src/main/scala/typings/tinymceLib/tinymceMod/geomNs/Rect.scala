package typings
package tinymceLib.tinymceMod.geomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  def clamp(rect: Rect, clampRect: Rect, fixedSize: scala.Boolean): Rect
  def create(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): Rect
  def findBestRelativePosition(rect: Rect, targetRect: Rect, constrainRect: Rect, rels: js.Array[_]): scala.Unit
  def fromClientRect(clientRect: stdLib.ClientRect): Rect
  def inflate(rect: Rect, w: scala.Double, h: scala.Double): Rect
  def intersect(rect: Rect, cropRect: Rect): Rect
  def relativePosition(rect: Rect, targetRect: Rect, rel: java.lang.String): scala.Unit
}

