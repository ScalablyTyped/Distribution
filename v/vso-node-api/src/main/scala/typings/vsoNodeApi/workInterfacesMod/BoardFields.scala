package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardFields extends js.Object {
  var columnField: FieldReference
  var doneField: FieldReference
  var rowField: FieldReference
}

object BoardFields {
  @scala.inline
  def apply(columnField: FieldReference, doneField: FieldReference, rowField: FieldReference): BoardFields = {
    val __obj = js.Dynamic.literal(columnField = columnField.asInstanceOf[js.Any], doneField = doneField.asInstanceOf[js.Any], rowField = rowField.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoardFields]
  }
}

