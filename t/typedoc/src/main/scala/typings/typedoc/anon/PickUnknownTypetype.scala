package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.UnknownType, 'type'> */
trait PickUnknownTypetype extends js.Object {
  var `type`: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)
}

object PickUnknownTypetype {
  @scala.inline
  def apply(`type`: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)): PickUnknownTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickUnknownTypetype]
  }
}

