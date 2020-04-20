package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to define a geographic shape. */
trait IGeoshape extends js.Object {
  /** The altitude reference system of the geographic shape. */
  var altitudeReferenceSystem: AltitudeReferenceSystem
  /** The type of geographic shape. */
  var geoshapeType: GeoshapeType
  /** The spatial reference identifier for the geographic shape, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
  var spatialReferenceId: Double
}

object IGeoshape {
  @scala.inline
  def apply(
    altitudeReferenceSystem: AltitudeReferenceSystem,
    geoshapeType: GeoshapeType,
    spatialReferenceId: Double
  ): IGeoshape = {
    val __obj = js.Dynamic.literal(altitudeReferenceSystem = altitudeReferenceSystem.asInstanceOf[js.Any], geoshapeType = geoshapeType.asInstanceOf[js.Any], spatialReferenceId = spatialReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoshape]
  }
}

