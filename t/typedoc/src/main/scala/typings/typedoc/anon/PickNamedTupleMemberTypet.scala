package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.NamedTupleMemberType, 'type'> */
@js.native
trait PickNamedTupleMemberTypet extends js.Object {
  
  var `type`: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String) = js.native
}
object PickNamedTupleMemberTypet {
  
  @scala.inline
  def apply(`type`: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String)): PickNamedTupleMemberTypet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickNamedTupleMemberTypet]
  }
  
  @scala.inline
  implicit class PickNamedTupleMemberTypetOps[Self <: PickNamedTupleMemberTypet] (val x: Self) extends AnyVal {
    
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
    def setType(value: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String)): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
