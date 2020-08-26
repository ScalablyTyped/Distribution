package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteConsole extends js.Object {
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection = js.native
  /**
    * Show an error message.
    *
    * @param message The message to show.
    */
  def error(message: String): Unit = js.native
  /**
    * Show an information message.
    *
    * @param message The message to show.
    */
  def info(message: String): Unit = js.native
  /**
    * Log a message.
    *
    * @param message The message to log.
    */
  def log(message: String): Unit = js.native
  /**
    * Show a warning message.
    *
    * @param message The message to show.
    */
  def warn(message: String): Unit = js.native
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
  @scala.inline
  implicit class RemoteConsoleOps[Self <: RemoteConsole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnection(value: IConnection): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def setInfo(value: String => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def setLog(value: String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    @scala.inline
    def setWarn(value: String => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
  }
  
}

