package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoughnessMap extends js.Object {
  var roughnessMap: IUniform = js.native
}

object RoughnessMap {
  @scala.inline
  def apply(roughnessMap: IUniform): RoughnessMap = {
    val __obj = js.Dynamic.literal(roughnessMap = roughnessMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoughnessMap]
  }
  @scala.inline
  implicit class RoughnessMapOps[Self <: RoughnessMap] (val x: Self) extends AnyVal {
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
    def setRoughnessMap(value: IUniform): Self = this.set("roughnessMap", value.asInstanceOf[js.Any])
  }
  
}

