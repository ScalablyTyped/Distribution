package typings.winrtUwp.global.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Perception.Spatial.Surfaces")
@js.native
object Surfaces extends js.Object {
  @js.native
  abstract class SpatialSurfaceInfo ()
    extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceInfo {
    /* CompleteClass */
    override var id: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var tryComputeLatestMeshAsync: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var tryGetBounds: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var updateTime: js.Any = js.native
  }
  
  @js.native
  abstract class SpatialSurfaceMesh ()
    extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceMesh {
    /* CompleteClass */
    override var coordinateSystem: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var surfaceInfo: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var triangleIndices: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var vertexNormals: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var vertexPositionScale: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var vertexPositions: js.Any = js.native
  }
  
  @js.native
  abstract class SpatialSurfaceMeshBuffer ()
    extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshBuffer {
    /* CompleteClass */
    override var data: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var elementCount: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var format: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var stride: js.Any = js.native
  }
  
  @js.native
  abstract class SpatialSurfaceMeshOptions ()
    extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions {
     /* unmapped type */ /* CompleteClass */
    override var includeVertexNormals: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var triangleIndexFormat: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var vertexNormalFormat: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var vertexPositionFormat: js.Any = js.native
  }
  
  @js.native
  abstract class SpatialSurfaceObserver ()
    extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver {
     /* unmapped type */ /* CompleteClass */
    override var addEventListener: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var getObservedSurfaces: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var onobservedsurfaceschanged: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var removeEventListener: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var setBoundingVolume: js.Any = js.native
     /* unmapped type */ /* CompleteClass */
    override var setBoundingVolumes: js.Any = js.native
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

