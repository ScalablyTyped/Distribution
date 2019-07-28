package typings.webcola

import typings.webcola.distSrcGeomMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrowStart extends js.Object {
  var arrowStart: Point
  var sourceIntersection: Point
  var targetIntersection: Point
}

object Anon_ArrowStart {
  @scala.inline
  def apply(arrowStart: Point, sourceIntersection: Point, targetIntersection: Point): Anon_ArrowStart = {
    val __obj = js.Dynamic.literal(arrowStart = arrowStart, sourceIntersection = sourceIntersection, targetIntersection = targetIntersection)
  
    __obj.asInstanceOf[Anon_ArrowStart]
  }
}

