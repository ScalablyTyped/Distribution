package typings.unlDashCore.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeOptions extends js.Object {
  var elevation: Double
  var elevationType: ElevationType
}

object EncodeOptions {
  @scala.inline
  def apply(elevation: Double, elevationType: ElevationType): EncodeOptions = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncodeOptions]
  }
}

