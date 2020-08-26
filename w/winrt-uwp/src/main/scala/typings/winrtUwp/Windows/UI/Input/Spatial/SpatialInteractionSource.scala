package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialInteractionSource extends js.Object {
  var id: js.Any = js.native
   /* unmapped type */ var kind: js.Any = js.native
}

object SpatialInteractionSource {
  @scala.inline
  def apply(id: js.Any, kind: js.Any): SpatialInteractionSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSource]
  }
  @scala.inline
  implicit class SpatialInteractionSourceOps[Self <: SpatialInteractionSource] (val x: Self) extends AnyVal {
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
    def setKind(value: js.Any): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

