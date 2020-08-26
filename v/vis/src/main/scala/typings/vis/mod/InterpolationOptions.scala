package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterpolationOptions extends js.Object {
  var parametrization: ParametrizationInterpolationType = js.native
}

object InterpolationOptions {
  @scala.inline
  def apply(parametrization: ParametrizationInterpolationType): InterpolationOptions = {
    val __obj = js.Dynamic.literal(parametrization = parametrization.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationOptions]
  }
  @scala.inline
  implicit class InterpolationOptionsOps[Self <: InterpolationOptions] (val x: Self) extends AnyVal {
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
    def setParametrization(value: ParametrizationInterpolationType): Self = this.set("parametrization", value.asInstanceOf[js.Any])
  }
  
}

