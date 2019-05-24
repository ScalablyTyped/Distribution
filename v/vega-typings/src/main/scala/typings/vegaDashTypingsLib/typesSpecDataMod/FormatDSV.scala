package typings
package vegaDashTypingsLib.typesSpecDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatDSV extends Format {
  var delimiter: java.lang.String
  var header: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var parse: js.UndefOr[Parse] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.dsv
}

object FormatDSV {
  @scala.inline
  def apply(
    delimiter: java.lang.String,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.dsv,
    header: js.Array[java.lang.String] = null,
    parse: Parse = null
  ): FormatDSV = {
    val __obj = js.Dynamic.literal(delimiter = delimiter)
    __obj.updateDynamic("type")(`type`)
    if (header != null) __obj.updateDynamic("header")(header)
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatDSV]
  }
}

