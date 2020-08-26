package typings.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialSurfaceMesh extends js.Object {
  var coordinateSystem: js.Any = js.native
   /* unmapped type */ var surfaceInfo: js.Any = js.native
   /* unmapped type */ var triangleIndices: js.Any = js.native
   /* unmapped type */ var vertexNormals: js.Any = js.native
   /* unmapped type */ var vertexPositionScale: js.Any = js.native
   /* unmapped type */ var vertexPositions: js.Any = js.native
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
  @scala.inline
  implicit class SpatialSurfaceMeshOps[Self <: SpatialSurfaceMesh] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCoordinateSystem(value: js.Any): Self = this.set("coordinateSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurfaceInfo(value: js.Any): Self = this.set("surfaceInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriangleIndices(value: js.Any): Self = this.set("triangleIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexNormals(value: js.Any): Self = this.set("vertexNormals", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexPositionScale(value: js.Any): Self = this.set("vertexPositionScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexPositions(value: js.Any): Self = this.set("vertexPositions", value.asInstanceOf[js.Any])
  }
  
}

