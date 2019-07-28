package typings.xrm.XrmNs.ProcessFlowNs

import typings.xrm.XrmNs.CollectionNs.ItemCollection
import typings.xrm.XrmNs.EventsNs.ContextSensitiveHandler
import typings.xrm.XrmNs.EventsNs.ProcessStatusChangeHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the formContext.data.process API.
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-data-process External Link: formContext.data.process (Client API reference)}
  */
@js.native
trait ProcessManager extends js.Object {
  /**
    * Use this to add a function as an event handler for the OnProcessStatusChange event so that it will be called when the
    * business process flow status changes.
    * @param handler The function will be added to the bottom of the event
    *                handler pipeline. The execution context is automatically
    *                set to be the first parameter passed to the event handler.
    *                Use a reference to a named function rather than an
    *                anonymous function if you may later want to remove the
    *                event handler.
    */
  def addOnProcessStatusChange(handler: ProcessStatusChangeHandler): Unit = js.native
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

