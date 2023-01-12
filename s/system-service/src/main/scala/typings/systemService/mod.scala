package typings.systemService

import typings.systemLogger.mod.FileConfiguration
import typings.systemLogger.mod.LoggerConfiguration
import typings.systemLogger.mod.SourcesConfiguration
import typings.systemLogger.mod.fileRotateType
import typings.systemLogger.mod.level
import typings.systemService.anon.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("system-service", "FileRotateType")
  @js.native
  object FileRotateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[fileRotateType & Double] = js.native
    
    /* 2 */ val daily: typings.systemLogger.mod.fileRotateType.daily & Double = js.native
    
    /* 3 */ val hourly: typings.systemLogger.mod.fileRotateType.hourly & Double = js.native
    
    /* 4 */ val minutely: typings.systemLogger.mod.fileRotateType.minutely & Double = js.native
    
    /* 0 */ val monthly: typings.systemLogger.mod.fileRotateType.monthly & Double = js.native
    
    /* 1 */ val weekly: typings.systemLogger.mod.fileRotateType.weekly & Double = js.native
  }
  
  @JSImport("system-service", "Level")
  @js.native
  object Level extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[level & Double] = js.native
    
    /* 4 */ val debug: typings.systemLogger.mod.level.debug & Double = js.native
    
    /* 0 */ val error: typings.systemLogger.mod.level.error & Double = js.native
    
    /* 2 */ val info: typings.systemLogger.mod.level.info & Double = js.native
    
    /* 5 */ val silly: typings.systemLogger.mod.level.silly & Double = js.native
    
    /* 3 */ val verbose: typings.systemLogger.mod.level.verbose & Double = js.native
    
    /* 1 */ val warn: typings.systemLogger.mod.level.warn & Double = js.native
  }
  
  @JSImport("system-service", "Logger")
  @js.native
  open class Logger ()
    extends typings.systemLogger.mod.Logger {
    def this(configuration: LoggerConfiguration) = this()
    def this(configuration: Unit, fileConfig: FileConfiguration) = this()
    def this(configuration: LoggerConfiguration, fileConfig: FileConfiguration) = this()
    def this(configuration: Unit, fileConfig: Unit, sourceConfig: SourcesConfiguration) = this()
    def this(configuration: Unit, fileConfig: FileConfiguration, sourceConfig: SourcesConfiguration) = this()
    def this(configuration: LoggerConfiguration, fileConfig: Unit, sourceConfig: SourcesConfiguration) = this()
    def this(
      configuration: LoggerConfiguration,
      fileConfig: FileConfiguration,
      sourceConfig: SourcesConfiguration
    ) = this()
  }
  
  @JSImport("system-service", "MessageConsumer")
  @js.native
  open class MessageConsumer () extends StObject {
    
    def cleanup(): Unit = js.native
    
    def create(): Unit = js.native
    
    var logger: typings.systemLogger.mod.Logger = js.native
    
    def process(message: Any): Unit = js.native
    
    def service(): Unit = js.native
    
    def setup(systemService: SystemService): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def validate(message: Any): Unit = js.native
  }
  
  @JSImport("system-service", "SystemService")
  @js.native
  open class SystemService () extends StObject {
    def this(config: ServiceConfiguration) = this()
    def this(config: Unit, messageConsumer: MessageConsumer) = this()
    def this(config: ServiceConfiguration, messageConsumer: MessageConsumer) = this()
    
    var config: ServiceConfiguration = js.native
    
    var logger: typings.systemLogger.mod.Logger = js.native
    
    var messageConsumer: MessageConsumer = js.native
    
    def processMessage(message: Any): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def validateMessage(message: Any): Unit = js.native
  }
  
  trait ServiceConfiguration extends StObject {
    
    var log: Config
  }
  object ServiceConfiguration {
    
    inline def apply(log: Config): ServiceConfiguration = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceConfiguration] (val x: Self) extends AnyVal {
      
      inline def setLog(value: Config): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
}
