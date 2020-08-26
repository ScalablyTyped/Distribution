package typings.three.lineBasicMaterialMod

import typings.three.colorMod.Color
import typings.three.materialMod.MaterialParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineBasicMaterialParameters extends MaterialParameters {
  var color: js.UndefOr[Color | String | Double] = js.native
  var linecap: js.UndefOr[String] = js.native
  var linejoin: js.UndefOr[String] = js.native
  var linewidth: js.UndefOr[Double] = js.native
  var morphTargets: js.UndefOr[Boolean] = js.native
}

object LineBasicMaterialParameters {
  @scala.inline
  def apply(): LineBasicMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineBasicMaterialParameters]
  }
  @scala.inline
  implicit class LineBasicMaterialParametersOps[Self <: LineBasicMaterialParameters] (val x: Self) extends AnyVal {
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
    def setColor(value: Color | String | Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setLinecap(value: String): Self = this.set("linecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinecap: Self = this.set("linecap", js.undefined)
    @scala.inline
    def setLinejoin(value: String): Self = this.set("linejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinejoin: Self = this.set("linejoin", js.undefined)
    @scala.inline
    def setLinewidth(value: Double): Self = this.set("linewidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinewidth: Self = this.set("linewidth", js.undefined)
    @scala.inline
    def setMorphTargets(value: Boolean): Self = this.set("morphTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMorphTargets: Self = this.set("morphTargets", js.undefined)
  }
  
}

