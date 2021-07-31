package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "WorkflowConfiguration")
@js.native
// Defined property mapped to task_routing.
class WorkflowConfiguration () extends StObject {
  def this(options: WorkflowConfigurationOptions) = this()
  
  var taskRouting: TaskRoutingConfiguration = js.native
  
  var task_routing: TaskRoutingConfiguration = js.native
  
  def toJSON(): String = js.native
}
/* static members */
object WorkflowConfiguration {
  
  @JSImport("twilio", "WorkflowConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromJSON(json: String): WorkflowConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[WorkflowConfiguration]
}
