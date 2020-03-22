package typings.typedoc

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.typedocStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.UnknownType, 'type'> */
trait PickUnknownTypetype extends js.Object {
  var `type`: ModelToObject[unknown] | unknown
}

object PickUnknownTypetype {
  @scala.inline
  def apply(`type`: ModelToObject[unknown] | unknown): PickUnknownTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickUnknownTypetype]
  }
}

