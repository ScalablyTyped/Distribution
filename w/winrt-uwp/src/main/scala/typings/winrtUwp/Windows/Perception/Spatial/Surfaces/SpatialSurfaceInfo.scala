package typings.winrtUwp.Windows.Perception.Spatial.Surfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialSurfaceInfo extends js.Object {
  var id: js.Any = js.native
   /* unmapped type */ var tryComputeLatestMeshAsync: js.Any = js.native
   /* unmapped type */ var tryGetBounds: js.Any = js.native
   /* unmapped type */ var updateTime: js.Any = js.native
}

object SpatialSurfaceInfo {
  @scala.inline
  def apply(id: js.Any, tryComputeLatestMeshAsync: js.Any, tryGetBounds: js.Any, updateTime: js.Any): SpatialSurfaceInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tryComputeLatestMeshAsync = tryComputeLatestMeshAsync.asInstanceOf[js.Any], tryGetBounds = tryGetBounds.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialSurfaceInfo]
  }
  @scala.inline
  implicit class SpatialSurfaceInfoOps[Self <: SpatialSurfaceInfo] (val x: Self) extends AnyVal {
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
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTryComputeLatestMeshAsync(value: js.Any): Self = this.set("tryComputeLatestMeshAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def setTryGetBounds(value: js.Any): Self = this.set("tryGetBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateTime(value: js.Any): Self = this.set("updateTime", value.asInstanceOf[js.Any])
  }
  
}

