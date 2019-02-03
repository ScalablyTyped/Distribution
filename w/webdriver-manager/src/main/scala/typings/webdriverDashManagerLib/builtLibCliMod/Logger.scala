package typings
package webdriverDashManagerLib.builtLibCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/built/lib/cli", "Logger")
@js.native
class Logger protected ()
  extends webdriverDashManagerLib.builtLibCliLoggerMod.Logger {
  /**
    * Creates a logger instance with an ID for the logger.
    * @constructor
    */
  def this(id: java.lang.String) = this()
}

/* static members */
@JSImport("webdriver-manager/built/lib/cli", "Logger")
@js.native
object Logger extends js.Object {
  var fd: js.Any = js.native
  var firstWrite: scala.Boolean = js.native
  var logLevel: webdriverDashManagerLib.builtLibCliLoggerMod.LogLevel = js.native
  var showId: scala.Boolean = js.native
  var showTimestamp: scala.Boolean = js.native
  var writeTo: webdriverDashManagerLib.builtLibCliLoggerMod.WriteTo = js.native
  /**
    * Get the identifier of the logger as '/<id>'
    * @param logLevel The log level of the message.
    * @param writeTo The enum for where to write the logs.
    * @return The string of the formatted id
    */
  def `id_`(
    logLevel: webdriverDashManagerLib.builtLibCliLoggerMod.LogLevel,
    id: java.lang.String,
    writeTo: webdriverDashManagerLib.builtLibCliLoggerMod.WriteTo
  ): java.lang.String = js.native
  /**
    * Get the log level formatted with the first letter. For info, it is I.
    * @param logLevel The log level of the message.
    * @param writeTo The enum for where to write the logs.
    * @return The string of the formatted log level
    */
  def `level_`(
    logLevel: webdriverDashManagerLib.builtLibCliLoggerMod.LogLevel,
    id: java.lang.String,
    writeTo: webdriverDashManagerLib.builtLibCliLoggerMod.WriteTo
  ): java.lang.String = js.native
  /**
    * Convert the list of messages to a single string message.
    * @param msgs The list of messages.
    * @return The string of the formatted messages
    */
  def `msgToFile_`(msgs: js.Array[_]): java.lang.String = js.native
  /**
    * Set up the write location. If writing to a file, get the file descriptor.
    * @param writeTo The enum for where to write the logs.
    * @param opt_logFile An optional parameter to override the log file location.
    */
  def setWrite(writeTo: webdriverDashManagerLib.builtLibCliLoggerMod.WriteTo): scala.Unit = js.native
  def setWrite(writeTo: webdriverDashManagerLib.builtLibCliLoggerMod.WriteTo, opt_logFile: java.lang.String): scala.Unit = js.native
  /**
    * Get a timestamp formatted with [hh:mm:ss]
    * @param writeTo The enum for where to write the logs.
    * @return The string of the formatted timestamp
    */
  def `timestamp_`(writeTo: webdriverDashManagerLib.builtLibCliLoggerMod.WriteTo): java.lang.String = js.native
}

