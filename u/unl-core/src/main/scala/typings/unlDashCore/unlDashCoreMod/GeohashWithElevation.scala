package typings.unlDashCore.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeohashWithElevation extends js.Object {
  var elevation: Double
  var elevationType: ElevationType
  var geohash: String
}

object GeohashWithElevation {
  @scala.inline
  def apply(elevation: Double, elevationType: ElevationType, geohash: String): GeohashWithElevation = {
    val __obj = js.Dynamic.literal(elevation = elevation, elevationType = elevationType, geohash = geohash)
  
    __obj.asInstanceOf[GeohashWithElevation]
  }
}

