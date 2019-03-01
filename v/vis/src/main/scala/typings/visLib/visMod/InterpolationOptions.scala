package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolationOptions extends js.Object {
  var parametrization: ParametrizationInterpolationType
}

object InterpolationOptions {
  @scala.inline
  def apply(parametrization: ParametrizationInterpolationType): InterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parametrization")(parametrization)
    __obj.asInstanceOf[InterpolationOptions]
  }
}

