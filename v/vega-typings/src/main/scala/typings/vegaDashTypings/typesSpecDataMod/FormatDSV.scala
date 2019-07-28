package typings.vegaDashTypings.typesSpecDataMod

import typings.vegaDashTypings.vegaDashTypingsStrings.dsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatDSV extends Format {
  var delimiter: String
  var header: js.UndefOr[js.Array[String]] = js.undefined
  var parse: js.UndefOr[Parse] = js.undefined
  var `type`: dsv
}

object FormatDSV {
  @scala.inline
  def apply(delimiter: String, `type`: dsv, header: js.Array[String] = null, parse: Parse = null): FormatDSV = {
    val __obj = js.Dynamic.literal(delimiter = delimiter)
    __obj.updateDynamic("type")(`type`)
    if (header != null) __obj.updateDynamic("header")(header)
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatDSV]
  }
}

