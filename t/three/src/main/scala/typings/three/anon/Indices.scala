package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indices extends js.Object {
  var detail: Double
  var indices: js.Array[Double]
  var radius: Double
  var vertices: js.Array[Double]
}

object Indices {
  @scala.inline
  def apply(detail: Double, indices: js.Array[Double], radius: Double, vertices: js.Array[Double]): Indices = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indices]
  }
}

