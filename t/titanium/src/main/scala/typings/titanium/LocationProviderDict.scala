package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object describing a location provider.
  */
@js.native
trait LocationProviderDict extends js.Object {
  /**
    * Accuracy of the location provider, either fine (1) or coarse (2).
    */
  var accuracy: js.UndefOr[Double] = js.native
  /**
    * Name of the location provider.
    */
  var name: js.UndefOr[java.lang.String] = js.native
  /**
    * Power consumption for this provider, either low (1), medium (2), or high (3).
    */
  var power: js.UndefOr[Double] = js.native
}

object LocationProviderDict {
  @scala.inline
  def apply(): LocationProviderDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationProviderDict]
  }
  @scala.inline
  implicit class LocationProviderDictOps[Self <: LocationProviderDict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPower(value: Double): Self = this.set("power", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePower: Self = this.set("power", js.undefined)
  }
  
}

