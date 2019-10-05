package typings.winjs.WinJS.Utilities.Scheduler

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.Scheduler.requestDrain")
@js.native
object requestDrain extends js.Object {
  /**
    * Runs jobs in the scheduler without timeslicing until all jobs at the specified priority and higher have executed.
    * @param priority The priority to which the scheduler should drain. The default is -15.
    * @param name An optional description of the drain request for diagnostics.
    * @returns A Promise which completes when the drain has finished. Canceling this Promise cancels the drain request. This Promise will never enter an error state.
    **/
  def apply(): Promise[_] = js.native
  def apply(priority: Priority): Promise[_] = js.native
  def apply(priority: Priority, name: String): Promise[_] = js.native
}

