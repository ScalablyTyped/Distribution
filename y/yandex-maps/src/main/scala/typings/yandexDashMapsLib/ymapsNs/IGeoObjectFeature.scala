package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoObjectFeature extends js.Object {
  var geometry: js.UndefOr[IGeometry | IGeometryJson] = js.undefined
  var properties: js.UndefOr[IDataManager | js.Object] = js.undefined
}

object IGeoObjectFeature {
  @scala.inline
  def apply(geometry: IGeometry | IGeometryJson = null, properties: IDataManager | js.Object = null): IGeoObjectFeature = {
    val __obj = js.Dynamic.literal()
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoObjectFeature]
  }
}

