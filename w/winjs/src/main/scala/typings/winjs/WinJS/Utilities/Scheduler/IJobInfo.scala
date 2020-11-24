package typings.winjs.WinJS.Utilities.Scheduler

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a control mechanism that allows a job to cooperatively yield. This object is passed to your work function when you schedule it.
  **/
@js.native
trait IJobInfo extends js.Object {
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets the work item associated with this IJobInfo.
    **/
  var job: IJob = js.native
  
  //#region Methods
  /**
    * Uses a Promise to determine how long the scheduler should wait before rescheduling the job after it yields.
    * @param promise Once the work item yields, the scheduler will wait for this Promise to complete before rescheduling the job.
    **/
  def setPromise(promise: Promise[_]): Unit = js.native
  
  /**
    * Specifies the next unit of work to run once this job yields.
    * @param work The next unit of work to run once this job yields.
    **/
  def setWork(work: js.Function): Unit = js.native
  
  /**
    * Gets a value that specifies whether the job should yield.
    **/
  var shouldYield: Boolean = js.native
}
object IJobInfo {
  
  @scala.inline
  def apply(job: IJob, setPromise: Promise[_] => Unit, setWork: js.Function => Unit, shouldYield: Boolean): IJobInfo = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any], setPromise = js.Any.fromFunction1(setPromise), setWork = js.Any.fromFunction1(setWork), shouldYield = shouldYield.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJobInfo]
  }
  
  @scala.inline
  implicit class IJobInfoOps[Self <: IJobInfo] (val x: Self) extends AnyVal {
    
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
    def setJob(value: IJob): Self = this.set("job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetPromise(value: Promise[_] => Unit): Self = this.set("setPromise", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWork(value: js.Function => Unit): Self = this.set("setWork", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldYield(value: Boolean): Self = this.set("shouldYield", value.asInstanceOf[js.Any])
  }
}
