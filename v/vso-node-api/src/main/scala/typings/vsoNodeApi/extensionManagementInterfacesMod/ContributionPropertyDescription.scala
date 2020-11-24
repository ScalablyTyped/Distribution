package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContributionPropertyDescription extends js.Object {
  
  /**
    * Description of the property
    */
  var description: String = js.native
  
  /**
    * Name of the property
    */
  var name: String = js.native
  
  /**
    * True if this property is required
    */
  var required: Boolean = js.native
  
  /**
    * The type of value used for this property
    */
  var `type`: ContributionPropertyType = js.native
}
object ContributionPropertyDescription {
  
  @scala.inline
  def apply(description: String, name: String, required: Boolean, `type`: ContributionPropertyType): ContributionPropertyDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionPropertyDescription]
  }
  
  @scala.inline
  implicit class ContributionPropertyDescriptionOps[Self <: ContributionPropertyDescription] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ContributionPropertyType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
