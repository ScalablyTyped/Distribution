package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.IntrinsicType, 'type'> */
trait PickIntrinsicTypetype extends js.Object {
  var `type`: (ModelToObject[/* "intrinsic" */ String]) | (/* "intrinsic" */ String)
}

object PickIntrinsicTypetype {
  @scala.inline
  def apply(`type`: (ModelToObject[/* "intrinsic" */ String]) | (/* "intrinsic" */ String)): PickIntrinsicTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIntrinsicTypetype]
  }
}

