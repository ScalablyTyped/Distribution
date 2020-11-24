package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemNextStateOnTransition extends js.Object {
  
  /**
    * Error code if there is no next state transition possible.
    */
  var errorCode: String = js.native
  
  /**
    * Work item ID.
    */
  var id: Double = js.native
  
  /**
    * Error message if there is no next state transition possible.
    */
  var message: String = js.native
  
  /**
    * Name of the next state on transition.
    */
  var stateOnTransition: String = js.native
}
object WorkItemNextStateOnTransition {
  
  @scala.inline
  def apply(errorCode: String, id: Double, message: String, stateOnTransition: String): WorkItemNextStateOnTransition = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stateOnTransition = stateOnTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemNextStateOnTransition]
  }
  
  @scala.inline
  implicit class WorkItemNextStateOnTransitionOps[Self <: WorkItemNextStateOnTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateOnTransition(value: String): Self = this.set("stateOnTransition", value.asInstanceOf[js.Any])
  }
}
