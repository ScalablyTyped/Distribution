package typings.typedoc

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.typedocStrings.intrinsic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.IntrinsicType, 'type'> */
trait PickIntrinsicTypetype extends js.Object {
  var `type`: ModelToObject[intrinsic] | intrinsic
}

object PickIntrinsicTypetype {
  @scala.inline
  def apply(`type`: ModelToObject[intrinsic] | intrinsic): PickIntrinsicTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIntrinsicTypetype]
  }
}

