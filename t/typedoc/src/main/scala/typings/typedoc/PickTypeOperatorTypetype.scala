package typings.typedoc

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.typedocStrings.typeOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.TypeOperatorType, 'type'> */
trait PickTypeOperatorTypetype extends js.Object {
  var `type`: ModelToObject[typeOperator] | typeOperator
}

object PickTypeOperatorTypetype {
  @scala.inline
  def apply(`type`: ModelToObject[typeOperator] | typeOperator): PickTypeOperatorTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTypeOperatorTypetype]
  }
}

