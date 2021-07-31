package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTypeCategory
  extends StObject
     with WorkItemTrackingResource {
  
  /**
    * Gets or sets the default type of the work item.
    */
  var defaultWorkItemType: WorkItemTypeReference
  
  /**
    * The name of the category.
    */
  var name: String
  
  /**
    * The reference name of the category.
    */
  var referenceName: String
  
  /**
    * The work item types that belond to the category.
    */
  var workItemTypes: js.Array[WorkItemTypeReference]
}
object WorkItemTypeCategory {
  
  @scala.inline
  def apply(
    _links: js.Any,
    defaultWorkItemType: WorkItemTypeReference,
    name: String,
    referenceName: String,
    url: String,
    workItemTypes: js.Array[WorkItemTypeReference]
  ): WorkItemTypeCategory = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], defaultWorkItemType = defaultWorkItemType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeCategory]
  }
  
  @scala.inline
  implicit class WorkItemTypeCategoryMutableBuilder[Self <: WorkItemTypeCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultWorkItemType(value: WorkItemTypeReference): Self = StObject.set(x, "defaultWorkItemType", value.asInstanceOf[js.Any])
    
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
