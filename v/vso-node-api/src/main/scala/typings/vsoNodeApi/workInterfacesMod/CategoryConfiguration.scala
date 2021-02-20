package typings.vsoNodeApi.workInterfacesMod

import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemTypeReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryConfiguration extends StObject {
  
  /**
    * Name
    */
  var name: String = js.native
  
  /**
    * Category Reference Name
    */
  var referenceName: String = js.native
  
  /**
    * Work item types for the backlog category
    */
  var workItemTypes: js.Array[WorkItemTypeReference] = js.native
}
object CategoryConfiguration {
  
  @scala.inline
  def apply(name: String, referenceName: String, workItemTypes: js.Array[WorkItemTypeReference]): CategoryConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryConfiguration]
  }
  
  @scala.inline
  implicit class CategoryConfigurationMutableBuilder[Self <: CategoryConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypes(value: js.Array[WorkItemTypeReference]): Self = StObject.set(x, "workItemTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypesVarargs(value: WorkItemTypeReference*): Self = StObject.set(x, "workItemTypes", js.Array(value :_*))
  }
}
