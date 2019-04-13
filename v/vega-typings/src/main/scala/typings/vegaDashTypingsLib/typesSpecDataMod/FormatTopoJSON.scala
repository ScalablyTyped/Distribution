package typings
package vegaDashTypingsLib.typesSpecDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatTopoJSON extends Format {
  var feature: js.UndefOr[vegaDashTypingsLib.vegaDashTypingsLibStrings.string] = js.undefined
  var mesh: js.UndefOr[vegaDashTypingsLib.vegaDashTypingsLibStrings.string] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.topojson
}

object FormatTopoJSON {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.topojson,
    feature: vegaDashTypingsLib.vegaDashTypingsLibStrings.string = null,
    mesh: vegaDashTypingsLib.vegaDashTypingsLibStrings.string = null,
    property: java.lang.String = null
  ): FormatTopoJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (feature != null) __obj.updateDynamic("feature")(feature)
    if (mesh != null) __obj.updateDynamic("mesh")(mesh)
    if (property != null) __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[FormatTopoJSON]
  }
}

