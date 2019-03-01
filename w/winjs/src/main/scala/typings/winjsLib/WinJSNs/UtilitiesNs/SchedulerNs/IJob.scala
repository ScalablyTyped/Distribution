package typings
package winjsLib.WinJSNs.UtilitiesNs.SchedulerNs

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
  var completed: scala.Boolean
  /**
    * Gets the unique numeric identifier assigned to the job.
    **/
  var id: scala.Double
  /**
    * Gets or sets the name of the job.
    **/
  var name: java.lang.String
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
  def cancel(): scala.Unit
  /**
    * Pauses the job.
    **/
  def pause(): scala.Unit
  /**
    * Resumes the job.
    **/
  def resume(): scala.Unit
}

object IJob {
  @scala.inline
  def apply(
    cancel: js.Function0[scala.Unit],
    completed: scala.Boolean,
    id: scala.Double,
    name: java.lang.String,
    owner: IOwnerToken,
    pause: js.Function0[scala.Unit],
    priority: Priority,
    resume: js.Function0[scala.Unit]
  ): IJob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("completed")(completed)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("priority")(priority)
    __obj.updateDynamic("resume")(resume)
    __obj.asInstanceOf[IJob]
  }
}

