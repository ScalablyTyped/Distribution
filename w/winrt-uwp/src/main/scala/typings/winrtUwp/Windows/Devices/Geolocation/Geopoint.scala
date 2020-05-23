package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a geographic point. */
trait Geopoint extends js.Object {
  /** The altitude reference system of the geographic point. */
  var altitudeReferenceSystem: AltitudeReferenceSystem
  /** The type of geographic shape. */
  var geoshapeType: GeoshapeType
  /** The position of a geographic point. */
  var position: BasicGeoposition
  /** The spatial reference identifier for the geographic point, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
  var spatialReferenceId: Double
}

object Geopoint {
  @scala.inline
  def apply(
    altitudeReferenceSystem: AltitudeReferenceSystem,
    geoshapeType: GeoshapeType,
    position: BasicGeoposition,
    spatialReferenceId: Double
  ): Geopoint = {
    val __obj = js.Dynamic.literal(altitudeReferenceSystem = altitudeReferenceSystem.asInstanceOf[js.Any], geoshapeType = geoshapeType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], spatialReferenceId = spatialReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geopoint]
  }
}

