package typings.typedoc

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.typedocStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.ArrayType, 'type'> */
trait PickArrayTypetype extends js.Object {
  var `type`: ModelToObject[array] | array
}

object PickArrayTypetype {
  @scala.inline
  def apply(`type`: ModelToObject[array] | array): PickArrayTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickArrayTypetype]
  }
}

