package typings.webdriverManager

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/cli/logger", JSImport.Namespace)
@js.native
object loggerMod extends js.Object {
  
  @js.native
  sealed trait LogLevel extends js.Object
  @js.native
  object LogLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    
    @js.native
    sealed trait DEBUG extends LogLevel
    /* 3 */ @js.native
    object DEBUG extends TopLevel[DEBUG with Double]
    
    @js.native
    sealed trait ERROR extends LogLevel
    /* 0 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    @js.native
    sealed trait INFO extends LogLevel
    /* 2 */ @js.native
    object INFO extends TopLevel[INFO with Double]
    
    @js.native
    sealed trait WARN extends LogLevel
    /* 1 */ @js.native
    object WARN extends TopLevel[WARN with Double]
  }
  
  @js.native
  class Logger protected () extends js.Object {
    /**
      * Creates a logger instance with an ID for the logger.
      * @constructor
      */
    def this(id: String) = this()
    
    /**
      * Log DEBUG
      * @param ...msgs multiple arguments to be logged.
      */
    def debug(msgs: js.Any*): Unit = js.native
    
    /**
      * Log ERROR
      * @param ...msgs multiple arguments to be logged.
      */
    def error(msgs: js.Any*): Unit = js.native
    
    var id: js.Any = js.native
    
    /**
      * Log INFO
      * @param ...msgs multiple arguments to be logged.
      */
    def info(msgs: js.Any*): Unit = js.native
    
    /**
      * For the log level set, check to see if the messages should be logged.
      * @param logLevel The log level of the message.
      * @param msgs The messages to be logged
      */
    def log_(logLevel: LogLevel, msgs: js.Array[_]): Unit = js.native
    
    /**
      * Format with timestamp, log level, identifier, and message and log to
      * specified medium (console, file, both, none).
      * @param logLevel The log level of the message.
      * @param msgs The messages to be logged.
      */
    def print_(logLevel: LogLevel, msgs: js.Array[_]): Unit = js.native
    
    /**
      * Log WARN
      * @param ...msgs multiple arguments to be logged.
      */
    def warn(msgs: js.Any*): Unit = js.native
  }
  /* static members */
  @js.native
  object Logger extends js.Object {
    
    var fd: js.Any = js.native
    
    var firstWrite: Boolean = js.native
    
    /**
      * Get the identifier of the logger as '/<id>'
      * @param logLevel The log level of the message.
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted id
      */
    def id_(logLevel: LogLevel, id: String, writeTo: WriteTo): String = js.native
    
    /**
      * Get the log level formatted with the first letter. For info, it is I.
      * @param logLevel The log level of the message.
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted log level
      */
    def level_(logLevel: LogLevel, id: String, writeTo: WriteTo): String = js.native
    
    var logLevel: LogLevel = js.native
    
    /**
      * Convert the list of messages to a single string message.
      * @param msgs The list of messages.
      * @return The string of the formatted messages
      */
    def msgToFile_(msgs: js.Array[_]): String = js.native
    
    /**
      * Set up the write location. If writing to a file, get the file descriptor.
      * @param writeTo The enum for where to write the logs.
      * @param opt_logFile An optional parameter to override the log file location.
      */
    def setWrite(writeTo: WriteTo): Unit = js.native
    def setWrite(writeTo: WriteTo, opt_logFile: String): Unit = js.native
    
    var showId: Boolean = js.native
    
    var showTimestamp: Boolean = js.native
    
    /**
      * Get a timestamp formatted with [hh:mm:ss]
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted timestamp
      */
    def timestamp_(writeTo: WriteTo): String = js.native
    
    var writeTo: WriteTo = js.native
  }
  
  @js.native
  sealed trait WriteTo extends js.Object
  @js.native
  object WriteTo extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WriteTo with Double] = js.native
    
    @js.native
    sealed trait BOTH extends WriteTo
    /* 2 */ @js.native
    object BOTH extends TopLevel[BOTH with Double]
    
    @js.native
    sealed trait CONSOLE extends WriteTo
    /* 0 */ @js.native
    object CONSOLE extends TopLevel[CONSOLE with Double]
    
    @js.native
    sealed trait FILE extends WriteTo
    /* 1 */ @js.native
    object FILE extends TopLevel[FILE with Double]
    
    @js.native
    sealed trait NONE extends WriteTo
    /* 3 */ @js.native
    object NONE extends TopLevel[NONE with Double]
  }
}
