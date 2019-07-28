package typings.vegaDashLite.buildSrcDataMod

import typings.vegaDashLite.vegaDashLiteStrings.auto
import typings.vegaDashLite.vegaDashLiteStrings.dsv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DsvDataFormat
  extends DataFormatBase
     with DataFormat {
  /**
    * The delimiter between records. The delimiter must be a single character (i.e., a single 16-bit code unit); so, ASCII delimiters are fine, but emoji delimiters are not.
    *
    * @minLength 1
    * @maxLength 1
    */
  var delimiter: String
  /**
    * Type of input data: `"json"`, `"csv"`, `"tsv"`, `"dsv"`.
    * The default format type is determined by the extension of the file URL.
    * If no extension is detected, `"json"` will be used by default.
    */
  var `type`: js.UndefOr[dsv] = js.undefined
}

object DsvDataFormat {
  @scala.inline
  def apply(delimiter: String, parse: auto | Parse = null, `type`: dsv = null): DsvDataFormat = {
    val __obj = js.Dynamic.literal(delimiter = delimiter)
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DsvDataFormat]
  }
}

