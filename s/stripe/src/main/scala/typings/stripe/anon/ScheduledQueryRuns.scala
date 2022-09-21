package typings.stripe.anon

import typings.stripe.mod.Stripe.Sigma.ScheduledQueryRunsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledQueryRuns extends StObject {
  
  var scheduledQueryRuns: ScheduledQueryRunsResource
}
object ScheduledQueryRuns {
  
  inline def apply(scheduledQueryRuns: ScheduledQueryRunsResource): ScheduledQueryRuns = {
    val __obj = js.Dynamic.literal(scheduledQueryRuns = scheduledQueryRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledQueryRuns]
  }
  
  extension [Self <: ScheduledQueryRuns](x: Self) {
    
    inline def setScheduledQueryRuns(value: ScheduledQueryRunsResource): Self = StObject.set(x, "scheduledQueryRuns", value.asInstanceOf[js.Any])
  }
}
