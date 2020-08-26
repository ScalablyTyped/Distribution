package typings.utm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Easting extends js.Object {
  var easting: Double = js.native
  var northing: Double = js.native
  var zoneLetter: String = js.native
  var zoneNum: Double = js.native
}

object Easting {
  @scala.inline
  def apply(easting: Double, northing: Double, zoneLetter: String, zoneNum: Double): Easting = {
    val __obj = js.Dynamic.literal(easting = easting.asInstanceOf[js.Any], northing = northing.asInstanceOf[js.Any], zoneLetter = zoneLetter.asInstanceOf[js.Any], zoneNum = zoneNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Easting]
  }
  @scala.inline
  implicit class EastingOps[Self <: Easting] (val x: Self) extends AnyVal {
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
    def setEasting(value: Double): Self = this.set("easting", value.asInstanceOf[js.Any])
    @scala.inline
    def setNorthing(value: Double): Self = this.set("northing", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoneLetter(value: String): Self = this.set("zoneLetter", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoneNum(value: Double): Self = this.set("zoneNum", value.asInstanceOf[js.Any])
  }
  
}

