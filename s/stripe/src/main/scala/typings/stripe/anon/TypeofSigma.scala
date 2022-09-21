package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.Sigma.ScheduledQueryRunsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSigma extends StObject {
  
  val ScheduledQueryRun: Any
  
  var ScheduledQueryRunsResource: Instantiable0[typings.stripe.mod.Stripe.Sigma.ScheduledQueryRunsResource]
}
object TypeofSigma {
  
  inline def apply(ScheduledQueryRun: Any, ScheduledQueryRunsResource: Instantiable0[ScheduledQueryRunsResource]): TypeofSigma = {
    val __obj = js.Dynamic.literal(ScheduledQueryRun = ScheduledQueryRun.asInstanceOf[js.Any], ScheduledQueryRunsResource = ScheduledQueryRunsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSigma]
  }
  
  extension [Self <: TypeofSigma](x: Self) {
    
    inline def setScheduledQueryRun(value: Any): Self = StObject.set(x, "ScheduledQueryRun", value.asInstanceOf[js.Any])
    
    inline def setScheduledQueryRunsResource(value: Instantiable0[ScheduledQueryRunsResource]): Self = StObject.set(x, "ScheduledQueryRunsResource", value.asInstanceOf[js.Any])
  }
}
