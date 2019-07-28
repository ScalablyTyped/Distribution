package typings.vegaDashLite.buildSrcDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineData
  extends DataBase
     with Data {
  /**
    * The full data set, included inline. This can be an array of objects or primitive values, an object, or a string.
    * Arrays of primitive values are ingested as objects with a `data` property. Strings are parsed according to the specified format type.
    */
  var values: InlineDataset
}

object InlineData {
  @scala.inline
  def apply(values: InlineDataset, format: DataFormat = null, name: String = null): InlineData = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[InlineData]
  }
}

