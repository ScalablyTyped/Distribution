package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConsole extends js.Object {
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection
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
    connection: IConnection,
    error: String => Unit,
    info: String => Unit,
    log: String => Unit,
    warn: String => Unit
  ): RemoteConsole = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[RemoteConsole]
  }
}

