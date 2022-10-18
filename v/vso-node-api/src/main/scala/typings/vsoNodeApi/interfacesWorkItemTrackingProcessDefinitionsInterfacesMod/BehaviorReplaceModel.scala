package typings.vsoNodeApi.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BehaviorReplaceModel extends StObject {
  
  /**
    * Color
    */
  var color: String
  
  /**
    * Behavior Name
    */
  var name: String
}
object BehaviorReplaceModel {
  
  inline def apply(color: String, name: String): BehaviorReplaceModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BehaviorReplaceModel]
  }
  
  extension [Self <: BehaviorReplaceModel](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
