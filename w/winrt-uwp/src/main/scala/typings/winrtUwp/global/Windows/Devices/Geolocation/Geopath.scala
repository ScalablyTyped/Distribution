package typings.winrtUwp.global.Windows.Devices.Geolocation

import typings.winrtUwp.Windows.Devices.Geolocation.BasicGeoposition
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an ordered series of geographic points. */
@JSGlobal("Windows.Devices.Geolocation.Geopath")
@js.native
class Geopath protected ()
  extends typings.winrtUwp.Windows.Devices.Geolocation.Geopath {
  /**
    * Initializes a new instance of the Geopath class with the specified collection of positions.
    * @param positions The collection of positions to use to create the new Geopath . For more info, see the Positions property.
    */
  def this(positions: IIterable[BasicGeoposition]) = this()
  /**
    * Initializes a new instance of the Geopath class with the specified collection of positions and with the specified altitude reference system.
    * @param positions The collection of positions to use to create the new Geopath . For more info, see the Positions property.
    * @param altitudeReferenceSystem The altitude reference system to use to create the new Geopath . For more info, see the AltitudeReferenceSystem property.
    */
  def this(
    positions: IIterable[BasicGeoposition],
    altitudeReferenceSystem: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem
  ) = this()
  /**
    * Initializes a new instance of the Geopath class with the specified collection of positions and with the specified altitude reference system and spatial reference ID (SRID).
    * @param positions The collection of positions to use to create the new Geopath . For more info, see the Positions property.
    * @param altitudeReferenceSystem The altitude reference system to use to create the new Geopath . For more info, see the AltitudeReferenceSystem property.
    * @param spatialReferenceId The spatial reference ID (SRID) to use to create the new Geopath . For more info, see the SpatialReferenceId property.
    */
  def this(
    positions: IIterable[BasicGeoposition],
    altitudeReferenceSystem: typings.winrtUwp.Windows.Devices.Geolocation.AltitudeReferenceSystem,
    spatialReferenceId: Double
  ) = this()
}

