package typings.vegaDashTypings.typesSpecDataMod

import typings.vegaDashTypings.vegaDashTypingsStrings.csv
import typings.vegaDashTypings.vegaDashTypingsStrings.tsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatSV extends Format {
  var header: js.UndefOr[js.Array[String]] = js.undefined
  var parse: js.UndefOr[Parse] = js.undefined
  var `type`: csv | tsv
}

object FormatSV {
  @scala.inline
  def apply(`type`: csv | tsv, header: js.Array[String] = null, parse: Parse = null): FormatSV = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatSV]
  }
}

