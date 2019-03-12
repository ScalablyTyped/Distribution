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

object Rect {
  @scala.inline
  def apply(
    clamp: (Rect, Rect, scala.Boolean) => Rect,
    create: (scala.Double, scala.Double, scala.Double, scala.Double) => Rect,
    findBestRelativePosition: (Rect, Rect, Rect, js.Array[_]) => scala.Unit,
    fromClientRect: stdLib.ClientRect => Rect,
    inflate: (Rect, scala.Double, scala.Double) => Rect,
    intersect: (Rect, Rect) => Rect,
    relativePosition: (Rect, Rect, java.lang.String) => scala.Unit
  ): Rect = {
    val __obj = js.Dynamic.literal(clamp = js.Any.fromFunction3(clamp), create = js.Any.fromFunction4(create), findBestRelativePosition = js.Any.fromFunction4(findBestRelativePosition), fromClientRect = js.Any.fromFunction1(fromClientRect), inflate = js.Any.fromFunction3(inflate), intersect = js.Any.fromFunction2(intersect), relativePosition = js.Any.fromFunction3(relativePosition))
  
    __obj.asInstanceOf[Rect]
  }
}

