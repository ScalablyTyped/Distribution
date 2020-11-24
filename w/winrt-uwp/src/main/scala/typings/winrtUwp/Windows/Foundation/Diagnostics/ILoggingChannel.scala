package typings.winrtUwp.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a source of log messages. */
@js.native
trait ILoggingChannel extends IClosable {
  
  /** Gets a value that indicates whether messages are being logged on the current LoggingChannel . */
  var enabled: Boolean = js.native
  
  /** Gets the level of detail for messages from the current LoggingChannel . */
  var level: LoggingLevel = js.native
  
  /**
    * Logs a message to the current LoggingChannel .
    * @param eventString The message to log.
    */
  def logMessage(eventString: String): Unit = js.native
  /**
    * Logs a message to the current LoggingChannel with the specified LoggingLevel .
    * @param eventString The message to log.
    * @param level The logging level.
    */
  def logMessage(eventString: String, level: LoggingLevel): Unit = js.native
  
  /**
    * Logs data to the current LoggingChannel .
    * @param value1 The string to associate with value2.
    * @param value2 The value to associate with value1.
    */
  def logValuePair(value1: String, value2: Double): Unit = js.native
  /**
    * Logs data to the current LoggingChannel with the specified LoggingLevel .
    * @param value1 The string to associate with value2.
    * @param value2 The value to associate with value1.
    * @param level The logging level.
    */
  def logValuePair(value1: String, value2: Double, level: LoggingLevel): Unit = js.native
  
  /** Gets the name of the current LoggingChannel . */
  var name: String = js.native
}
