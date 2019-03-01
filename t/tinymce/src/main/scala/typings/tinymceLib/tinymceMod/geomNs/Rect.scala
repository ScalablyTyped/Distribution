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
    clamp: js.Function3[Rect, Rect, scala.Boolean, Rect],
    create: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, Rect],
    findBestRelativePosition: js.Function4[Rect, Rect, Rect, js.Array[_], scala.Unit],
    fromClientRect: js.Function1[stdLib.ClientRect, Rect],
    inflate: js.Function3[Rect, scala.Double, scala.Double, Rect],
    intersect: js.Function2[Rect, Rect, Rect],
    relativePosition: js.Function3[Rect, Rect, java.lang.String, scala.Unit]
  ): Rect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clamp")(clamp)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("findBestRelativePosition")(findBestRelativePosition)
    __obj.updateDynamic("fromClientRect")(fromClientRect)
    __obj.updateDynamic("inflate")(inflate)
    __obj.updateDynamic("intersect")(intersect)
    __obj.updateDynamic("relativePosition")(relativePosition)
    __obj.asInstanceOf[Rect]
  }
}

