package typings.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialSurfaceMesh extends js.Object {
  var coordinateSystem: js.Any
   /* unmapped type */ var surfaceInfo: js.Any
   /* unmapped type */ var triangleIndices: js.Any
   /* unmapped type */ var vertexNormals: js.Any
   /* unmapped type */ var vertexPositionScale: js.Any
   /* unmapped type */ var vertexPositions: js.Any
}

object SpatialSurfaceMesh {
  @scala.inline
  def apply(
    coordinateSystem: js.Any,
    surfaceInfo: js.Any,
    triangleIndices: js.Any,
    vertexNormals: js.Any,
    vertexPositionScale: js.Any,
    vertexPositions: js.Any
  ): SpatialSurfaceMesh = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any], surfaceInfo = surfaceInfo.asInstanceOf[js.Any], triangleIndices = triangleIndices.asInstanceOf[js.Any], vertexNormals = vertexNormals.asInstanceOf[js.Any], vertexPositionScale = vertexPositionScale.asInstanceOf[js.Any], vertexPositions = vertexPositions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialSurfaceMesh]
  }
}

