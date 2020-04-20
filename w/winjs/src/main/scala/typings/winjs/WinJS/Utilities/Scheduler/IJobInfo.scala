package typings.winjs.WinJS.Utilities.Scheduler

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a control mechanism that allows a job to cooperatively yield. This object is passed to your work function when you schedule it.
  **/
trait IJobInfo extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets the work item associated with this IJobInfo.
    **/
  var job: IJob
  /**
    * Gets a value that specifies whether the job should yield.
    **/
  var shouldYield: Boolean
  //#region Methods
  /**
    * Uses a Promise to determine how long the scheduler should wait before rescheduling the job after it yields.
    * @param promise Once the work item yields, the scheduler will wait for this Promise to complete before rescheduling the job.
    **/
  def setPromise(promise: Promise[_]): Unit
  /**
    * Specifies the next unit of work to run once this job yields.
    * @param work The next unit of work to run once this job yields.
    **/
  def setWork(work: js.Function): Unit
}

object IJobInfo {
  @scala.inline
  def apply(job: IJob, setPromise: Promise[_] => Unit, setWork: js.Function => Unit, shouldYield: Boolean): IJobInfo = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any], setPromise = js.Any.fromFunction1(setPromise), setWork = js.Any.fromFunction1(setWork), shouldYield = shouldYield.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJobInfo]
  }
}

