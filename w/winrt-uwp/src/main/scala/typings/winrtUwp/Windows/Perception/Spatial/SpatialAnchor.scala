package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialAnchor extends js.Object {
   /* unmapped type */ var addEventListener: js.Any
   /* unmapped type */ var coordinateSystem: js.Any
   /* unmapped type */ var onrawcoordinatesystemadjusted: js.Any
   /* unmapped type */ var rawCoordinateSystem: js.Any
   /* unmapped type */ var removeEventListener: js.Any
}

object SpatialAnchor {
  @scala.inline
  def apply(
    addEventListener: js.Any,
    coordinateSystem: js.Any,
    onrawcoordinatesystemadjusted: js.Any,
    rawCoordinateSystem: js.Any,
    removeEventListener: js.Any
  ): SpatialAnchor = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], coordinateSystem = coordinateSystem.asInstanceOf[js.Any], onrawcoordinatesystemadjusted = onrawcoordinatesystemadjusted.asInstanceOf[js.Any], rawCoordinateSystem = rawCoordinateSystem.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialAnchor]
  }
}

