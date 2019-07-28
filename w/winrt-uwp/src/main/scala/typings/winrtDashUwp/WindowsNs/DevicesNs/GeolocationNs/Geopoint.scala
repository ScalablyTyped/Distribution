package typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a geographic point. */
@JSGlobal("Windows.Devices.Geolocation.Geopoint")
@js.native
class Geopoint protected () extends js.Object {
  /**
    * Create a geographic point object for the given position.
    * @param position Create a geographic point object for the given position.
    */
  def this(position: BasicGeoposition) = this()
  /**
    * Create a geographic point object for the given position and altitude reference system.
    * @param position Create a geographic point object for the given position.
    * @param altitudeReferenceSystem The altitude reference system of the new point.
    */
  def this(position: BasicGeoposition, altitudeReferenceSystem: AltitudeReferenceSystem) = this()
  /**
    * Create a geographic point object for the given position, altitude reference system, and spatial reference Id.
    * @param position Create a geographic point object for the given position.
    * @param altitudeReferenceSystem The altitude reference system of the new point.
    * @param spatialReferenceId The spatial reference Id of the new point.
    */
  def this(
    position: BasicGeoposition,
    altitudeReferenceSystem: AltitudeReferenceSystem,
    spatialReferenceId: Double
  ) = this()
  /** The altitude reference system of the geographic point. */
  var altitudeReferenceSystem: AltitudeReferenceSystem = js.native
  /** The type of geographic shape. */
  var geoshapeType: GeoshapeType = js.native
  /** The position of a geographic point. */
  var position: BasicGeoposition = js.native
  /** The spatial reference identifier for the geographic point, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
  var spatialReferenceId: Double = js.native
}

