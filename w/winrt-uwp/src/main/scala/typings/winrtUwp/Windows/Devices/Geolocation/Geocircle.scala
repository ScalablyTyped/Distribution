package typings.winrtUwp.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes a geographic circle with a center point and a radius. */
@js.native
trait Geocircle extends js.Object {
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
  @scala.inline
  implicit class GeocircleOps[Self <: Geocircle] (val x: Self) extends AnyVal {
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpatialReferenceId(value: Double): Self = this.set("spatialReferenceId", value.asInstanceOf[js.Any])
  }
  
}

