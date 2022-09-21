package typings.twilio.anon

import org.scalablytyped.runtime.Instantiable1
import typings.twilio.taskRouterCapabilityMod.TaskRouterCapabilityOptions
import typings.twilio.taskRouterCapabilityMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskRouterCapability extends StObject {
  
  var TaskRouterCapability: TypeofTaskRouterCapabilit & (Instantiable1[/* options */ TaskRouterCapabilityOptions, ^])
  
  var util: Typeofutil
}
object TaskRouterCapability {
  
  inline def apply(
    TaskRouterCapability: TypeofTaskRouterCapabilit & (Instantiable1[/* options */ TaskRouterCapabilityOptions, ^]),
    util: Typeofutil
  ): TaskRouterCapability = {
    val __obj = js.Dynamic.literal(TaskRouterCapability = TaskRouterCapability.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRouterCapability]
  }
  
  extension [Self <: TaskRouterCapability](x: Self) {
    
    inline def setTaskRouterCapability(value: TypeofTaskRouterCapabilit & (Instantiable1[/* options */ TaskRouterCapabilityOptions, ^])): Self = StObject.set(x, "TaskRouterCapability", value.asInstanceOf[js.Any])
    
    inline def setUtil(value: Typeofutil): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
  }
}
