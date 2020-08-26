package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a geographic point. */
@js.native
trait Geopoint extends js.Object {
  /** The altitude reference system of the geographic point. */
  var altitudeReferenceSystem: AltitudeReferenceSystem = js.native
  /** The type of geographic shape. */
  var geoshapeType: GeoshapeType = js.native
  /** The position of a geographic point. */
  var position: BasicGeoposition = js.native
  /** The spatial reference identifier for the geographic point, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
  var spatialReferenceId: Double = js.native
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
  @scala.inline
  implicit class GeopointOps[Self <: Geopoint] (val x: Self) extends AnyVal {
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
    def setGeoshapeType(value: GeoshapeType): Self = this.set("geoshapeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: BasicGeoposition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpatialReferenceId(value: Double): Self = this.set("spatialReferenceId", value.asInstanceOf[js.Any])
  }
  
}

