package typings.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialSurfaceInfo extends js.Object {
  var id: js.Any
   /* unmapped type */ var tryComputeLatestMeshAsync: js.Any
   /* unmapped type */ var tryGetBounds: js.Any
   /* unmapped type */ var updateTime: js.Any
}

object SpatialSurfaceInfo {
  @scala.inline
  def apply(id: js.Any, tryComputeLatestMeshAsync: js.Any, tryGetBounds: js.Any, updateTime: js.Any): SpatialSurfaceInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tryComputeLatestMeshAsync = tryComputeLatestMeshAsync.asInstanceOf[js.Any], tryGetBounds = tryGetBounds.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialSurfaceInfo]
  }
}

