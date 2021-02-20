package typings.winjs.WinJS.Utilities

import typings.winjs.WinJS.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functions and objects for scheduling and managing asynchronous tasks.
**/
object Scheduler {
  
  @js.native
  sealed trait Priority extends StObject
  //#region Enumerations
  /**
    * Represents a priority for a job managed by the Scheduler.
    **/
  @JSGlobal("WinJS.Utilities.Scheduler.Priority")
  @js.native
  object Priority extends StObject {
    
    /**
      * A priority higher than the normal priority level.
      **/
    @js.native
    sealed trait aboveNormal extends Priority
    
    /**
      * A priority less than the normal priority level.
      **/
    @js.native
    sealed trait belowNormal extends Priority
    
    /**
      * A high priority.
      **/
    @js.native
    sealed trait high extends Priority
    
    /**
      * The idle priority for work items.
      **/
    @js.native
    sealed trait idle extends Priority
    
    /**
      * The highest priority.
      **/
    @js.native
    sealed trait max extends Priority
    
    /**
      * The lowest priority.
      **/
    @js.native
    sealed trait min extends Priority
    
    /**
      * The normal priority for work items.
      **/
    @js.native
    sealed trait normal extends Priority
  }
  
  //#endregion Enumerations
  //#region Interfaces
  /**
    * Represents a work item that's executed by the Scheduler.
    **/
  @js.native
  trait IJob extends StObject {
    
    //#region Methods
    /**
      * Cancels the job.
      **/
    def cancel(): Unit = js.native
    
    //#endregion Methods
    //#region Properties
    /**
      * Gets a value that indicates whether the job has successfully completed.
      **/
    var completed: Boolean = js.native
    
    /**
      * Gets the unique numeric identifier assigned to the job.
      **/
    var id: Double = js.native
    
    /**
      * Gets or sets the name of the job.
      **/
    var name: String = js.native
    
    /**
      * Gets or sets the owner of the job.
      **/
    var owner: IOwnerToken = js.native
    
    /**
      * Pauses the job.
      **/
    def pause(): Unit = js.native
    
    /**
      * Gets or sets the priority of the job.
      **/
    var priority: Priority = js.native
    
    /**
      * Resumes the job.
      **/
    def resume(): Unit = js.native
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
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), completed = completed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), priority = priority.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume))
      __obj.asInstanceOf[IJob]
    }
    
    @scala.inline
    implicit class IJobMutableBuilder[Self <: IJob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: IOwnerToken): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Provides a control mechanism that allows a job to cooperatively yield. This object is passed to your work function when you schedule it.
    **/
  @js.native
  trait IJobInfo extends StObject {
    
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
    implicit class IJobInfoMutableBuilder[Self <: IJobInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJob(value: IJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetPromise(value: Promise[_] => Unit): Self = StObject.set(x, "setPromise", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetWork(value: js.Function => Unit): Self = StObject.set(x, "setWork", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldYield(value: Boolean): Self = StObject.set(x, "shouldYield", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents an object that owns jobs. You can use this object to cancel a set of jobs.
    **/
  @js.native
  trait IOwnerToken extends StObject {
    
    //#region Methods
    /**
      * Synchronously cancels the job that this token owns, including paused and blocked jobs.
      **/
    def cancelAll(): Unit = js.native
  }
  object IOwnerToken {
    
    @scala.inline
    def apply(cancelAll: () => Unit): IOwnerToken = {
      val __obj = js.Dynamic.literal(cancelAll = js.Any.fromFunction0(cancelAll))
      __obj.asInstanceOf[IOwnerToken]
    }
    
    @scala.inline
    implicit class IOwnerTokenMutableBuilder[Self <: IOwnerToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelAll(value: () => Unit): Self = StObject.set(x, "cancelAll", js.Any.fromFunction0(value))
    }
  }
}
