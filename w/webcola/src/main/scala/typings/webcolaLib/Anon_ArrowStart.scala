package typings
package webcolaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrowStart extends js.Object {
  var arrowStart: webcolaLib.distSrcGeomMod.Point
  var sourceIntersection: webcolaLib.distSrcGeomMod.Point
  var targetIntersection: webcolaLib.distSrcGeomMod.Point
}

object Anon_ArrowStart {
  @scala.inline
  def apply(
    arrowStart: webcolaLib.distSrcGeomMod.Point,
    sourceIntersection: webcolaLib.distSrcGeomMod.Point,
    targetIntersection: webcolaLib.distSrcGeomMod.Point
  ): Anon_ArrowStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrowStart")(arrowStart)
    __obj.updateDynamic("sourceIntersection")(sourceIntersection)
    __obj.updateDynamic("targetIntersection")(targetIntersection)
    __obj.asInstanceOf[Anon_ArrowStart]
  }
}

