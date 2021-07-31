package typings.vsoNodeApi.buildInterfacesMod

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
  
  @scala.inline
  def apply(triggerType: DefinitionTriggerType): BuildTrigger = {
    val __obj = js.Dynamic.literal(triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildTrigger]
  }
  
  @scala.inline
  implicit class BuildTriggerMutableBuilder[Self <: BuildTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerType(value: DefinitionTriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
