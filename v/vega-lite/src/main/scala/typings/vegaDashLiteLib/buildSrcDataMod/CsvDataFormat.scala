package typings
package vegaDashLiteLib.buildSrcDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvDataFormat
  extends DataFormatBase
     with DataFormat {
  /**
    * Type of input data: `"json"`, `"csv"`, `"tsv"`, `"dsv"`.
    * The default format type is determined by the extension of the file URL.
    * If no extension is detected, `"json"` will be used by default.
    */
  var `type`: js.UndefOr[
    vegaDashLiteLib.vegaDashLiteLibStrings.csv | vegaDashLiteLib.vegaDashLiteLibStrings.tsv
  ] = js.undefined
}

object CsvDataFormat {
  @scala.inline
  def apply(
    parse: vegaDashLiteLib.vegaDashLiteLibStrings.auto | Parse = null,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.csv | vegaDashLiteLib.vegaDashLiteLibStrings.tsv = null
  ): CsvDataFormat = {
    val __obj = js.Dynamic.literal()
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsvDataFormat]
  }
}

