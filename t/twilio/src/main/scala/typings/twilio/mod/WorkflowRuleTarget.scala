package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "WorkflowRuleTarget")
@js.native
class WorkflowRuleTarget () extends StObject {
  def this(options: WorkflowRuleTargetOptions) = this()
  
  var expression: String = js.native
  
  var priority: Double = js.native
  
  var queue: String = js.native
  
  var timeout: Double = js.native
}
