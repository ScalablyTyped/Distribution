package typings.winjs.WinJS.Utilities.Scheduler

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.Scheduler.schedulePromiseIdle")
@js.native
object schedulePromiseIdle extends js.Object {
  /**
    * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.Idle priority.
    * @param promiseValue The value returned by the completed Promise.
    * @param jobName A string that describes the job for diagnostic purposes.
    * @returns A Promise that completes within a job of idle priority.
    **/
  def apply[U](): Promise[U] = js.native
  def apply[U](promiseValue: U): Promise[U] = js.native
  def apply[U](promiseValue: U, jobName: String): Promise[U] = js.native
}

