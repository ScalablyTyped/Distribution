package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BacklogLevel extends StObject {
  
  /**
    * Reference name of the corresponding WIT category
    */
  var categoryReferenceName: String
  
  /**
    * Plural name for the backlog level
    */
  var pluralName: String
  
  /**
    * Collection of work item states that are included in the plan. The server will filter to only these work item types.
    */
  var workItemStates: js.Array[String]
  
  /**
    * Collection of valid workitem type names for the given backlog level
    */
  var workItemTypes: js.Array[String]
}
object BacklogLevel {
  
  inline def apply(
    categoryReferenceName: String,
    pluralName: String,
    workItemStates: js.Array[String],
    workItemTypes: js.Array[String]
  ): BacklogLevel = {
    val __obj = js.Dynamic.literal(categoryReferenceName = categoryReferenceName.asInstanceOf[js.Any], pluralName = pluralName.asInstanceOf[js.Any], workItemStates = workItemStates.asInstanceOf[js.Any], workItemTypes = workItemTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BacklogLevel] (val x: Self) extends AnyVal {
    
    inline def setCategoryReferenceName(value: String): Self = StObject.set(x, "categoryReferenceName", value.asInstanceOf[js.Any])
    
    inline def setPluralName(value: String): Self = StObject.set(x, "pluralName", value.asInstanceOf[js.Any])
    
    inline def setWorkItemStates(value: js.Array[String]): Self = StObject.set(x, "workItemStates", value.asInstanceOf[js.Any])
    
    inline def setWorkItemStatesVarargs(value: String*): Self = StObject.set(x, "workItemStates", js.Array(value*))
    
    inline def setWorkItemTypes(value: js.Array[String]): Self = StObject.set(x, "workItemTypes", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypesVarargs(value: String*): Self = StObject.set(x, "workItemTypes", js.Array(value*))
  }
}
