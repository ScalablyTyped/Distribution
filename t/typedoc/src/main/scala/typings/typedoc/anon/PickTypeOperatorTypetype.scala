package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.TypeOperatorType, 'type'> */
trait PickTypeOperatorTypetype extends js.Object {
  var `type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)
}

object PickTypeOperatorTypetype {
  @scala.inline
  def apply(`type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)): PickTypeOperatorTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTypeOperatorTypetype]
  }
}

