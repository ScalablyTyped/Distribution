package typings.vscodeDashLanguageserver.vscodeDashLanguageserverMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.ClientCapabilities
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.ServerCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConsole extends Remote {
  /**
    * Show an error message.
    *
    * @param message The message to show.
    */
  def error(message: String): Unit
  /**
    * Show an information message.
    *
    * @param message The message to show.
    */
  def info(message: String): Unit
  /**
    * Log a message.
    *
    * @param message The message to log.
    */
  def log(message: String): Unit
  /**
    * Show a warning message.
    *
    * @param message The message to show.
    */
  def warn(message: String): Unit
}

object RemoteConsole {
  @scala.inline
  def apply(
    attach: IConnection => Unit,
    connection: IConnection,
    error: String => Unit,
    fillServerCapabilities: ServerCapabilities => Unit,
    info: String => Unit,
    initialize: ClientCapabilities => Unit,
    log: String => Unit,
    warn: String => Unit
  ): RemoteConsole = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), info = js.Any.fromFunction1(info), initialize = js.Any.fromFunction1(initialize), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[RemoteConsole]
  }
}

