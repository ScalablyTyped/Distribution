package typings.webcola.linklengthsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectedEdgeConstraints extends js.Object {
  var axis: String
  var gap: Double
}

object DirectedEdgeConstraints {
  @scala.inline
  def apply(axis: String, gap: Double): DirectedEdgeConstraints = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectedEdgeConstraints]
  }
}

