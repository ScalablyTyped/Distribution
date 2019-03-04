package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetailIndices extends js.Object {
  var detail: scala.Double
  var indices: js.Array[scala.Double]
  var radius: scala.Double
  var vertices: js.Array[scala.Double]
}

object Anon_DetailIndices {
  @scala.inline
  def apply(
    detail: scala.Double,
    indices: js.Array[scala.Double],
    radius: scala.Double,
    vertices: js.Array[scala.Double]
  ): Anon_DetailIndices = {
    val __obj = js.Dynamic.literal(detail = detail, indices = indices, radius = radius, vertices = vertices)
  
    __obj.asInstanceOf[Anon_DetailIndices]
  }
}

