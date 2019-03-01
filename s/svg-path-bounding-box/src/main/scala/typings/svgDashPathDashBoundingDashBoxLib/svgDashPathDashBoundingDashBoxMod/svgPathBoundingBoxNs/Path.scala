package typings
package svgDashPathDashBoundingDashBoxLib.svgDashPathDashBoundingDashBoxMod.svgPathBoundingBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var d: java.lang.String
  def getBoundingBox(): BoundingBoxView
}

object Path {
  @scala.inline
  def apply(d: java.lang.String, getBoundingBox: js.Function0[BoundingBoxView]): Path = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("d")(d)
    __obj.updateDynamic("getBoundingBox")(getBoundingBox)
    __obj.asInstanceOf[Path]
  }
}

