package typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a geographic circle with a center point and a radius. */
@JSGlobal("Windows.Devices.Geolocation.Geocircle")
@js.native
class Geocircle protected () extends js.Object {
  /**
    * Create a geographic circle object for the given position and radius.
    * @param position The geographic position of the new circle.
    * @param radius The radius of the new circle, in meters.
    */
  def this(position: BasicGeoposition, radius: Double) = this()
  /**
    * Create a geographic circle object for the given position, radius and altitude reference system.
    * @param position The geographic position of the new circle.
    * @param radius The radius of the new circle, in meters.
    * @param altitudeReferenceSystem The altitude reference system of the new circle.
    */
  def this(position: BasicGeoposition, radius: Double, altitudeReferenceSystem: AltitudeReferenceSystem) = this()
  /**
    * Create a geographic circle object for the given position, radius, altitude reference system, and spatial reference id.
    * @param position The geographic position of the new circle.
    * @param radius The radius of the new circle, in meters.
    * @param altitudeReferenceSystem The altitude reference system of the new circle.
    * @param spatialReferenceId The spatial reference Id of the new circle.
    */
  def this(
    position: BasicGeoposition,
    radius: Double,
    altitudeReferenceSystem: AltitudeReferenceSystem,
    spatialReferenceId: Double
  ) = this()
  /** The altitude reference system of the geographic circle. */
  var altitudeReferenceSystem: AltitudeReferenceSystem = js.native
  /** The center point of a geographic circle. */
  var center: BasicGeoposition = js.native
  /** The type of geographic shape. */
  var geoshapeType: GeoshapeType = js.native
  /** The radius of a geographic circle in meters. */
  var radius: Double = js.native
  /** The spatial reference identifier for the geographic circle, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
  var spatialReferenceId: Double = js.native
}

