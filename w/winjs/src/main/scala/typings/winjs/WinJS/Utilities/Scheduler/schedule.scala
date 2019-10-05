package typings.winjs.WinJS.Utilities.Scheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.Scheduler.schedule")
@js.native
object schedule extends js.Object {
  /**
    * Schedules the specified function to execute asynchronously.
    * @param work A function that represents the work item to be scheduled. When called the work item will receive as its first argument an object which allows the work item to ask the scheduler if it should yield cooperatively and if so allows the work item to either provide a function to be run as a continuation or a WinJS.Promise which will when complete provide a function to run as a continuation. Provide these fields for the object: shouldYield, setWork(work), setPromise(promise), job.
    * @param priority The priority of the work item. If you don't specify a priority, it defaults to WinJS.Utilities.Scheduler.Priority.normal.
    * @param thisArg A "this" instance to be bound to the work item. The default value is null.
    * @param name A description of the work item for diagnostics. The default value is an empty string.
    * @returns The job instance that represents this work item.
    **/
  def apply(work: js.Function1[/* jobInfo */ IJobInfo, _]): IJob = js.native
  def apply(work: js.Function1[/* jobInfo */ IJobInfo, _], priority: Priority): IJob = js.native
  def apply(work: js.Function1[/* jobInfo */ IJobInfo, _], priority: Priority, thisArg: js.Any): IJob = js.native
  def apply(work: js.Function1[/* jobInfo */ IJobInfo, _], priority: Priority, thisArg: js.Any, name: String): IJob = js.native
}

