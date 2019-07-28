package typings.vegaDashLite.buildSrcDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlData
  extends DataBase
     with Data {
  /**
    * An URL from which to load the data set. Use the `format.type` property
    * to ensure the loaded data is correctly parsed.
    */
  var url: String
}

object UrlData {
  @scala.inline
  def apply(url: String, format: DataFormat = null, name: String = null): UrlData = {
    val __obj = js.Dynamic.literal(url = url)
    if (format != null) __obj.updateDynamic("format")(format)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UrlData]
  }
}

