package typings.webdriverManager

import typings.webdriverManager.loggerMod.LogLevel
import typings.webdriverManager.loggerMod.WriteTo
import typings.webdriverManager.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliMod {
  
  @JSImport("webdriver-manager/built/lib/cli", "Cli")
  @js.native
  class Cli ()
    extends typings.webdriverManager.cliCliMod.Cli
  
  @JSImport("webdriver-manager/built/lib/cli", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.webdriverManager.loggerMod.LogLevel with Double] = js.native
    
    /* 3 */ val DEBUG: typings.webdriverManager.loggerMod.LogLevel.DEBUG with Double = js.native
    
    /* 0 */ val ERROR: typings.webdriverManager.loggerMod.LogLevel.ERROR with Double = js.native
    
    /* 2 */ val INFO: typings.webdriverManager.loggerMod.LogLevel.INFO with Double = js.native
    
    /* 1 */ val WARN: typings.webdriverManager.loggerMod.LogLevel.WARN with Double = js.native
  }
  
  @JSImport("webdriver-manager/built/lib/cli", "Logger")
  @js.native
  class Logger protected ()
    extends typings.webdriverManager.loggerMod.Logger {
    /**
      * Creates a logger instance with an ID for the logger.
      * @constructor
      */
    def this(id: String) = this()
  }
  /* static members */
  object Logger {
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger.fd")
    @js.native
    def fd: js.Any = js.native
    @scala.inline
    def fd_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fd")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger.firstWrite")
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
    @JSImport("webdriver-manager/built/lib/cli", "Logger.id_")
    @js.native
    def id_(logLevel: LogLevel, id: String, writeTo: WriteTo): String = js.native
    
    /**
      * Get the log level formatted with the first letter. For info, it is I.
      * @param logLevel The log level of the message.
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted log level
      */
    @JSImport("webdriver-manager/built/lib/cli", "Logger.level_")
    @js.native
    def level_(logLevel: LogLevel, id: String, writeTo: WriteTo): String = js.native
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger.logLevel")
    @js.native
    def logLevel: LogLevel = js.native
    @scala.inline
    def logLevel_=(x: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(x.asInstanceOf[js.Any])
    
    /**
      * Convert the list of messages to a single string message.
      * @param msgs The list of messages.
      * @return The string of the formatted messages
      */
    @JSImport("webdriver-manager/built/lib/cli", "Logger.msgToFile_")
    @js.native
    def msgToFile_(msgs: js.Array[_]): String = js.native
    
    /**
      * Set up the write location. If writing to a file, get the file descriptor.
      * @param writeTo The enum for where to write the logs.
      * @param opt_logFile An optional parameter to override the log file location.
      */
    @JSImport("webdriver-manager/built/lib/cli", "Logger.setWrite")
    @js.native
    def setWrite(writeTo: WriteTo): Unit = js.native
    @JSImport("webdriver-manager/built/lib/cli", "Logger.setWrite")
    @js.native
    def setWrite(writeTo: WriteTo, opt_logFile: String): Unit = js.native
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger.showId")
    @js.native
    def showId: Boolean = js.native
    @scala.inline
    def showId_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showId")(x.asInstanceOf[js.Any])
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger.showTimestamp")
    @js.native
    def showTimestamp: Boolean = js.native
    @scala.inline
    def showTimestamp_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTimestamp")(x.asInstanceOf[js.Any])
    
    /**
      * Get a timestamp formatted with [hh:mm:ss]
      * @param writeTo The enum for where to write the logs.
      * @return The string of the formatted timestamp
      */
    @JSImport("webdriver-manager/built/lib/cli", "Logger.timestamp_")
    @js.native
    def timestamp_(writeTo: WriteTo): String = js.native
    
    @JSImport("webdriver-manager/built/lib/cli", "Logger.writeTo")
    @js.native
    def writeTo: WriteTo = js.native
    @scala.inline
    def writeTo_=(x: WriteTo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeTo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webdriver-manager/built/lib/cli", "Option")
  @js.native
  class Option protected ()
    extends typings.webdriverManager.optionsMod.Option {
    def this(opt: String, description: String, `type`: String) = this()
    def this(opt: String, description: String, `type`: String, defaultValue: String) = this()
    def this(opt: String, description: String, `type`: String, defaultValue: Boolean) = this()
    def this(opt: String, description: String, `type`: String, defaultValue: Double) = this()
  }
  
  @JSImport("webdriver-manager/built/lib/cli", "Program")
  @js.native
  class Program ()
    extends typings.webdriverManager.programsMod.Program
  /* static members */
  object Program {
    
    @JSImport("webdriver-manager/built/lib/cli", "Program")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webdriver-manager/built/lib/cli", "Program.MIN_SPACING")
    @js.native
    def MIN_SPACING: Double = js.native
    @scala.inline
    def MIN_SPACING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SPACING")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("webdriver-manager/built/lib/cli", "WriteTo")
  @js.native
  object WriteTo extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.webdriverManager.loggerMod.WriteTo with Double] = js.native
    
    /* 2 */ val BOTH: typings.webdriverManager.loggerMod.WriteTo.BOTH with Double = js.native
    
    /* 0 */ val CONSOLE: typings.webdriverManager.loggerMod.WriteTo.CONSOLE with Double = js.native
    
    /* 1 */ val FILE: typings.webdriverManager.loggerMod.WriteTo.FILE with Double = js.native
    
    /* 3 */ val NONE: typings.webdriverManager.loggerMod.WriteTo.NONE with Double = js.native
  }
  
  @JSImport("webdriver-manager/built/lib/cli", "unparseOptions")
  @js.native
  def unparseOptions(options: Options): js.Array[String] = js.native
}
