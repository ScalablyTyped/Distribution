package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.BaseValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field
  extends BaseValueRef[js.Any] {
  var field: typings.vegaTypings.encodeMod.Field
}

object Field {
  @scala.inline
  def apply(field: typings.vegaTypings.encodeMod.Field): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

