package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BacklogLevel extends StObject {
  
  /**
    * Reference name of the corresponding WIT category
    */
  var categoryReferenceName: String = js.native
  
  /**
    * Plural name for the backlog level
    */
  var pluralName: String = js.native
  
  /**
    * Collection of work item states that are included in the plan. The server will filter to only these work item types.
    */
  var workItemStates: js.Array[String] = js.native
  
  /**
    * Collection of valid workitem type names for the given backlog level
    */
  var workItemTypes: js.Array[String] = js.native
}
object BacklogLevel {
  
  @scala.inline
  def apply(
    categoryReferenceName: String,
    pluralName: String,
    workItemStates: js.Array[String],
    workItemTypes: js.Array[String]
  ): BacklogLevel = {
    val __obj = js.Dynamic.literal(categoryReferenceName = categoryReferenceName.asInstanceOf[js.Any], pluralName = pluralName.asInstanceOf[js.Any], workItemStates = workItemStates.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogLevel]
  }
  
  @scala.inline
  implicit class BacklogLevelMutableBuilder[Self <: BacklogLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryReferenceName(value: String): Self = StObject.set(x, "categoryReferenceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluralName(value: String): Self = StObject.set(x, "pluralName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemStates(value: js.Array[String]): Self = StObject.set(x, "workItemStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemStatesVarargs(value: String*): Self = StObject.set(x, "workItemStates", js.Array(value :_*))
    
    @scala.inline
    def setWorkItemTypes(value: js.Array[String]): Self = StObject.set(x, "workItemTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypesVarargs(value: String*): Self = StObject.set(x, "workItemTypes", js.Array(value :_*))
  }
}
