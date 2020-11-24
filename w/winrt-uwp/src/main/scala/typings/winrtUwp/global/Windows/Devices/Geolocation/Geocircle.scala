package typings.winrtUwp.global.Windows.Devices.Geolocation

import typings.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a geographic circle with a center point and a radius. */
@JSGlobal("Windows.Devices.Geolocation.Geocircle")
@js.native
class Geocircle protected ()
  extends typings.winrtUwp.Windows.Devices.Geolocation.Geocircle {
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
  def this(
    position: BasicGeoposition,
    radius: Double,
    altitudeReferenceSystem: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem
  ) = this()
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
    altitudeReferenceSystem: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem,
    spatialReferenceId: Double
  ) = this()
}
