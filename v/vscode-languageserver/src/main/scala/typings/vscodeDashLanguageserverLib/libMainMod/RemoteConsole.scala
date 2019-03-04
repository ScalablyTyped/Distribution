package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConsole extends Remote {
  /**
    * Show an error message.
    *
    * @param message The message to show.
    */
  def error(message: java.lang.String): scala.Unit
  /**
    * Show an information message.
    *
    * @param message The message to show.
    */
  def info(message: java.lang.String): scala.Unit
  /**
    * Log a message.
    *
    * @param message The message to log.
    */
  def log(message: java.lang.String): scala.Unit
  /**
    * Show a warning message.
    *
    * @param message The message to show.
    */
  def warn(message: java.lang.String): scala.Unit
}

object RemoteConsole {
  @scala.inline
  def apply(
    attach: js.Function1[IConnection, scala.Unit],
    connection: IConnection,
    error: js.Function1[java.lang.String, scala.Unit],
    fillServerCapabilities: js.Function1[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ServerCapabilities, 
      scala.Unit
    ],
    info: js.Function1[java.lang.String, scala.Unit],
    initialize: js.Function1[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ClientCapabilities, 
      scala.Unit
    ],
    log: js.Function1[java.lang.String, scala.Unit],
    warn: js.Function1[java.lang.String, scala.Unit]
  ): RemoteConsole = {
    val __obj = js.Dynamic.literal(attach = attach, connection = connection, error = error, fillServerCapabilities = fillServerCapabilities, info = info, initialize = initialize, log = log, warn = warn)
  
    __obj.asInstanceOf[RemoteConsole]
  }
}

