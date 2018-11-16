package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a source of log messages. */
@js.native
trait ILoggingChannel
  extends winrtDashUwpLib.WindowsNs.FoundationNs.IClosable {
  /** Gets a value that indicates whether messages are being logged on the current LoggingChannel . */
  var enabled: scala.Boolean = js.native
  /** Gets the level of detail for messages from the current LoggingChannel . */
  var level: LoggingLevel = js.native
  /** Gets the name of the current LoggingChannel . */
  var name: java.lang.String = js.native
  /**
                   * Logs a message to the current LoggingChannel .
                   * @param eventString The message to log.
                   */
  def logMessage(eventString: java.lang.String): scala.Unit = js.native
  /**
                   * Logs a message to the current LoggingChannel with the specified LoggingLevel .
                   * @param eventString The message to log.
                   * @param level The logging level.
                   */
  def logMessage(eventString: java.lang.String, level: LoggingLevel): scala.Unit = js.native
  /**
                   * Logs data to the current LoggingChannel .
                   * @param value1 The string to associate with value2.
                   * @param value2 The value to associate with value1.
                   */
  def logValuePair(value1: java.lang.String, value2: scala.Double): scala.Unit = js.native
  /**
                   * Logs data to the current LoggingChannel with the specified LoggingLevel .
                   * @param value1 The string to associate with value2.
                   * @param value2 The value to associate with value1.
                   * @param level The logging level.
                   */
  def logValuePair(value1: java.lang.String, value2: scala.Double, level: LoggingLevel): scala.Unit = js.native
}

