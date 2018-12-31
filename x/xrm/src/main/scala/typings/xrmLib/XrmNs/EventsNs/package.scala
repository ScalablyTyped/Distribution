package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventsNs {
  /**
    * Type for a context-sensitive handler.
    * @param context The context.
    */
  type ContextSensitiveHandler = js.Function1[/* context */ EventContext, scala.Unit]
  /**
    * Type for a process status change handler.
    * @param status The process status.
    */
  type ProcessStatusChangeHandler = js.Function1[/* status */ xrmLib.XrmNs.ProcessFlowNs.ProcessStatus, scala.Unit]
}
