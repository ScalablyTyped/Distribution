package typings.winrtUwp.global.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Perception.Spatial.Surfaces")
@js.native
object Surfaces extends js.Object {
  @js.native
  abstract class SpatialSurfaceInfo ()
    extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceInfo
  
  @js.native
  abstract class SpatialSurfaceMesh ()
    extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceMesh
  
  @js.native
  abstract class SpatialSurfaceMeshBuffer ()
    extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshBuffer
  
  @js.native
  abstract class SpatialSurfaceMeshOptions ()
    extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceMeshOptions
  
  @js.native
  abstract class SpatialSurfaceObserver ()
    extends typings.winrtUwp.Windows.Perception.Spatial.Surfaces.SpatialSurfaceObserver
  
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

