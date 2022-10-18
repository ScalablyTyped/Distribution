package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePlan extends StObject {
  
  /**
    * Description of the plan
    */
  var description: String
  
  /**
    * Name of the plan to create.
    */
  var name: String
  
  /**
    * Plan properties.
    */
  var properties: Any
  
  /**
    * Revision of the plan that was updated - the value used here should match the one the server gave the client in the Plan.
    */
  var revision: Double
  
  /**
    * Type of the plan
    */
  var `type`: PlanType
}
object UpdatePlan {
  
  inline def apply(description: String, name: String, properties: Any, revision: Double, `type`: PlanType): UpdatePlan = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePlan]
  }
  
  extension [Self <: UpdatePlan](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setType(value: PlanType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
