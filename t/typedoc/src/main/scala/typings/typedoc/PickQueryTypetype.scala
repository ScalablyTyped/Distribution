package typings.typedoc

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.typedocStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.QueryType, 'type'> */
trait PickQueryTypetype extends js.Object {
  var `type`: ModelToObject[query] | query
}

object PickQueryTypetype {
  @scala.inline
  def apply(`type`: ModelToObject[query] | query): PickQueryTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickQueryTypetype]
  }
}

