package typings
package winjsLib.WinJSNs.UtilitiesNs.SchedulerNs

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
  var shouldYield: scala.Boolean
  //#region Methods
  /**
    * Uses a Promise to determine how long the scheduler should wait before rescheduling the job after it yields.
    * @param promise Once the work item yields, the scheduler will wait for this Promise to complete before rescheduling the job.
    **/
  def setPromise(promise: winjsLib.WinJSNs.Promise[_]): scala.Unit
  /**
    * Specifies the next unit of work to run once this job yields.
    * @param work The next unit of work to run once this job yields.
    **/
  def setWork(work: js.Function): scala.Unit
}

object IJobInfo {
  @scala.inline
  def apply(
    job: IJob,
    setPromise: js.Function1[winjsLib.WinJSNs.Promise[_], scala.Unit],
    setWork: js.Function1[js.Function, scala.Unit],
    shouldYield: scala.Boolean
  ): IJobInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("job")(job)
    __obj.updateDynamic("setPromise")(setPromise)
    __obj.updateDynamic("setWork")(setWork)
    __obj.updateDynamic("shouldYield")(shouldYield)
    __obj.asInstanceOf[IJobInfo]
  }
}

