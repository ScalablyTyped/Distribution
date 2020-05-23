package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.UnionType, 'type'> */
trait PickUnionTypetype extends js.Object {
  var `type`: ModelToObject[String] | String
}

object PickUnionTypetype {
  @scala.inline
  def apply(`type`: ModelToObject[String] | String): PickUnionTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickUnionTypetype]
  }
}

