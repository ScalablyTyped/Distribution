package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a rectangle that defines a geographic area. */
@js.native
trait GeoboundingBox extends js.Object {
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

object GeoboundingBox {
  @scala.inline
  def apply(
    altitudeReferenceSystem: AltitudeReferenceSystem,
    center: BasicGeoposition,
    geoshapeType: GeoshapeType,
    maxAltitude: Double,
    minAltitude: Double,
    northwestCorner: BasicGeoposition,
    southeastCorner: BasicGeoposition,
    spatialReferenceId: Double
  ): GeoboundingBox = {
    val __obj = js.Dynamic.literal(altitudeReferenceSystem = altitudeReferenceSystem.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], geoshapeType = geoshapeType.asInstanceOf[js.Any], maxAltitude = maxAltitude.asInstanceOf[js.Any], minAltitude = minAltitude.asInstanceOf[js.Any], northwestCorner = northwestCorner.asInstanceOf[js.Any], southeastCorner = southeastCorner.asInstanceOf[js.Any], spatialReferenceId = spatialReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoboundingBox]
  }
  @scala.inline
  implicit class GeoboundingBoxOps[Self <: GeoboundingBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAltitudeReferenceSystem(value: AltitudeReferenceSystem): Self = this.set("altitudeReferenceSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenter(value: BasicGeoposition): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeoshapeType(value: GeoshapeType): Self = this.set("geoshapeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxAltitude(value: Double): Self = this.set("maxAltitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinAltitude(value: Double): Self = this.set("minAltitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setNorthwestCorner(value: BasicGeoposition): Self = this.set("northwestCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoutheastCorner(value: BasicGeoposition): Self = this.set("southeastCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpatialReferenceId(value: Double): Self = this.set("spatialReferenceId", value.asInstanceOf[js.Any])
  }
  
}

