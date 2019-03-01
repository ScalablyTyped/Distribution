package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[js.Array[yandexDashMapsLib.ymapsNs.IGeoObject]] = js.undefined
  var geometry: js.UndefOr[yandexDashMapsLib.ymapsNs.IGeometry | js.Object] = js.undefined
  var properties: js.UndefOr[yandexDashMapsLib.ymapsNs.IDataManager | js.Object] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: js.Array[yandexDashMapsLib.ymapsNs.IGeoObject] = null,
    geometry: yandexDashMapsLib.ymapsNs.IGeometry | js.Object = null,
    properties: yandexDashMapsLib.ymapsNs.IDataManager | js.Object = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Children]
  }
}

