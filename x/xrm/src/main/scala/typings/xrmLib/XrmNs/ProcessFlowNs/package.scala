package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ProcessFlowNs {
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
  type GetProcessInstancesDelegate = js.Function1[/* object */ ProcessDictionary, scala.Unit]
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
  type ProcessCallbackDelegate = js.Function1[/* status */ java.lang.String, scala.Unit]
  /**
    * Called when process set status method has completed.
    * @param status The new status of the process instance: active, aborted, or finished
    */
  type ProcessSetStatusDelegate = js.Function1[/* status */ ProcessStatus, scala.Unit]
  /**
    * Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
    * @see {@link XrmEnum.ProcessStatus}
    */
  type ProcessStatus = xrmLib.xrmLibStrings.active | xrmLib.xrmLibStrings.aborted | xrmLib.xrmLibStrings.finished
  /**
    * Called when method to set active process is complete
    * @param status The result of the set active process operation.
    * @remarks **Values returned are**:
    * * success        (The operation succeeded.)
    * * invalid        (The processInstanceId isn’t valid or the process isn’t enabled.)
    */
  type SetProcessInstanceDelegate = js.Function1[/* status */ java.lang.String, scala.Unit]
  /**
    * Direction types for a process stage change event
    * @see {@link XrmEnum.StageChangeDirection}
    */
  type StageChangeDirection = xrmLib.xrmLibStrings.Next | xrmLib.xrmLibStrings.Previous
  /**
    * Status for {@link ProcessFlow.Stage.getStatus Stage.getStatus()}.
    * @see {@link XrmEnum.StageStatus}
    */
  type StageStatus = xrmLib.xrmLibStrings.active | xrmLib.xrmLibStrings.inactive
}
