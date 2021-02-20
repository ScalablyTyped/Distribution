package typings.webdriverManager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("webdriver-manager/built/lib/cli/logger", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
    
    @js.native
    sealed trait DEBUG extends LogLevel
    /* 3 */ val DEBUG: typings.webdriverManager.loggerMod.LogLevel.DEBUG with Double = js.native
    
    @js.native
    sealed trait ERROR extends LogLevel
    /* 0 */ val ERROR: typings.webdriverManager.loggerMod.LogLevel.ERROR with Double = js.native
    
    @js.native
    sealed trait INFO extends LogLevel
    /* 2 */ val INFO: typings.webdriverManager.loggerMod.LogLevel.INFO with Double = js.native
    
    @js.native
    sealed trait WARN extends LogLevel
    /* 1 */ val WARN: typings.webdriverManager.loggerMod.LogLevel.WARN with Double = js.native
  }
  
  @JSImport("webdriver-manager/built/lib/cli/logger", "Logger")
  @js.native
  class Logger protected () extends StObject {
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
  object Logger {
    
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger.fd")
    @js.native
    def fd: js.Any = js.native
    @scala.inline
    def fd_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fd")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger.firstWrite")
    @js.native
    def firstWrite: Boolean = js.native
    @scala.inline
    def firstWrite_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("firstWrite")(x.asInstanceOf[js.Any])
    
    /**
      * Get the identifier of the logger as '/<id>'
      * @param logLevel The log level of the message.
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted id
      */
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger.id_")
    @js.native
    def id_(logLevel: LogLevel, id: String, writeTo: WriteTo): String = js.native
    
    /**
      * Get the log level formatted with the first letter. For info, it is I.
      * @param logLevel The log level of the message.
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted log level
      */
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger.level_")
    @js.native
    def level_(logLevel: LogLevel, id: String, writeTo: WriteTo): String = js.native
    
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger.logLevel")
    @js.native
    def logLevel: LogLevel = js.native
    @scala.inline
    def logLevel_=(x: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(x.asInstanceOf[js.Any])
    
    /**
      * Convert the list of messages to a single string message.
      * @param msgs The list of messages.
      * @return The string of the formatted messages
      */
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger.msgToFile_")
    @js.native
    def msgToFile_(msgs: js.Array[_]): String = js.native
    
    /**
      * Set up the write location. If writing to a file, get the file descriptor.
      * @param writeTo The enum for where to write the logs.
      * @param opt_logFile An optional parameter to override the log file location.
      */
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger.setWrite")
    @js.native
    def setWrite(writeTo: WriteTo): Unit = js.native
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger.setWrite")
    @js.native
    def setWrite(writeTo: WriteTo, opt_logFile: String): Unit = js.native
    
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger.showId")
    @js.native
    def showId: Boolean = js.native
    @scala.inline
    def showId_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showId")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger.showTimestamp")
    @js.native
    def showTimestamp: Boolean = js.native
    @scala.inline
    def showTimestamp_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTimestamp")(x.asInstanceOf[js.Any])
    
    /**
      * Get a timestamp formatted with [hh:mm:ss]
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted timestamp
      */
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger.timestamp_")
    @js.native
    def timestamp_(writeTo: WriteTo): String = js.native
    
    @JSImport("webdriver-manager/built/lib/cli/logger", "Logger.writeTo")
    @js.native
    def writeTo: WriteTo = js.native
    @scala.inline
    def writeTo_=(x: WriteTo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeTo")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait WriteTo extends StObject
  @JSImport("webdriver-manager/built/lib/cli/logger", "WriteTo")
  @js.native
  object WriteTo extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WriteTo with Double] = js.native
    
    @js.native
    sealed trait BOTH extends WriteTo
    /* 2 */ val BOTH: typings.webdriverManager.loggerMod.WriteTo.BOTH with Double = js.native
    
    @js.native
    sealed trait CONSOLE extends WriteTo
    /* 0 */ val CONSOLE: typings.webdriverManager.loggerMod.WriteTo.CONSOLE with Double = js.native
    
    @js.native
    sealed trait FILE extends WriteTo
    /* 1 */ val FILE: typings.webdriverManager.loggerMod.WriteTo.FILE with Double = js.native
    
    @js.native
    sealed trait NONE extends WriteTo
    /* 3 */ val NONE: typings.webdriverManager.loggerMod.WriteTo.NONE with Double = js.native
  }
}
