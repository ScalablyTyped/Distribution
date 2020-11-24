package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a registered background task. */
@js.native
trait IBackgroundTaskRegistration extends js.Object {
  
  /** Gets the name of a registered background task. */
  var name: String = js.native
  
  /** Gets the identifier of a registered background task. */
  var taskId: String = js.native
  
  /** Gets the trigger associated with the background task. */
  var trigger: IBackgroundTrigger = js.native
  
  /**
    * Unregisters a registered background task.
    * @param cancelTask True if currently running instances of this background task should be canceled. If this parameter is false, currently running instances of this background task should be allowed to finish. Canceled instances receive a Canceled event with a BackgroundTaskCancellationReason of Abort.
    */
  def unregister(cancelTask: Boolean): Unit = js.native
}
object IBackgroundTaskRegistration {
  
  @scala.inline
  def apply(name: String, taskId: String, trigger: IBackgroundTrigger, unregister: Boolean => Unit): IBackgroundTaskRegistration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[IBackgroundTaskRegistration]
  }
  
  @scala.inline
  implicit class IBackgroundTaskRegistrationOps[Self <: IBackgroundTaskRegistration] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: String): Self = this.set("taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: IBackgroundTrigger): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnregister(value: Boolean => Unit): Self = this.set("unregister", js.Any.fromFunction1(value))
  }
}
