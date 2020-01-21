package typings.tinymce.mod.geom

import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rect extends js.Object {
  def clamp(rect: Rect, clampRect: Rect, fixedSize: Boolean): Rect
  def create(x: Double, y: Double, w: Double, h: Double): Rect
  def findBestRelativePosition(rect: Rect, targetRect: Rect, constrainRect: Rect, rels: js.Array[_]): Unit
  def fromClientRect(clientRect: ClientRect): Rect
  def inflate(rect: Rect, w: Double, h: Double): Rect
  def intersect(rect: Rect, cropRect: Rect): Rect
  def relativePosition(rect: Rect, targetRect: Rect, rel: String): Unit
}

object Rect {
  @scala.inline
  def apply(
    clamp: (Rect, Rect, Boolean) => Rect,
    create: (Double, Double, Double, Double) => Rect,
    findBestRelativePosition: (Rect, Rect, Rect, js.Array[_]) => Unit,
    fromClientRect: ClientRect => Rect,
    inflate: (Rect, Double, Double) => Rect,
    intersect: (Rect, Rect) => Rect,
    relativePosition: (Rect, Rect, String) => Unit
  ): Rect = {
    val __obj = js.Dynamic.literal(clamp = js.Any.fromFunction3(clamp), create = js.Any.fromFunction4(create), findBestRelativePosition = js.Any.fromFunction4(findBestRelativePosition), fromClientRect = js.Any.fromFunction1(fromClientRect), inflate = js.Any.fromFunction3(inflate), intersect = js.Any.fromFunction2(intersect), relativePosition = js.Any.fromFunction3(relativePosition))
  
    __obj.asInstanceOf[Rect]
  }
}

