package typings.yandexMaps.anon

import typings.yandexMaps.mod.IDataManager
import typings.yandexMaps.mod.IGeoObject
import typings.yandexMaps.mod.IGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: js.UndefOr[js.Array[IGeoObject]] = js.undefined
  var geometry: js.UndefOr[IGeometry | js.Object] = js.undefined
  var properties: js.UndefOr[IDataManager | js.Object] = js.undefined
}

object Children {
  @scala.inline
  def apply(
    children: js.Array[IGeoObject] = null,
    geometry: IGeometry | js.Object = null,
    properties: IDataManager | js.Object = null
  ): Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

