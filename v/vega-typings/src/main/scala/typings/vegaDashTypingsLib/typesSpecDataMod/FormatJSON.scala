package typings
package vegaDashTypingsLib.typesSpecDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatJSON extends Format {
  var copy: js.UndefOr[scala.Boolean] = js.undefined
  var parse: js.UndefOr[Parse] = js.undefined
  var property: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.json
}

object FormatJSON {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.json,
    copy: js.UndefOr[scala.Boolean] = js.undefined,
    parse: Parse = null,
    property: java.lang.String | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): FormatJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy)
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatJSON]
  }
}

