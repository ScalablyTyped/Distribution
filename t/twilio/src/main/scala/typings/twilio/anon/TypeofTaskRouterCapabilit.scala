package typings.twilio.anon

import org.scalablytyped.runtime.Instantiable1
import typings.twilio.taskRouterCapabilityMod.Policy
import typings.twilio.taskRouterCapabilityMod.PolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTaskRouterCapabilit extends StObject {
  
  var Policy: Instantiable1[/* options */ PolicyOptions, typings.twilio.taskRouterCapabilityMod.Policy]
}
object TypeofTaskRouterCapabilit {
  
  inline def apply(Policy: Instantiable1[/* options */ PolicyOptions, Policy]): TypeofTaskRouterCapabilit = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTaskRouterCapabilit]
  }
  
  extension [Self <: TypeofTaskRouterCapabilit](x: Self) {
    
    inline def setPolicy(value: Instantiable1[/* options */ PolicyOptions, Policy]): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
