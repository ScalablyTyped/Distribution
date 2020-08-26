package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationObject extends js.Object {
  /**
    * 纬度，浮点数，范围为-90~90，负数表示南纬
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * 经度，范围为-180~180，负数表示西经
    */
  var longitude: js.UndefOr[Double] = js.native
}

object LocationObject {
  @scala.inline
  def apply(): LocationObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationObject]
  }
  @scala.inline
  implicit class LocationObjectOps[Self <: LocationObject] (val x: Self) extends AnyVal {
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
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
  }
  
}

