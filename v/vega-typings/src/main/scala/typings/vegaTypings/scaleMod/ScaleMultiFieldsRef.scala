package typings.vegaTypings.scaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleMultiFieldsRef extends js.Object {
  var data: String
  var fields: js.Array[ScaleField]
}

object ScaleMultiFieldsRef {
  @scala.inline
  def apply(data: String, fields: js.Array[ScaleField]): ScaleMultiFieldsRef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScaleMultiFieldsRef]
  }
}

