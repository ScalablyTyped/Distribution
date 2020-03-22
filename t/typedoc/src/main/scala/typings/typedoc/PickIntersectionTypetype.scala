package typings.typedoc

import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.IntersectionType, 'type'> */
trait PickIntersectionTypetype extends js.Object {
  var `type`: ModelToObject[String] | String
}

object PickIntersectionTypetype {
  @scala.inline
  def apply(`type`: ModelToObject[String] | String): PickIntersectionTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIntersectionTypetype]
  }
}

