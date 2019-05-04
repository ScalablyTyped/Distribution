package typings
package vegaDashLiteLib.buildSrcDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedData
  extends DataBase
     with Data {
  /**
    * Provide a placeholder name and bind data at runtime.
    */
  @JSName("name")
  var name_NamedData: java.lang.String
}

object NamedData {
  @scala.inline
  def apply(name: java.lang.String, format: DataFormat = null): NamedData = {
    val __obj = js.Dynamic.literal(name = name)
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[NamedData]
  }
}

