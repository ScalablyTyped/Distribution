package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BehaviorCreateModel extends StObject {
  
  /**
    * Color
    */
  var color: String
  
  /**
    * Parent behavior id
    */
  var inherits: String
  
  /**
    * Name of the behavior
    */
  var name: String
}
object BehaviorCreateModel {
  
  inline def apply(color: String, inherits: String, name: String): BehaviorCreateModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], inherits = inherits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BehaviorCreateModel]
  }
  
  extension [Self <: BehaviorCreateModel](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setInherits(value: String): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
