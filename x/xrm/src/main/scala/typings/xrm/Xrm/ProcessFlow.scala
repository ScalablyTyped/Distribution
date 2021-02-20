package typings.xrm.Xrm

import org.scalablytyped.runtime.StringDictionary
import typings.xrm.Xrm.Collection.ItemCollection
import typings.xrm.Xrm.Events.ContextSensitiveHandler
import typings.xrm.Xrm.Events.ProcessStatusChangeHandler
import typings.xrm.anon.GetValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProcessFlow {
  
  /**
    * Called when method to get active processes is complete
    * @param status The result of the get active processes operation.
    * @remarks **Returns object with the following key-value pairs**:
    * * CreatedOn
    * * ProcessDefinitionID
    * * ProcessDefinitionName
    * * ProcessInstanceID
    * * ProcessInstanceName
    * * StatusCodeName
    */
  type GetProcessInstancesDelegate = js.Function1[/* object */ ProcessDictionary, Unit]
  
  /**
    * Interface for a CRM Business Process Flow instance.
    */
  @js.native
  trait Process extends StObject {
    
    /**
      * Returns the unique identifier of the process.
      * @returns The identifier for this process, in GUID format.
      * @example Example: "{825CB223-A651-DF11-AA8B-00155DBA3804}".
      */
    def getId(): String = js.native
    
    /**
      * Returns the name of the process.
      * @returns The name.
      */
    def getName(): String = js.native
    
    /**
      * Returns an collection of stages in the process.
      * @returns The stages.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    def getStages(): ItemCollection[Stage] = js.native
    
    /**
      * Returns a boolean value to indicate if the process is rendered.
      * @returns true if the process is rendered, false if not.
      */
    def isRendered(): Boolean = js.native
  }
  object Process {
    
    @scala.inline
    def apply(
      getId: () => String,
      getName: () => String,
      getStages: () => ItemCollection[Stage],
      isRendered: () => Boolean
    ): Process = {
      val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getStages = js.Any.fromFunction0(getStages), isRendered = js.Any.fromFunction0(isRendered))
      __obj.asInstanceOf[Process]
    }
    
    @scala.inline
    implicit class ProcessMutableBuilder[Self <: Process] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStages(value: () => ItemCollection[Stage]): Self = StObject.set(x, "getStages", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRendered(value: () => Boolean): Self = StObject.set(x, "isRendered", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Called when process change methods have completed.
    * @param status The result of the process change operation.
    * @remarks **Values returned are**:
    * * success        (The operation succeeded.)
    * * crossEntity    (The previous stage is for a different entity.)
    * * beginning      (The active stage is the first stage of the active path.)
    * * invalid        (The operation failed because the selected stage isn’t the same as the active stage.)
    * * unreachable    (The stage exists on a different path.)
    */
  type ProcessCallbackDelegate = js.Function1[/* status */ String, Unit]
  
  /**
    * Represents a key-value pair, where the key is the Process Flow's ID, and the value is the name thereof.
    */
  type ProcessDictionary = StringDictionary[String]
  
  /**
    * Interface for the formContext.data.process API.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-data-process External Link: formContext.data.process (Client API reference)}
    */
  @js.native
  trait ProcessManager extends StObject {
    
    /**
      * Use this to add a function as an event handler for the OnPreProcessStatusChange event so that it will be called before the
      * business process flow status changes.
      * @param handler The function will be added to the bottom of the event
      *                handler pipeline. The execution context is automatically
      *                set to be the first parameter passed to the event handler.
      *                Use a reference to a named function rather than an
      *                anonymous function if you may later want to remove the
      *                event handler.
      */
    def addOnPreProcessStatusChange(handler: ContextSensitiveHandler): Unit = js.native
    
    /**
      * Use this to add a function as an event handler for the OnPreStageChange event so that it will be called before the
      * business process flow stage changes.
      * @param handler The function will be added to the bottom of the event
      *                handler pipeline. The execution context is automatically
      *                set to be the first parameter passed to the event handler.
      *                Use a reference to a named function rather than an
      *                anonymous function if you may later want to remove the
      *                event handler.
      */
    def addOnPreStageChange(handler: ContextSensitiveHandler): Unit = js.native
    
    /**
      * Use this to add a function as an event handler for the OnPreProcessStatusChange event so that it will be called when the
      * business process flow status changes.
      * @param handler The function will be added to the bottom of the event
      *                handler pipeline. The execution context is automatically
      *                set to be the first parameter passed to the event handler.
      *                Use a reference to a named function rather than an
      *                anonymous function if you may later want to remove the
      *                event handler.
      */
    def addOnProcessStatusChange(handler: ContextSensitiveHandler): Unit = js.native
    
    /**
      * Use this to add a function as an event handler for the OnStageChange event so that it will be called when the
      * business process flow stage changes.
      * @param handler The function will be added to the bottom of the event
      *                handler pipeline. The execution context is automatically
      *                set to be the first parameter passed to the event handler.
      *                Use a reference to a named function rather than an
      *                anonymous function if you may later want to remove the
      *                event handler.
      */
    def addOnStageChange(handler: ContextSensitiveHandler): Unit = js.native
    
    /**
      * Use this to add a function as an event handler for the OnStageSelected event so that it will be called
      * when a business process flow stage is selected.
      * @param handler The function will be added to the bottom of the event
      *                handler pipeline. The execution context is automatically
      *                set to be the first parameter passed to the event handler.
      *                Use a reference to a named function rather than an
      *                anonymous function if you may later want to remove the
      *                event handler.
      */
    def addOnStageSelected(handler: ContextSensitiveHandler): Unit = js.native
    
    /**
      * Use this method to get a collection of stages currently in the active path with methods to interact with the
      * stages displayed in the business process flow control. The active path represents stages currently rendered in
      * the process control based on the branching rules and current data in the record.
      * @returns A collection of all completed stages, the currently active stage, and the predicted set of future stages
      *          based on satisfied conditions in the branching rule. This may be a subset of the stages returned with
      *          formContext.data.process.getActiveProcess because it will only include those stages which represent a valid
      *          transition from the current stage based on branching that has occurred in the process.
      * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
      */
    def getActivePath(): ItemCollection[Stage] = js.native
    
    /**
      * Returns a Process object representing the active process.
      * @returns current active process.
      */
    def getActiveProcess(): Process = js.native
    
    /**
      * Returns a Stage object representing the active stage.
      * @returns current active stage.
      */
    def getActiveStage(): Stage = js.native
    
    /**
      * Use this method to asynchronously retrieve the enabled business process flows that the user can switch to for an
      * entity.
      * @param callbackFunction The callback function must accept a parameter that contains an object with
      *                         dictionary properties where the name of the property is the Id of the
      *                         business process flow and the value of the property is the name of the
      *                         business process flow.
      *                         The enabled processes are filtered according to the user’s privileges. The
      *                         list of enabled processes is the same ones a user can see in the UI if they
      *                         want to change the process manually.
      */
    def getEnabledProcesses(callbackFunction: js.Function1[/* enabledProcesses */ ProcessDictionary, Unit]): Unit = js.native
    
    /**
      * Use this method to get the unique identifier of the process instance
      * @returns The unique identifier of the process instance
      */
    def getInstanceId(): String = js.native
    
    /**
      * Use this method to get the name of the process instance
      * @returns The name of the process instance
      */
    def getInstanceName(): String = js.native
    
    /**
      * Returns all process instances for the entity record that the calling user has access to.
      * @param callbackFunction (Optional) a function to call when the operation is complete.
      */
    def getProcessInstances(): Unit = js.native
    def getProcessInstances(callbackFunction: GetProcessInstancesDelegate): Unit = js.native
    
    /**
      * Use this method to get the currently selected stage.
      * @returns The currently selected stage.
      */
    def getSelectedStage(): Stage = js.native
    
    /**
      * Use this method to get the current status of the process instance
      * @returns The current status of the process
      */
    def getStatus(): ProcessStatus = js.native
    
    /**
      * Progresses to the next stage.
      * @param callbackFunction (Optional) A function to call when the operation is complete.
      */
    def moveNext(): Unit = js.native
    def moveNext(callbackFunction: ProcessCallbackDelegate): Unit = js.native
    
    /**
      * Moves to the previous stage.
      * @param callbackFunction (Optional) A function to call when the operation is complete.
      */
    def movePrevious(): Unit = js.native
    def movePrevious(callbackFunction: ProcessCallbackDelegate): Unit = js.native
    
    /**
      * Use this to remove a function as an event handler for the OnPreProcessStatusChange event.
      * @param handler If an anonymous function is set using the addOnPreProcessStatusChange method it
      *                cannot be removed using this method.
      */
    def removeOnPreProcessStatusChange(handler: ProcessStatusChangeHandler): Unit = js.native
    
    /**
      * Use this to remove a function as an event handler for the OnPreStageChange event.
      * @param handler If an anonymous function is set using the addOnPreStageChange method it
      *                cannot be removed using this method.
      */
    def removeOnPreStageChange(handler: ContextSensitiveHandler): Unit = js.native
    
    /**
      * Use this to remove a function as an event handler for the OnProcessStatusChange event.
      * @param handler If an anonymous function is set using the addOnProcessStatusChange method it
      *                cannot be removed using this method.
      */
    def removeOnProcessStatusChange(handler: ProcessStatusChangeHandler): Unit = js.native
    
    /**
      * Use this to remove a function as an event handler for the OnStageChange event.
      * @param handler If an anonymous function is set using the addOnStageChange method it
      *                cannot be removed using this method.
      */
    def removeOnStageChange(handler: ContextSensitiveHandler): Unit = js.native
    
    /**
      * Use this to remove a function as an event handler for the OnStageChange event.
      * @param handler If an anonymous function is set using the addOnStageChange method it
      *                cannot be removed using this method.
      */
    def removeOnStageSelected(handler: ContextSensitiveHandler): Unit = js.native
    
    /**
      * Set a Process as the active process.
      * @param processId The Id of the process to make the active process.
      * @param callbackFunction (Optional) a function to call when the operation is complete.
      */
    def setActiveProcess(processId: String): Unit = js.native
    def setActiveProcess(processId: String, callbackFunction: ProcessCallbackDelegate): Unit = js.native
    
    /**
      * Sets a process instance as the active instance
      * @param processInstanceId The Id of the process instance to make the active instance.
      * @param callbackFunction (Optional) a function to call when the operation is complete.
      */
    def setActiveProcessInstance(processInstanceId: String): Unit = js.native
    def setActiveProcessInstance(processInstanceId: String, callbackFunction: SetProcessInstanceDelegate): Unit = js.native
    
    /**
      * Set a stage as the active stage.
      * @param stageId the Id of the stage to make the active stage.
      * @param callbackFunction (Optional) a function to call when the operation is complete.
      */
    def setActiveStage(stageId: String): Unit = js.native
    def setActiveStage(stageId: String, callbackFunction: ProcessCallbackDelegate): Unit = js.native
    
    /**
      * Use this method to set the current status of the process instance
      * @param status The new status for the process
      * @param callbackFunction (Optional) a function to call when the operation is complete.
      */
    def setStatus(status: ProcessStatus): Unit = js.native
    def setStatus(status: ProcessStatus, callbackFunction: ProcessSetStatusDelegate): Unit = js.native
  }
  
  /**
    * Called when process set status method has completed.
    * @param status The new status of the process instance: active, aborted, or finished
    */
  type ProcessSetStatusDelegate = js.Function1[/* status */ ProcessStatus, Unit]
  
  /**
    * Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
    * @see {@link XrmEnum.ProcessStatus}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.active
    - typings.xrm.xrmStrings.aborted
    - typings.xrm.xrmStrings.finished
  */
  trait ProcessStatus extends StObject
  object ProcessStatus {
    
    @scala.inline
    def aborted: typings.xrm.xrmStrings.aborted = "aborted".asInstanceOf[typings.xrm.xrmStrings.aborted]
    
    @scala.inline
    def active: typings.xrm.xrmStrings.active = "active".asInstanceOf[typings.xrm.xrmStrings.active]
    
    @scala.inline
    def finished: typings.xrm.xrmStrings.finished = "finished".asInstanceOf[typings.xrm.xrmStrings.finished]
  }
  
  /**
    * Called when method to set active process is complete
    * @param status The result of the set active process operation.
    * @remarks **Values returned are**:
    * * success        (The operation succeeded.)
    * * invalid        (The processInstanceId isn’t valid or the process isn’t enabled.)
    */
  type SetProcessInstanceDelegate = js.Function1[/* status */ String, Unit]
  
  /**
    * Interface for CRM Business Process Flow stages.
    */
  @js.native
  trait Stage extends StObject {
    
    /**
      * Returns an object with a getValue method which will return the integer value of the business process flow
      * category.
      * @returns The stage category.
      */
    def getCategory(): GetValue = js.native
    
    /**
      * Returns the logical name of the entity associated with the stage.
      * @returns The entity name.
      */
    def getEntityName(): String = js.native
    
    /**
      * Returns the unique identifier of the stage.
      * @returns The identifier of the Stage, in GUID format.
      * @example Example: "{825CB223-A651-DF11-AA8B-00155DBA3804}".
      */
    def getId(): String = js.native
    
    /**
      * Returns the name of the stage.
      * @returns The name.
      */
    def getName(): String = js.native
    
    /**
      * Returns the status of the stage.
      * @returns The status, either "active" or "inactive".
      */
    def getStatus(): StageStatus = js.native
    
    /**
      * Returns a collection of steps in the stage.
      * @returns An array of Step.
      */
    def getSteps(): js.Array[Step] = js.native
  }
  object Stage {
    
    @scala.inline
    def apply(
      getCategory: () => GetValue,
      getEntityName: () => String,
      getId: () => String,
      getName: () => String,
      getStatus: () => StageStatus,
      getSteps: () => js.Array[Step]
    ): Stage = {
      val __obj = js.Dynamic.literal(getCategory = js.Any.fromFunction0(getCategory), getEntityName = js.Any.fromFunction0(getEntityName), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getStatus = js.Any.fromFunction0(getStatus), getSteps = js.Any.fromFunction0(getSteps))
      __obj.asInstanceOf[Stage]
    }
    
    @scala.inline
    implicit class StageMutableBuilder[Self <: Stage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCategory(value: () => GetValue): Self = StObject.set(x, "getCategory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEntityName(value: () => String): Self = StObject.set(x, "getEntityName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStatus(value: () => StageStatus): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSteps(value: () => js.Array[Step]): Self = StObject.set(x, "getSteps", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Direction types for a process stage change event
    * @see {@link XrmEnum.StageChangeDirection}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.Next
    - typings.xrm.xrmStrings.Previous
  */
  trait StageChangeDirection extends StObject
  object StageChangeDirection {
    
    @scala.inline
    def Next: typings.xrm.xrmStrings.Next = "Next".asInstanceOf[typings.xrm.xrmStrings.Next]
    
    @scala.inline
    def Previous: typings.xrm.xrmStrings.Previous = "Previous".asInstanceOf[typings.xrm.xrmStrings.Previous]
  }
  
  /**
    * Status for {@link ProcessFlow.Stage.getStatus Stage.getStatus()}.
    * @see {@link XrmEnum.StageStatus}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.active
    - typings.xrm.xrmStrings.inactive
  */
  trait StageStatus extends StObject
  object StageStatus {
    
    @scala.inline
    def active: typings.xrm.xrmStrings.active = "active".asInstanceOf[typings.xrm.xrmStrings.active]
    
    @scala.inline
    def inactive: typings.xrm.xrmStrings.inactive = "inactive".asInstanceOf[typings.xrm.xrmStrings.inactive]
  }
  
  @js.native
  trait Step extends StObject {
    
    /**
      * Returns the logical name of the attribute associated to the step.
      * @returns The attribute.
      * @remarks Some steps don’t contain an attribute value.
      */
    def getAttribute(): String = js.native
    
    /**
      * Returns the name of the step.
      * @returns The name.
      */
    def getName(): String = js.native
    
    /**
      * Returns whether the step is required in the business process flow.
      * @returns true if required, false if not.
      * @remarks     Returns true if the step is marked as required in the Business Process Flow editor; otherwise, false.
      *              There is no connection between this value and the values you can change in the formContext.data.entity
      *              attribute RequiredLevel methods.
      */
    def isRequired(): Boolean = js.native
  }
  object Step {
    
    @scala.inline
    def apply(getAttribute: () => String, getName: () => String, isRequired: () => Boolean): Step = {
      val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction0(getAttribute), getName = js.Any.fromFunction0(getName), isRequired = js.Any.fromFunction0(isRequired))
      __obj.asInstanceOf[Step]
    }
    
    @scala.inline
    implicit class StepMutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAttribute(value: () => String): Self = StObject.set(x, "getAttribute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    }
  }
}
