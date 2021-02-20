package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "TaskRoutingConfiguration")
@js.native
// Defined property mapped to default_filter.
class TaskRoutingConfiguration () extends StObject {
  def this(options: TaskRoutingConfigurationOptions) = this()
  
  var defaultFilter: WorkflowRuleOptions = js.native
  
  var default_filter: WorkflowRuleOptions = js.native
  
  var filters: js.Array[WorkflowRule] = js.native
}
