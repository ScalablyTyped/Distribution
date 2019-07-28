package typings.winjs.WinJSNs.UtilitiesNs.SchedulerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Enumerations
//#region Interfaces
/**
  * Represents a work item that's executed by the Scheduler.
  **/
trait IJob extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets a value that indicates whether the job has successfully completed.
    **/
  var completed: Boolean
  /**
    * Gets the unique numeric identifier assigned to the job.
    **/
  var id: Double
  /**
    * Gets or sets the name of the job.
    **/
  var name: String
  /**
    * Gets or sets the owner of the job.
    **/
  var owner: IOwnerToken
  /**
    * Gets or sets the priority of the job.
    **/
  var priority: Priority
  //#region Methods
  /**
    * Cancels the job.
    **/
  def cancel(): Unit
  /**
    * Pauses the job.
    **/
  def pause(): Unit
  /**
    * Resumes the job.
    **/
  def resume(): Unit
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
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), completed = completed, id = id, name = name, owner = owner, pause = js.Any.fromFunction0(pause), priority = priority, resume = js.Any.fromFunction0(resume))
  
    __obj.asInstanceOf[IJob]
  }
}

