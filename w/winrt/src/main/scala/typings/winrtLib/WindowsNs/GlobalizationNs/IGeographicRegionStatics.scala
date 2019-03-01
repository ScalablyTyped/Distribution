package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeographicRegionStatics extends js.Object {
  def isSupported(geographicRegionCode: java.lang.String): scala.Boolean
}

object IGeographicRegionStatics {
  @scala.inline
  def apply(isSupported: js.Function1[java.lang.String, scala.Boolean]): IGeographicRegionStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isSupported")(isSupported)
    __obj.asInstanceOf[IGeographicRegionStatics]
  }
}

