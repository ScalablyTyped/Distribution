package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldParam extends TransformField {
  var field: java.lang.String
}

object FieldParam {
  @scala.inline
  def apply(field: java.lang.String): FieldParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[FieldParam]
  }
}

