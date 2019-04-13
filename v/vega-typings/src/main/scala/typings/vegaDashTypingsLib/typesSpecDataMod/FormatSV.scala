package typings
package vegaDashTypingsLib.typesSpecDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatSV extends Format {
  var parse: js.UndefOr[Parse] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.csv | vegaDashTypingsLib.vegaDashTypingsLibStrings.tsv
}

object FormatSV {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.csv | vegaDashTypingsLib.vegaDashTypingsLibStrings.tsv,
    parse: Parse = null
  ): FormatSV = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatSV]
  }
}

