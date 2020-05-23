package typings.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialSurfaceMeshBuffer extends js.Object {
  var data: js.Any
   /* unmapped type */ var elementCount: js.Any
   /* unmapped type */ var format: js.Any
   /* unmapped type */ var stride: js.Any
}

object SpatialSurfaceMeshBuffer {
  @scala.inline
  def apply(data: js.Any, elementCount: js.Any, format: js.Any, stride: js.Any): SpatialSurfaceMeshBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], elementCount = elementCount.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialSurfaceMeshBuffer]
  }
}

