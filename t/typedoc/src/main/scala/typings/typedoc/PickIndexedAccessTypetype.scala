package typings.typedoc

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.typedocStrings.indexedAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.IndexedAccessType, 'type'> & typedoc.typedoc/dist/lib/serialization/schema.Type */
trait PickIndexedAccessTypetype extends js.Object {
  var `type`: ModelToObject[indexedAccess] | indexedAccess
}

object PickIndexedAccessTypetype {
  @scala.inline
  def apply(`type`: ModelToObject[indexedAccess] | indexedAccess): PickIndexedAccessTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickIndexedAccessTypetype]
  }
}

