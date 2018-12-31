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

