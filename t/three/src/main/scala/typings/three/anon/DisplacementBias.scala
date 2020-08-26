package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplacementBias extends js.Object {
  var displacementBias: IUniform = js.native
  var displacementMap: IUniform = js.native
  var displacementScale: IUniform = js.native
}

object DisplacementBias {
  @scala.inline
  def apply(displacementBias: IUniform, displacementMap: IUniform, displacementScale: IUniform): DisplacementBias = {
    val __obj = js.Dynamic.literal(displacementBias = displacementBias.asInstanceOf[js.Any], displacementMap = displacementMap.asInstanceOf[js.Any], displacementScale = displacementScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplacementBias]
  }
  @scala.inline
  implicit class DisplacementBiasOps[Self <: DisplacementBias] (val x: Self) extends AnyVal {
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
    def setDisplacementBias(value: IUniform): Self = this.set("displacementBias", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplacementMap(value: IUniform): Self = this.set("displacementMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplacementScale(value: IUniform): Self = this.set("displacementScale", value.asInstanceOf[js.Any])
  }
  
}

