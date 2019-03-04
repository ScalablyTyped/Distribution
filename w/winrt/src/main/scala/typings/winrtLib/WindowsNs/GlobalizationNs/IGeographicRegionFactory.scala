package typings
package winrtLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeographicRegionFactory extends js.Object {
  def createGeographicRegion(geographicRegionCode: java.lang.String): GeographicRegion
}

object IGeographicRegionFactory {
  @scala.inline
  def apply(createGeographicRegion: js.Function1[java.lang.String, GeographicRegion]): IGeographicRegionFactory = {
    val __obj = js.Dynamic.literal(createGeographicRegion = createGeographicRegion)
  
    __obj.asInstanceOf[IGeographicRegionFactory]
  }
}

