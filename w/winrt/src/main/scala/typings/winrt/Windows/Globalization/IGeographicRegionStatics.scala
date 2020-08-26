package typings.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeographicRegionStatics extends js.Object {
  def isSupported(geographicRegionCode: String): Boolean = js.native
}

object IGeographicRegionStatics {
  @scala.inline
  def apply(isSupported: String => Boolean): IGeographicRegionStatics = {
    val __obj = js.Dynamic.literal(isSupported = js.Any.fromFunction1(isSupported))
    __obj.asInstanceOf[IGeographicRegionStatics]
  }
  @scala.inline
  implicit class IGeographicRegionStaticsOps[Self <: IGeographicRegionStatics] (val x: Self) extends AnyVal {
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
    def setIsSupported(value: String => Boolean): Self = this.set("isSupported", js.Any.fromFunction1(value))
  }
  
}

