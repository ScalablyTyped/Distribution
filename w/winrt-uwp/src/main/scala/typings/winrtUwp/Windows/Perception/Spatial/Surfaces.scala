package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Perception.Spatial.Surfaces")
@js.native
object Surfaces extends js.Object {
  @js.native
  abstract class SpatialSurfaceInfo () extends js.Object {
    var id: js.Any = js.native
     /* unmapped type */ var tryComputeLatestMeshAsync: js.Any = js.native
     /* unmapped type */ var tryGetBounds: js.Any = js.native
     /* unmapped type */ var updateTime: js.Any = js.native
  }
  
  @js.native
  abstract class SpatialSurfaceMesh () extends js.Object {
    var coordinateSystem: js.Any = js.native
     /* unmapped type */ var surfaceInfo: js.Any = js.native
     /* unmapped type */ var triangleIndices: js.Any = js.native
     /* unmapped type */ var vertexNormals: js.Any = js.native
     /* unmapped type */ var vertexPositionScale: js.Any = js.native
     /* unmapped type */ var vertexPositions: js.Any = js.native
  }
  
  @js.native
  abstract class SpatialSurfaceMeshBuffer () extends js.Object {
    var data: js.Any = js.native
     /* unmapped type */ var elementCount: js.Any = js.native
     /* unmapped type */ var format: js.Any = js.native
     /* unmapped type */ var stride: js.Any = js.native
  }
  
  @js.native
  abstract class SpatialSurfaceMeshOptions () extends js.Object {
     /* unmapped type */ var includeVertexNormals: js.Any = js.native
     /* unmapped type */ var triangleIndexFormat: js.Any = js.native
     /* unmapped type */ var vertexNormalFormat: js.Any = js.native
     /* unmapped type */ var vertexPositionFormat: js.Any = js.native
  }
  
  @js.native
  abstract class SpatialSurfaceObserver () extends js.Object {
     /* unmapped type */ var addEventListener: js.Any = js.native
     /* unmapped type */ var getObservedSurfaces: js.Any = js.native
     /* unmapped type */ var onobservedsurfaceschanged: js.Any = js.native
     /* unmapped type */ var removeEventListener: js.Any = js.native
     /* unmapped type */ var setBoundingVolume: js.Any = js.native
     /* unmapped type */ var setBoundingVolumes: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SpatialSurfaceMeshOptions extends js.Object {
    var supportedTriangleIndexFormats: js.Any = js.native
     /* unmapped type */ var supportedVertexNormalFormats: js.Any = js.native
     /* unmapped type */ var supportedVertexPositionFormats: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SpatialSurfaceObserver extends js.Object {
    var requestAccessAsync: js.Any = js.native
  }
  
}

