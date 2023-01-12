package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildTrigger extends StObject {
  
  /**
    * The type of the trigger.
    */
  var triggerType: DefinitionTriggerType
}
object BuildTrigger {
  
  inline def apply(triggerType: DefinitionTriggerType): BuildTrigger = {
    val __obj = js.Dynamic.literal(triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildTrigger] (val x: Self) extends AnyVal {
    
    inline def setTriggerType(value: DefinitionTriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
