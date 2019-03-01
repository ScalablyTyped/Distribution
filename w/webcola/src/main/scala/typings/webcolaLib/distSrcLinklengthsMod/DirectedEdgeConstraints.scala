package typings
package webcolaLib.distSrcLinklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectedEdgeConstraints extends js.Object {
  var axis: java.lang.String
  var gap: scala.Double
}

object DirectedEdgeConstraints {
  @scala.inline
  def apply(axis: java.lang.String, gap: scala.Double): DirectedEdgeConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axis")(axis)
    __obj.updateDynamic("gap")(gap)
    __obj.asInstanceOf[DirectedEdgeConstraints]
  }
}

