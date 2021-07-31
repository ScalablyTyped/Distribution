package typings.wixUiCore.protractorMod

import typings.seleniumWebdriver.loggingMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logging {
  
  @JSImport("wix-ui-core/dist/src/protractor", "logging")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src/protractor", "logging.Entry")
  @js.native
  class Entry protected ()
    extends typings.seleniumWebdriver.mod.logging.Entry {
    def this(level: String, message: String) = this()
    def this(level: Double, message: String) = this()
    /**
      * @param {(!logging.Level|string)} level The entry level.
      * @param {string} message The log message.
      * @param {number=} opt_timestamp The time this entry was generated, in
      *     milliseconds since 0:00:00, January 1, 1970 UTC. If omitted, the
      *     current time will be used.
      * @param {string=} opt_type The log type, if known.
      * @constructor
      */
    def this(level: typings.seleniumWebdriver.loggingMod.Level, message: String) = this()
    def this(level: String, message: String, opt_timestamp: Double) = this()
    def this(level: Double, message: String, opt_timestamp: Double) = this()
    def this(level: typings.seleniumWebdriver.loggingMod.Level, message: String, opt_timestamp: Double) = this()
    def this(level: String, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: String, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(level: String, message: String, opt_timestamp: Unit, opt_type: String) = this()
    def this(level: String, message: String, opt_timestamp: Unit, opt_type: IType) = this()
    def this(level: Double, message: String, opt_timestamp: Double, opt_type: String) = this()
    def this(level: Double, message: String, opt_timestamp: Double, opt_type: IType) = this()
    def this(level: Double, message: String, opt_timestamp: Unit, opt_type: String) = this()
    def this(level: Double, message: String, opt_timestamp: Unit, opt_type: IType) = this()
    def this(
      level: typings.seleniumWebdriver.loggingMod.Level,
      message: String,
      opt_timestamp: Double,
      opt_type: String
    ) = this()
    def this(
      level: typings.seleniumWebdriver.loggingMod.Level,
      message: String,
      opt_timestamp: Double,
      opt_type: IType
    ) = this()
    def this(
      level: typings.seleniumWebdriver.loggingMod.Level,
      message: String,
      opt_timestamp: Unit,
      opt_type: String
    ) = this()
    def this(
      level: typings.seleniumWebdriver.loggingMod.Level,
      message: String,
      opt_timestamp: Unit,
      opt_type: IType
    ) = this()
  }
  
  @JSImport("wix-ui-core/dist/src/protractor", "logging.Level")
  @js.native
  class Level protected ()
    extends typings.seleniumWebdriver.mod.logging.Level {
    /**
      * @param {string} name the level's name.
      * @param {number} level the level's numeric value.
      */
    def this(name: String, level: Double) = this()
  }
  /* static members */
  object Level {
    
    @JSImport("wix-ui-core/dist/src/protractor", "logging.Level")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Indicates all log messages should be recorded.
      * @const
      */
    @JSImport("wix-ui-core/dist/src/protractor", "logging.Level.ALL")
    @js.native
    def ALL: typings.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def ALL_=(x: typings.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `700` or higher.
      * @const
      */
    @JSImport("wix-ui-core/dist/src/protractor", "logging.Level.DEBUG")
    @js.native
    def DEBUG: typings.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def DEBUG_=(x: typings.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `500` or higher.
      * @const
      */
    @JSImport("wix-ui-core/dist/src/protractor", "logging.Level.FINE")
    @js.native
    def FINE: typings.seleniumWebdriver.loggingMod.Level = js.native
    
    /**
      * Log messages with a level of `400` or higher.
      * @const
      */
    @JSImport("wix-ui-core/dist/src/protractor", "logging.Level.FINER")
    @js.native
    def FINER: typings.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def FINER_=(x: typings.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINER")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `300` or higher.
      * @const
      */
    @JSImport("wix-ui-core/dist/src/protractor", "logging.Level.FINEST")
    @js.native
    def FINEST: typings.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def FINEST_=(x: typings.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINEST")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def FINE_=(x: typings.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FINE")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `800` or higher.
      * @const
      */
    @JSImport("wix-ui-core/dist/src/protractor", "logging.Level.INFO")
    @js.native
    def INFO: typings.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def INFO_=(x: typings.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    /**
      * Indicates no log messages should be recorded.
      * @const
      */
    @JSImport("wix-ui-core/dist/src/protractor", "logging.Level.OFF")
    @js.native
    def OFF: typings.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def OFF_=(x: typings.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFF")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `1000` or higher.
      * @const
      */
    @JSImport("wix-ui-core/dist/src/protractor", "logging.Level.SEVERE")
    @js.native
    def SEVERE: typings.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def SEVERE_=(x: typings.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEVERE")(x.asInstanceOf[js.Any])
    
    /**
      * Log messages with a level of `900` or higher.
      * @const
      */
    @JSImport("wix-ui-core/dist/src/protractor", "logging.Level.WARNING")
    @js.native
    def WARNING: typings.seleniumWebdriver.loggingMod.Level = js.native
    @scala.inline
    def WARNING_=(x: typings.seleniumWebdriver.loggingMod.Level): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/src/protractor", "logging.LogManager")
  @js.native
  class LogManager ()
    extends typings.seleniumWebdriver.mod.logging.LogManager
  
  @JSImport("wix-ui-core/dist/src/protractor", "logging.Logger")
  @js.native
  class Logger protected ()
    extends typings.seleniumWebdriver.mod.logging.Logger {
    /**
      * @param {string} name the name of this logger.
      * @param {Level=} opt_level the initial level for this logger.
      */
    def this(name: String) = this()
    def this(name: String, opt_level: typings.seleniumWebdriver.loggingMod.Level) = this()
  }
  
  @JSImport("wix-ui-core/dist/src/protractor", "logging.Preferences")
  @js.native
  class Preferences ()
    extends typings.seleniumWebdriver.mod.logging.Preferences
  
  @JSImport("wix-ui-core/dist/src/protractor", "logging.Type")
  @js.native
  val Type: IType = js.native
  
  @scala.inline
  def addConsoleHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addConsoleHandler")().asInstanceOf[Unit]
  @scala.inline
  def addConsoleHandler(opt_logger: typings.seleniumWebdriver.loggingMod.Logger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addConsoleHandler")(opt_logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getLevel(nameOrValue: String): typings.seleniumWebdriver.loggingMod.Level = ^.asInstanceOf[js.Dynamic].applyDynamic("getLevel")(nameOrValue.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.loggingMod.Level]
  @scala.inline
  def getLevel(nameOrValue: Double): typings.seleniumWebdriver.loggingMod.Level = ^.asInstanceOf[js.Dynamic].applyDynamic("getLevel")(nameOrValue.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.loggingMod.Level]
  
  @scala.inline
  def getLogger(): typings.seleniumWebdriver.loggingMod.Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[typings.seleniumWebdriver.loggingMod.Logger]
  @scala.inline
  def getLogger(name: String): typings.seleniumWebdriver.loggingMod.Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(name.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.loggingMod.Logger]
  
  @scala.inline
  def installConsoleHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installConsoleHandler")().asInstanceOf[Unit]
  
  @scala.inline
  def removeConsoleHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeConsoleHandler")().asInstanceOf[Unit]
  @scala.inline
  def removeConsoleHandler(opt_logger: typings.seleniumWebdriver.loggingMod.Logger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeConsoleHandler")(opt_logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
