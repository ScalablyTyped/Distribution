package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemStateColor extends StObject {
  
  /**
    * Category of state
    */
  var category: String
  
  /**
    * Color value
    */
  var color: String
  
  /**
    * Work item type state name
    */
  var name: String
}
object WorkItemStateColor {
  
  inline def apply(category: String, color: String, name: String): WorkItemStateColor = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemStateColor]
  }
  
  extension [Self <: WorkItemStateColor](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
