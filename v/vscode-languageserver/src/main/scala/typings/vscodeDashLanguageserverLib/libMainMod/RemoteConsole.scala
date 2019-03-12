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
    attach: IConnection => scala.Unit,
    connection: IConnection,
    error: java.lang.String => scala.Unit,
    fillServerCapabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ServerCapabilities => scala.Unit,
    info: java.lang.String => scala.Unit,
    initialize: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ClientCapabilities => scala.Unit,
    log: java.lang.String => scala.Unit,
    warn: java.lang.String => scala.Unit
  ): RemoteConsole = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), connection = connection, error = js.Any.fromFunction1(error), fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), info = js.Any.fromFunction1(info), initialize = js.Any.fromFunction1(initialize), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[RemoteConsole]
  }
}

