package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Field. */
@js.native
trait Field extends js.Object {
  
  /** The name of the field. */
  var field_name: js.UndefOr[String] = js.native
  
  /** The type of the field. */
  var field_type: js.UndefOr[String] = js.native
}
object Field {
  
  @scala.inline
  def apply(): Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    
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
    def setField_name(value: String): Self = this.set("field_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField_name: Self = this.set("field_name", js.undefined)
    
    @scala.inline
    def setField_type(value: String): Self = this.set("field_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField_type: Self = this.set("field_type", js.undefined)
  }
}
