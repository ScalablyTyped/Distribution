package typings
package vegaDashTypingsLib.typesSpecDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- vegaDashTypingsLib.typesSpecDataMod._Format because Already inherited */ trait FormatDSV extends FormatSV {
  var delimiter: java.lang.String
}

object FormatDSV {
  @scala.inline
  def apply(
    delimiter: java.lang.String,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.csv | vegaDashTypingsLib.vegaDashTypingsLibStrings.tsv,
    parse: Parse = null
  ): FormatDSV = {
    val __obj = js.Dynamic.literal(delimiter = delimiter)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatDSV]
  }
}

