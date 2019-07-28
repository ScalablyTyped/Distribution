package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.ClientCapabilities
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.ServerCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Telemetry extends Remote {
  /**
    * Log the given data to telemetry.
    *
    * @param data The data to log. Must be a JSON serializable object.
    */
  def logEvent(data: js.Any): Unit
}

object Telemetry {
  @scala.inline
  def apply(
    attach: IConnection => Unit,
    connection: IConnection,
    fillServerCapabilities: ServerCapabilities => Unit,
    initialize: ClientCapabilities => Unit,
    logEvent: js.Any => Unit
  ): Telemetry = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), connection = connection, fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), initialize = js.Any.fromFunction1(initialize), logEvent = js.Any.fromFunction1(logEvent))
  
    __obj.asInstanceOf[Telemetry]
  }
}

