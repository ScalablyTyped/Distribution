package typings
package vegaDashLiteLib.buildSrcDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataBase extends js.Object {
  /**
    * An object that specifies the format for parsing the data.
    */
  var format: js.UndefOr[DataFormat] = js.undefined
  /**
    * Provide a placeholder name and bind data at runtime.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object DataBase {
  @scala.inline
  def apply(format: DataFormat = null, name: java.lang.String = null): DataBase = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DataBase]
  }
}

