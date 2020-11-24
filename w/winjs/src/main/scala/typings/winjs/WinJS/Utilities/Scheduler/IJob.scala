package typings.winjs.WinJS.Utilities.Scheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion Enumerations
//#region Interfaces
/**
  * Represents a work item that's executed by the Scheduler.
  **/
@js.native
trait IJob extends js.Object {
  
  //#region Methods
  /**
    * Cancels the job.
    **/
  def cancel(): Unit = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets a value that indicates whether the job has successfully completed.
    **/
  var completed: Boolean = js.native
  
  /**
    * Gets the unique numeric identifier assigned to the job.
    **/
  var id: Double = js.native
  
  /**
    * Gets or sets the name of the job.
    **/
  var name: String = js.native
  
  /**
    * Gets or sets the owner of the job.
    **/
  var owner: IOwnerToken = js.native
  
  /**
    * Pauses the job.
    **/
  def pause(): Unit = js.native
  
  /**
    * Gets or sets the priority of the job.
    **/
  var priority: Priority = js.native
  
  /**
    * Resumes the job.
    **/
  def resume(): Unit = js.native
}
object IJob {
  
  @scala.inline
  def apply(
    cancel: () => Unit,
    completed: Boolean,
    id: Double,
    name: String,
    owner: IOwnerToken,
    pause: () => Unit,
    priority: Priority,
    resume: () => Unit
  ): IJob = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), completed = completed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), priority = priority.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume))
    __obj.asInstanceOf[IJob]
  }
  
  @scala.inline
  implicit class IJobOps[Self <: IJob] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleted(value: Boolean): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: IOwnerToken): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPriority(value: Priority): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("resume", js.Any.fromFunction0(value))
  }
}
