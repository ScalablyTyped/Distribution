package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldDependentRule extends WorkItemTrackingResource {
  
  /**
    * The dependent fields.
    */
  var dependentFields: js.Array[WorkItemFieldReference] = js.native
}
object FieldDependentRule {
  
  @scala.inline
  def apply(_links: js.Any, dependentFields: js.Array[WorkItemFieldReference], url: String): FieldDependentRule = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], dependentFields = dependentFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDependentRule]
  }
  
  @scala.inline
  implicit class FieldDependentRuleOps[Self <: FieldDependentRule] (val x: Self) extends AnyVal {
    
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
    def setDependentFieldsVarargs(value: WorkItemFieldReference*): Self = this.set("dependentFields", js.Array(value :_*))
    
    @scala.inline
    def setDependentFields(value: js.Array[WorkItemFieldReference]): Self = this.set("dependentFields", value.asInstanceOf[js.Any])
  }
}
