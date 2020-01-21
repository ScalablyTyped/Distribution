package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetailIndices extends js.Object {
  var detail: Double
  var indices: js.Array[Double]
  var radius: Double
  var vertices: js.Array[Double]
}

object AnonDetailIndices {
  @scala.inline
  def apply(detail: Double, indices: js.Array[Double], radius: Double, vertices: js.Array[Double]): AnonDetailIndices = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDetailIndices]
  }
}

