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
  def apply(isSupported: java.lang.String => scala.Boolean): IGeographicRegionStatics = {
    val __obj = js.Dynamic.literal(isSupported = js.Any.fromFunction1(isSupported))
  
    __obj.asInstanceOf[IGeographicRegionStatics]
  }
}

