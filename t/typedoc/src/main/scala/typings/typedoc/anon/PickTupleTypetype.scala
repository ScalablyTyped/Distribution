package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.TupleType, 'type'> */
trait PickTupleTypetype extends js.Object {
  var `type`: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String)
}

object PickTupleTypetype {
  @scala.inline
  def apply(`type`: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String)): PickTupleTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTupleTypetype]
  }
}

