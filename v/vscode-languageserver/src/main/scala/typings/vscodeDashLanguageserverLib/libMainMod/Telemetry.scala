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
    val __obj = js.Dynamic.literal(attach = attach, connection = connection, fillServerCapabilities = fillServerCapabilities, initialize = initialize, logEvent = logEvent)
  
    __obj.asInstanceOf[Telemetry]
  }
}

