package typings
package unlDashCoreLib.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeOptions extends js.Object {
  var elevation: scala.Double
  var elevationType: ElevationType
}

object EncodeOptions {
  @scala.inline
  def apply(elevation: scala.Double, elevationType: ElevationType): EncodeOptions = {
    val __obj = js.Dynamic.literal(elevation = elevation, elevationType = elevationType)
  
    __obj.asInstanceOf[EncodeOptions]
  }
}

