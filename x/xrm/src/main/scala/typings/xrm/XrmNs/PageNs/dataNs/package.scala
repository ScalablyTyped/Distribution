package typings.xrm.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataNs {
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
    * @deprecated Use {@link Xrm.ProcessFlow.GetProcessInstancesDelegate} instead.
    */
  type GetProcessInstancesDelegate = typings.xrm.XrmNs.ProcessFlowNs.GetProcessInstancesDelegate
  /**
    * Called when process change methods have completed.
    * @param status The result of the process change operation.
    * @remarks **Values returned are**:
    * * success        (The operation succeeded.)
    * * crossEntity    (The previous stage is for a different entity.)
    * * beginning      (The active stage is the first stage of the active path.)
    * * invalid        (The operation failed because the selected stage isn’t the same as the active stage.)
    * * unreachable    (The stage exists on a different path.)
    * @deprecated Use {@link Xrm.ProcessFlow.ProcessCallbackDelegate} instead.
    */
  type ProcessCallbackDelegate = typings.xrm.XrmNs.ProcessFlowNs.ProcessCallbackDelegate
  /**
    * Represents a key-value pair, where the key is the Process Flow's ID, and the value is the name thereof.
    * @deprecated Use {@link Xrm.ProcessFlow.ProcessDictionary} instead.
    */
  type ProcessDictionary = typings.xrm.XrmNs.ProcessFlowNs.ProcessDictionary
  /**
    * Interface for the Xrm.Page.data.process API.
    * @deprecated Use {@link Xrm.ProcessFlow.ProcessManager} instead.
    */
  type ProcessManager = typings.xrm.XrmNs.ProcessFlowNs.ProcessManager
  /**
    * Called when process set status method has completed.
    * @param status The new status of the process instance
    * @remarks **Values returned are**:
    * * active
    * * aborted
    * * finished
    * @deprecated Use {@link Xrm.ProcessFlow.ProcessSetStatusDelegate} instead.
    */
  type ProcessSetStatusDelegate = typings.xrm.XrmNs.ProcessFlowNs.ProcessSetStatusDelegate
  /**
    * Called when method to set active process is complete
    * @param status The result of the set active process operation.
    * @remarks **Values returned are**:
    * * success        (The operation succeeded.)
    * * invalid        (The processInstanceId isn’t valid or the process isn’t enabled.)
    * @deprecated Use {@link Xrm.ProcessFlow.SetProcessInstanceDelegate} instead.
    */
  type SetProcessInstanceDelegate = typings.xrm.XrmNs.ProcessFlowNs.SetProcessInstanceDelegate
}
