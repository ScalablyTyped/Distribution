package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialCoordinateSystem extends js.Object {
  var tryGetTransformTo: js.Any = js.native
}

object SpatialCoordinateSystem {
  @scala.inline
  def apply(tryGetTransformTo: js.Any): SpatialCoordinateSystem = {
    val __obj = js.Dynamic.literal(tryGetTransformTo = tryGetTransformTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialCoordinateSystem]
  }
  @scala.inline
  implicit class SpatialCoordinateSystemOps[Self <: SpatialCoordinateSystem] (val x: Self) extends AnyVal {
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
    def setTryGetTransformTo(value: js.Any): Self = this.set("tryGetTransformTo", value.asInstanceOf[js.Any])
  }
  
}

