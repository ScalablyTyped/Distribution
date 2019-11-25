package typings.vegaDashTypings.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldParam extends TransformField {
  var field: String
}

object FieldParam {
  @scala.inline
  def apply(field: String): FieldParam = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldParam]
  }
}

