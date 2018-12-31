package typings
package winjsLib.WinJSNs.UtilitiesNs.SchedulerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.Scheduler")
@js.native
object SchedulerNsMembers extends js.Object {
  //#endregion Interfaces
  //#region Properties
  /**
    * Gets the current priority at which the caller is executing.
    **/
  var currentPriority: Priority = js.native
  //#endregion Properties
  //#region Functions
  /**
    * Creates and returns a new IOwnerToken which can be set to the owner property of one or more jobs.
    * @returns A new IOwnerToken which can be set to the owner property of one or more jobs.
    **/
  def createOwnerToken(): IOwnerToken = js.native
  /**
    * Runs the specified callback in a high priority context.
    * @param callback The callback to run in a high priority callback.
    * @returns The return value of the callback.
    **/
  def execHigh[U](callback: js.Function0[U]): U = js.native
  /**
    * Runs jobs in the scheduler without timeslicing until all jobs at the specified priority and higher have executed.
    * @param priority The priority to which the scheduler should drain. The default is -15.
    * @param name An optional description of the drain request for diagnostics.
    * @returns A Promise which completes when the drain has finished. Canceling this Promise cancels the drain request. This Promise will never enter an error state.
    **/
  def requestDrain(): winjsLib.WinJSNs.Promise[_] = js.native
  def requestDrain(priority: Priority): winjsLib.WinJSNs.Promise[_] = js.native
  def requestDrain(priority: Priority, name: java.lang.String): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Returns a string representation of the scheduler's state for diagnostic purposes. The jobs and drain requests are displayed in the order in which they are currently expected to be processed. The current job and drain request are marked by an asterisk.
    * @returns A string representation of the scheduler's state for diagnostic purposes. The jobs and drain requests are displayed in the order in which they are currently expected to be processed. The current job and drain request are marked by an asterisk.
    **/
  def retrieveState(): java.lang.String = js.native
  /**
    * Schedules the specified function to execute asynchronously.
    * @param work A function that represents the work item to be scheduled. When called the work item will receive as its first argument an object which allows the work item to ask the scheduler if it should yield cooperatively and if so allows the work item to either provide a function to be run as a continuation or a WinJS.Promise which will when complete provide a function to run as a continuation. Provide these fields for the object: shouldYield, setWork(work), setPromise(promise), job.
    * @param priority The priority of the work item. If you don't specify a priority, it defaults to WinJS.Utilities.Scheduler.Priority.normal.
    * @param thisArg A "this" instance to be bound to the work item. The default value is null.
    * @param name A description of the work item for diagnostics. The default value is an empty string.
    * @returns The job instance that represents this work item.
    **/
  def schedule(work: js.Function1[/* jobInfo */ IJobInfo, _]): IJob = js.native
  def schedule(work: js.Function1[/* jobInfo */ IJobInfo, _], priority: Priority): IJob = js.native
  def schedule(work: js.Function1[/* jobInfo */ IJobInfo, _], priority: Priority, thisArg: js.Any): IJob = js.native
  def schedule(
    work: js.Function1[/* jobInfo */ IJobInfo, _],
    priority: Priority,
    thisArg: js.Any,
    name: java.lang.String
  ): IJob = js.native
  /**
    * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.aboveNormal priority.
    * @param promiseValue The value returned by the completed Promise.
    * @param jobName A string that describes the job for diagnostic purposes.
    * @returns A Promise that completes within a job of aboveNormal priority.
    **/
  def schedulePromiseAboveNormal[U](): winjsLib.WinJSNs.Promise[U] = js.native
  def schedulePromiseAboveNormal[U](promiseValue: U): winjsLib.WinJSNs.Promise[U] = js.native
  def schedulePromiseAboveNormal[U](promiseValue: U, jobName: java.lang.String): winjsLib.WinJSNs.Promise[U] = js.native
  /**
    * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.belowNormal priority.
    * @param promiseValue The value returned by the completed Promise.
    * @param jobName A string that describes the job for diagnostic purposes.
    * @returns A Promise that completes within a job of belowNormal priority.
    **/
  def schedulePromiseBelowNormal[U](): winjsLib.WinJSNs.Promise[U] = js.native
  def schedulePromiseBelowNormal[U](promiseValue: U): winjsLib.WinJSNs.Promise[U] = js.native
  def schedulePromiseBelowNormal[U](promiseValue: U, jobName: java.lang.String): winjsLib.WinJSNs.Promise[U] = js.native
  /**
    * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.high priority.
    * @param promiseValue The value returned by the completed Promise.
    * @param jobName A string that describes the job for diagnostic purposes.
    * @returns A Promise that completes within a job of high priority.
    **/
  def schedulePromiseHigh[U](): winjsLib.WinJSNs.Promise[U] = js.native
  def schedulePromiseHigh[U](promiseValue: U): winjsLib.WinJSNs.Promise[U] = js.native
  def schedulePromiseHigh[U](promiseValue: U, jobName: java.lang.String): winjsLib.WinJSNs.Promise[U] = js.native
  /**
    * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.Idle priority.
    * @param promiseValue The value returned by the completed Promise.
    * @param jobName A string that describes the job for diagnostic purposes.
    * @returns A Promise that completes within a job of idle priority.
    **/
  def schedulePromiseIdle[U](): winjsLib.WinJSNs.Promise[U] = js.native
  def schedulePromiseIdle[U](promiseValue: U): winjsLib.WinJSNs.Promise[U] = js.native
  def schedulePromiseIdle[U](promiseValue: U, jobName: java.lang.String): winjsLib.WinJSNs.Promise[U] = js.native
  /**
    * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.normal priority.
    * @param promiseValue The value returned by the completed Promise.
    * @param jobName A string that describes the job for diagnostic purposes.
    * @returns A Promise that completes within a job of normal priority.
    **/
  def schedulePromiseNormal[U](): winjsLib.WinJSNs.Promise[U] = js.native
  def schedulePromiseNormal[U](promiseValue: U): winjsLib.WinJSNs.Promise[U] = js.native
  def schedulePromiseNormal[U](promiseValue: U, jobName: java.lang.String): winjsLib.WinJSNs.Promise[U] = js.native
}

