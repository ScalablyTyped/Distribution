package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ordered series of geographic points. */
@JSGlobal("Windows.Devices.Geolocation.Geopath")
@js.native
class Geopath protected () extends js.Object {
  /**
    * Initializes a new instance of the Geopath class with the specified collection of positions.
    * @param positions The collection of positions to use to create the new Geopath . For more info, see the Positions property.
    */
  def this(positions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[BasicGeoposition]) = this()
  /**
    * Initializes a new instance of the Geopath class with the specified collection of positions and with the specified altitude reference system.
    * @param positions The collection of positions to use to create the new Geopath . For more info, see the Positions property.
    * @param altitudeReferenceSystem The altitude reference system to use to create the new Geopath . For more info, see the AltitudeReferenceSystem property.
    */
  def this(positions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[BasicGeoposition], altitudeReferenceSystem: AltitudeReferenceSystem) = this()
  /**
    * Initializes a new instance of the Geopath class with the specified collection of positions and with the specified altitude reference system and spatial reference ID (SRID).
    * @param positions The collection of positions to use to create the new Geopath . For more info, see the Positions property.
    * @param altitudeReferenceSystem The altitude reference system to use to create the new Geopath . For more info, see the AltitudeReferenceSystem property.
    * @param spatialReferenceId The spatial reference ID (SRID) to use to create the new Geopath . For more info, see the SpatialReferenceId property.
    */
  def this(positions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[BasicGeoposition], altitudeReferenceSystem: AltitudeReferenceSystem, spatialReferenceId: scala.Double) = this()
  /** Gets the altitude reference system used by the Geopath . */
  var altitudeReferenceSystem: AltitudeReferenceSystem = js.native
  /** Gets the type of geographic shape represented by the Geopath . */
  var geoshapeType: GeoshapeType = js.native
  /** Gets the collection of geographic points that define the Geopath . */
  var positions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[BasicGeoposition] = js.native
  /** Gets the spatial reference ID (SRID) used by the Geopath . */
  var spatialReferenceId: scala.Double = js.native
}

