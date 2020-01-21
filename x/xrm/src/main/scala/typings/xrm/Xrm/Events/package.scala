package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Events {
  /**
    * Type for a context-sensitive handler.
    * @param context The context.
    */
  type ContextSensitiveHandler = js.Function1[/* context */ typings.xrm.Xrm.Events.EventContext, scala.Unit]
  /**
    * Type for a process status change handler.
    * @param status The process status.
    */
  type ProcessStatusChangeHandler = js.Function1[/* status */ typings.xrm.Xrm.ProcessFlow.ProcessStatus, scala.Unit]
}
