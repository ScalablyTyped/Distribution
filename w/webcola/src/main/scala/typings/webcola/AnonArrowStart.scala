package typings.webcola

import typings.webcola.geomMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrowStart extends js.Object {
  var arrowStart: Point
  var sourceIntersection: Point
  var targetIntersection: Point
}

object AnonArrowStart {
  @scala.inline
  def apply(arrowStart: Point, sourceIntersection: Point, targetIntersection: Point): AnonArrowStart = {
    val __obj = js.Dynamic.literal(arrowStart = arrowStart.asInstanceOf[js.Any], sourceIntersection = sourceIntersection.asInstanceOf[js.Any], targetIntersection = targetIntersection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArrowStart]
  }
}

