package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Telemetry extends Remote {
  /**
    * Log the given data to telemetry.
    *
    * @param data The data to log. Must be a JSON serializable object.
    */
  def logEvent(data: js.Any): scala.Unit
}

object Telemetry {
  @scala.inline
  def apply(
    attach: js.Function1[IConnection, scala.Unit],
    connection: IConnection,
    fillServerCapabilities: js.Function1[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ServerCapabilities, 
      scala.Unit
    ],
    initialize: js.Function1[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ClientCapabilities, 
      scala.Unit
    ],
    logEvent: js.Function1[js.Any, scala.Unit]
  ): Telemetry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attach")(attach)
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("fillServerCapabilities")(fillServerCapabilities)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("logEvent")(logEvent)
    __obj.asInstanceOf[Telemetry]
  }
}

