package typings.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialSurfaceMeshOptions extends js.Object {
   /* unmapped type */ var includeVertexNormals: js.Any
   /* unmapped type */ var triangleIndexFormat: js.Any
   /* unmapped type */ var vertexNormalFormat: js.Any
   /* unmapped type */ var vertexPositionFormat: js.Any
}

object SpatialSurfaceMeshOptions {
  @scala.inline
  def apply(
    includeVertexNormals: js.Any,
    triangleIndexFormat: js.Any,
    vertexNormalFormat: js.Any,
    vertexPositionFormat: js.Any
  ): SpatialSurfaceMeshOptions = {
    val __obj = js.Dynamic.literal(includeVertexNormals = includeVertexNormals.asInstanceOf[js.Any], triangleIndexFormat = triangleIndexFormat.asInstanceOf[js.Any], vertexNormalFormat = vertexNormalFormat.asInstanceOf[js.Any], vertexPositionFormat = vertexPositionFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialSurfaceMeshOptions]
  }
}

