package typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a rectangle that defines a geographic area. */
@JSGlobal("Windows.Devices.Geolocation.GeoboundingBox")
@js.native
class GeoboundingBox protected () extends js.Object {
  /**
    * Initializes a new instance of the GeoboundingBox class that has the specified corners.
    * @param northwestCorner The northwest corner to use for the new GeoboundingBox . For more info, see the NorthwestCorner property.
    * @param southeastCorner The southeast corner to use for the new GeoboundingBox . For more info, see the SoutheastCorner property.
    */
  def this(northwestCorner: BasicGeoposition, southeastCorner: BasicGeoposition) = this()
  /**
    * Initializes a new instance of the GeoboundingBox class that has the specified corners and uses the specified altitude reference system.
    * @param northwestCorner The northwest corner to use for the new GeoboundingBox . For more info, see the NorthwestCorner property.
    * @param southeastCorner The southeast corner to use for the new GeoboundingBox . For more info, see the SoutheastCorner property.
    * @param altitudeReferenceSystem The altitude reference system to use for the new GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
    */
  def this(
    northwestCorner: BasicGeoposition,
    southeastCorner: BasicGeoposition,
    altitudeReferenceSystem: AltitudeReferenceSystem
  ) = this()
  /**
    * Initializes a new instance of the GeoboundingBox class that has the specified corners and uses the specified altitude reference system and spatial reference ID (SRID).
    * @param northwestCorner The northwest corner to use for the new GeoboundingBox . For more info, see the NorthwestCorner property.
    * @param southeastCorner The southeast corner to use for the new GeoboundingBox . For more info, see the SoutheastCorner property.
    * @param altitudeReferenceSystem The altitude reference system to use for the new GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
    * @param spatialReferenceId The spatial reference ID (SRID) to use for the new GeoboundingBox . For more info, see the SpatialReferenceId property.
    */
  def this(
    northwestCorner: BasicGeoposition,
    southeastCorner: BasicGeoposition,
    altitudeReferenceSystem: AltitudeReferenceSystem,
    spatialReferenceId: Double
  ) = this()
  /** Gets the altitude reference system used by the GeoboundingBox . */
  var altitudeReferenceSystem: AltitudeReferenceSystem = js.native
  /** Gets the center of the GeoboundingBox . */
  var center: BasicGeoposition = js.native
  /** Gets the type of geographic shape represented by the GeoboundingBox . */
  var geoshapeType: GeoshapeType = js.native
  /** Gets the altitude of the highest corner of the GeoboundingBox . */
  var maxAltitude: Double = js.native
  /** Gets the altitude of the lowest corner of the GeoboundingBox . */
  var minAltitude: Double = js.native
  /** Gets the northwest corner of the GeoboundingBox . */
  var northwestCorner: BasicGeoposition = js.native
  /** Gets the southeast corner of the GeoboundingBox . */
  var southeastCorner: BasicGeoposition = js.native
  /** Gets the spatial reference ID (SRID) used by the GeoboundingBox . */
  var spatialReferenceId: Double = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Geolocation.GeoboundingBox")
@js.native
object GeoboundingBox extends js.Object {
  /**
    * Calculates a GeoboundingBox that contains the specified set of geographic positions.
    * @param positions A collection of geographic positions to include inside the GeoboundingBox .
    * @return The calculated rectangle that contains the specified set of geographic positions.
    */
  def tryCompute(positions: IIterable[BasicGeoposition]): GeoboundingBox = js.native
  /**
    * Calculates a GeoboundingBox that contains the specified set of geographic positions and uses the specified altitude reference system.
    * @param positions A collection of geographic positions to include inside the GeoboundingBox .
    * @param altitudeRefSystem The altitude reference system to use for the GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
    * @return The calculated rectangle that contains the specified set of geographic positions.
    */
  def tryCompute(positions: IIterable[BasicGeoposition], altitudeRefSystem: AltitudeReferenceSystem): GeoboundingBox = js.native
  /**
    * Calculates a GeoboundingBox that contains the specified set of geographic positions and uses the specified altitude reference system and spatial reference ID (SRID).
    * @param positions A collection of geographic positions to include inside the GeoboundingBox .
    * @param altitudeRefSystem The altitude reference system to use for the GeoboundingBox . For more info, see the AltitudeReferenceSystem property.
    * @param spatialReferenceId The spatial reference ID (SRID) to use for the GeoboundingBox . For more info, see the SpatialReferenceId property.
    * @return The calculated rectangle that contains the specified set of geographic positions.
    */
  def tryCompute(
    positions: IIterable[BasicGeoposition],
    altitudeRefSystem: AltitudeReferenceSystem,
    spatialReferenceId: Double
  ): GeoboundingBox = js.native
}

