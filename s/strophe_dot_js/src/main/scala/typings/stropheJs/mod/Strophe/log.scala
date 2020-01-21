package typings.stropheJs.mod.Strophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strophe.js", "Strophe.log")
@js.native
object log extends js.Object {
  /** Function: log
    *  User overrideable logging function.
    *
    *  This function is called whenever the Strophe library calls any
    *  of the logging functions.  The default implementation of this
    *  function does nothing.  If client code wishes to handle the logging
    *  messages, it should override this with
    *  > Strophe.log = function (level, msg) {
    *  >   (user code here)
    *  > };
    *
    *  Please note that data sent and received over the wire is logged
    *  via Strophe.Connection.rawInput() and Strophe.Connection.rawOutput().
    *
    *  The different levels and their meanings are
    *
    *    DEBUG - Messages useful for debugging purposes.
    *    INFO - Informational messages.  This is mostly information like
    *      'disconnect was called' or 'SASL auth succeeded'.
    *    WARN - Warnings about potential problems.  This is mostly used
    *      to report transient connection errors like request timeouts.
    *    ERROR - Some error occurred.
    *    FATAL - A non-recoverable fatal error occurred.
    *
    *  Parameters:
    *    (Integer) level - The log level of the log message.  This will
    *      be one of the values in Strophe.LogLevel.
    *    (String) msg - The log message.
    */
  def apply(level: LogLevel, msg: String): Unit = js.native
}

