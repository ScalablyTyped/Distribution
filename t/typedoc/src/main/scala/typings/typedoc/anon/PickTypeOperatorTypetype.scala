package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.TypeOperatorType, 'type'> */
@js.native
trait PickTypeOperatorTypetype extends js.Object {
  
  var `type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String) = js.native
}
object PickTypeOperatorTypetype {
  
  @scala.inline
  def apply(`type`: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)): PickTypeOperatorTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTypeOperatorTypetype]
  }
  
  @scala.inline
  implicit class PickTypeOperatorTypetypeOps[Self <: PickTypeOperatorTypetype] (val x: Self) extends AnyVal {
    
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
    def setType(value: (ModelToObject[/* "typeOperator" */ String]) | (/* "typeOperator" */ String)): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
