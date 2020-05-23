package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.ReflectionType, 'type'> */
trait PickReflectionTypetype extends js.Object {
  var `type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)
}

object PickReflectionTypetype {
  @scala.inline
  def apply(`type`: (ModelToObject[/* "reflection" */ String]) | (/* "reflection" */ String)): PickReflectionTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickReflectionTypetype]
  }
}

