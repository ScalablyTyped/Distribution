package typings
package unlDashCoreLib.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeohashWithElevation extends js.Object {
  var elevation: scala.Double
  var elevationType: ElevationType
  var geohash: java.lang.String
}

object GeohashWithElevation {
  @scala.inline
  def apply(elevation: scala.Double, elevationType: ElevationType, geohash: java.lang.String): GeohashWithElevation = {
    val __obj = js.Dynamic.literal(elevation = elevation, elevationType = elevationType, geohash = geohash)
  
    __obj.asInstanceOf[GeohashWithElevation]
  }
}

