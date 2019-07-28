package typings.vegaDashTypings.typesSpecDataMod

import typings.vegaDashTypings.vegaDashTypingsStrings.exterior
import typings.vegaDashTypings.vegaDashTypingsStrings.interior
import typings.vegaDashTypings.vegaDashTypingsStrings.topojson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatTopoJSON extends Format {
  var feature: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[interior | exterior | Null] = js.undefined
  var mesh: js.UndefOr[String] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var `type`: topojson
}

object FormatTopoJSON {
  @scala.inline
  def apply(
    `type`: topojson,
    feature: String = null,
    filter: interior | exterior = null,
    mesh: String = null,
    property: String = null
  ): FormatTopoJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (feature != null) __obj.updateDynamic("feature")(feature)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (mesh != null) __obj.updateDynamic("mesh")(mesh)
    if (property != null) __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[FormatTopoJSON]
  }
}

