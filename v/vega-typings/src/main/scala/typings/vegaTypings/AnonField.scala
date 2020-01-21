package typings.vegaTypings

import typings.vegaTypings.encodeMod.BaseValueRef
import typings.vegaTypings.encodeMod.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonField
  extends BaseValueRef[js.Any] {
  var field: Field
}

object AnonField {
  @scala.inline
  def apply(field: Field): AnonField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonField]
  }
}

