package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRef extends js.Object {
  var data: java.lang.String
  var field: ScaleField
}

object DataRef {
  @scala.inline
  def apply(data: java.lang.String, field: ScaleField): DataRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRef]
  }
}

