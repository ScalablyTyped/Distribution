package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
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
  implicit class FieldDependentRuleMutableBuilder[Self <: FieldDependentRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependentFields(value: js.Array[WorkItemFieldReference]): Self = StObject.set(x, "dependentFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentFieldsVarargs(value: WorkItemFieldReference*): Self = StObject.set(x, "dependentFields", js.Array(value :_*))
  }
}
