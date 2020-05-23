package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.TypeParameterType, 'type'> */
trait PickTypeParameterTypetype extends js.Object {
  var `type`: ModelToObject[String] | String
}

object PickTypeParameterTypetype {
  @scala.inline
  def apply(`type`: ModelToObject[String] | String): PickTypeParameterTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTypeParameterTypetype]
  }
}

