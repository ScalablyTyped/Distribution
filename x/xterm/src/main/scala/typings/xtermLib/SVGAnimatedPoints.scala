package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedPoints extends js.Object {
  val animatedPoints: SVGPointList
  val points: SVGPointList
}

object SVGAnimatedPoints {
  @scala.inline
  def apply(animatedPoints: SVGPointList, points: SVGPointList): SVGAnimatedPoints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animatedPoints")(animatedPoints)
    __obj.updateDynamic("points")(points)
    __obj.asInstanceOf[SVGAnimatedPoints]
  }
}

