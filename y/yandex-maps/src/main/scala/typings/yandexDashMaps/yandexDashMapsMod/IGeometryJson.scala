package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeometryJson extends js.Object {
  var `type`: String
}

object IGeometryJson {
  @scala.inline
  def apply(`type`: String): IGeometryJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IGeometryJson]
  }
}

