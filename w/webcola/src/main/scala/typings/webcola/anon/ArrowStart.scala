package typings.webcola.anon

import typings.webcola.geomMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowStart extends js.Object {
  var arrowStart: Point
  var sourceIntersection: Point
  var targetIntersection: Point
}

object ArrowStart {
  @scala.inline
  def apply(arrowStart: Point, sourceIntersection: Point, targetIntersection: Point): ArrowStart = {
    val __obj = js.Dynamic.literal(arrowStart = arrowStart.asInstanceOf[js.Any], sourceIntersection = sourceIntersection.asInstanceOf[js.Any], targetIntersection = targetIntersection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowStart]
  }
}

