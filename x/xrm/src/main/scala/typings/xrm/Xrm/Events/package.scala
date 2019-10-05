package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Events {
  import typings.xrm.Xrm.ProcessFlow.ProcessStatus

  /**
    * Type for a context-sensitive handler.
    * @param context The context.
    */
  type ContextSensitiveHandler = js.Function1[/* context */ EventContext, Unit]
  /**
    * Type for a process status change handler.
    * @param status The process status.
    */
  type ProcessStatusChangeHandler = js.Function1[/* status */ ProcessStatus, Unit]
}
