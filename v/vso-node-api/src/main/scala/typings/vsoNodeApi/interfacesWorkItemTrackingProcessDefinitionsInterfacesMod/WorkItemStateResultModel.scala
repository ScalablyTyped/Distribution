package typings.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemStateResultModel extends StObject {
  
  /**
    * Color of the state
    */
  var color: String
  
  /**
    * Is the state hidden
    */
  var hidden: Boolean
  
  /**
    * The ID of the State
    */
  var id: String
  
  /**
    * Name of the state
    */
  var name: String
  
  /**
    * Order in which state should appear
    */
  var order: Double
  
  /**
    * Category of the state
    */
  var stateCategory: String
  
  /**
    * Url of the state
    */
  var url: String
}
object WorkItemStateResultModel {
  
  inline def apply(
    color: String,
    hidden: Boolean,
    id: String,
    name: String,
    order: Double,
    stateCategory: String,
    url: String
  ): WorkItemStateResultModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], stateCategory = stateCategory.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemStateResultModel]
  }
  
  extension [Self <: WorkItemStateResultModel](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setStateCategory(value: String): Self = StObject.set(x, "stateCategory", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
