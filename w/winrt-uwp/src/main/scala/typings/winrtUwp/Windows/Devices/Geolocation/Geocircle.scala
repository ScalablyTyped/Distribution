package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a geographic circle with a center point and a radius. */
trait Geocircle extends js.Object {
  /** The altitude reference system of the geographic circle. */
  var altitudeReferenceSystem: AltitudeReferenceSystem
  /** The center point of a geographic circle. */
  var center: BasicGeoposition
  /** The type of geographic shape. */
  var geoshapeType: GeoshapeType
  /** The radius of a geographic circle in meters. */
  var radius: Double
  /** The spatial reference identifier for the geographic circle, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
  var spatialReferenceId: Double
}

object Geocircle {
  @scala.inline
  def apply(
    altitudeReferenceSystem: AltitudeReferenceSystem,
    center: BasicGeoposition,
    geoshapeType: GeoshapeType,
    radius: Double,
    spatialReferenceId: Double
  ): Geocircle = {
    val __obj = js.Dynamic.literal(altitudeReferenceSystem = altitudeReferenceSystem.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], geoshapeType = geoshapeType.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], spatialReferenceId = spatialReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geocircle]
  }
}

