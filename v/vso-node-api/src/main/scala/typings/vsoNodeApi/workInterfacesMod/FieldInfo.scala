package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldInfo extends js.Object {
  
  /**
    * The additional field display name
    */
  var displayName: String = js.native
  
  /**
    * The additional field type
    */
  var fieldType: FieldType = js.native
  
  /**
    * Indicates if the field definition is for an identity field.
    */
  var isIdentity: Boolean = js.native
  
  /**
    * The additional field reference name
    */
  var referenceName: String = js.native
}
object FieldInfo {
  
  @scala.inline
  def apply(displayName: String, fieldType: FieldType, isIdentity: Boolean, referenceName: String): FieldInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInfo]
  }
  
  @scala.inline
  implicit class FieldInfoOps[Self <: FieldInfo] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldType(value: FieldType): Self = this.set("fieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIdentity(value: Boolean): Self = this.set("isIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceName(value: String): Self = this.set("referenceName", value.asInstanceOf[js.Any])
  }
}
