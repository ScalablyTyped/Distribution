package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.UnknownType, 'type'> */
@js.native
trait PickUnknownTypetype extends js.Object {
  var `type`: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String) = js.native
}

object PickUnknownTypetype {
  @scala.inline
  def apply(`type`: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)): PickUnknownTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickUnknownTypetype]
  }
  @scala.inline
  implicit class PickUnknownTypetypeOps[Self <: PickUnknownTypetype] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: (ModelToObject[/* "unknown" */ String]) | (/* "unknown" */ String)): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

