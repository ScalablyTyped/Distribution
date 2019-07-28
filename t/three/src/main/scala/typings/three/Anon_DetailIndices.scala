package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DetailIndices extends js.Object {
  var detail: Double
  var indices: js.Array[Double]
  var radius: Double
  var vertices: js.Array[Double]
}

object Anon_DetailIndices {
  @scala.inline
  def apply(detail: Double, indices: js.Array[Double], radius: Double, vertices: js.Array[Double]): Anon_DetailIndices = {
    val __obj = js.Dynamic.literal(detail = detail, indices = indices, radius = radius, vertices = vertices)
  
    __obj.asInstanceOf[Anon_DetailIndices]
  }
}

