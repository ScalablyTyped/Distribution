package typings
package swiperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentX extends js.Object {
  var currentX: scala.Double
  var currentY: scala.Double
  var diff: scala.Double
  var startX: scala.Double
  var startY: scala.Double
}

object Anon_CurrentX {
  @scala.inline
  def apply(
    currentX: scala.Double,
    currentY: scala.Double,
    diff: scala.Double,
    startX: scala.Double,
    startY: scala.Double
  ): Anon_CurrentX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentX")(currentX)
    __obj.updateDynamic("currentY")(currentY)
    __obj.updateDynamic("diff")(diff)
    __obj.updateDynamic("startX")(startX)
    __obj.updateDynamic("startY")(startY)
    __obj.asInstanceOf[Anon_CurrentX]
  }
}

