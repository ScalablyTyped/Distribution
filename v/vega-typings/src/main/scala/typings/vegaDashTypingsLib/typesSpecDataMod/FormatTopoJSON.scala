package typings
package vegaDashTypingsLib.typesSpecDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatTopoJSON extends Format {
  var feature: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.interior | vegaDashTypingsLib.vegaDashTypingsLibStrings.exterior | scala.Null
  ] = js.undefined
  var mesh: js.UndefOr[java.lang.String] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.topojson
}

object FormatTopoJSON {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.topojson,
    feature: java.lang.String = null,
    filter: vegaDashTypingsLib.vegaDashTypingsLibStrings.interior | vegaDashTypingsLib.vegaDashTypingsLibStrings.exterior = null,
    mesh: java.lang.String = null,
    property: java.lang.String = null
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

