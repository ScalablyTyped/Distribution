package typings.systemLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("system-logger", "Logger")
  @js.native
  class Logger () extends StObject {
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
    
    def log(level: String, message: String): Unit = js.native
    def log(level: String, message: String, optional: js.Any): Unit = js.native
    def log(level: level, message: String): Unit = js.native
    def log(level: level, message: String, optional: js.Any): Unit = js.native
  }
  
  @js.native
  sealed trait fileRotateType extends StObject
  @JSImport("system-logger", "fileRotateType")
  @js.native
  object fileRotateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[fileRotateType & Double] = js.native
    
    @js.native
    sealed trait daily
      extends StObject
         with fileRotateType
    /* 2 */ val daily: typings.systemLogger.mod.fileRotateType.daily & Double = js.native
    
    @js.native
    sealed trait hourly
      extends StObject
         with fileRotateType
    /* 3 */ val hourly: typings.systemLogger.mod.fileRotateType.hourly & Double = js.native
    
    @js.native
    sealed trait minutely
      extends StObject
         with fileRotateType
    /* 4 */ val minutely: typings.systemLogger.mod.fileRotateType.minutely & Double = js.native
    
    @js.native
    sealed trait monthly
      extends StObject
         with fileRotateType
    /* 0 */ val monthly: typings.systemLogger.mod.fileRotateType.monthly & Double = js.native
    
    @js.native
    sealed trait weekly
      extends StObject
         with fileRotateType
    /* 1 */ val weekly: typings.systemLogger.mod.fileRotateType.weekly & Double = js.native
  }
  
  @js.native
  sealed trait level extends StObject
  @JSImport("system-logger", "level")
  @js.native
  object level extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[level & Double] = js.native
    
    @js.native
    sealed trait debug
      extends StObject
         with level
    /* 4 */ val debug: typings.systemLogger.mod.level.debug & Double = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with level
    /* 0 */ val error: typings.systemLogger.mod.level.error & Double = js.native
    
    @js.native
    sealed trait info
      extends StObject
         with level
    /* 2 */ val info: typings.systemLogger.mod.level.info & Double = js.native
    
    @js.native
    sealed trait silly
      extends StObject
         with level
    /* 5 */ val silly: typings.systemLogger.mod.level.silly & Double = js.native
    
    @js.native
    sealed trait verbose
      extends StObject
         with level
    /* 3 */ val verbose: typings.systemLogger.mod.level.verbose & Double = js.native
    
    @js.native
    sealed trait warn
      extends StObject
         with level
    /* 1 */ val warn: typings.systemLogger.mod.level.warn & Double = js.native
  }
  
  trait FileConfiguration extends StObject {
    
    var fileRotateMaxSize: js.UndefOr[Double] = js.undefined
    
    var fileRotateType: js.UndefOr[typings.systemLogger.mod.fileRotateType] = js.undefined
    
    var isFileRotate: js.UndefOr[Boolean] = js.undefined
    
    var saveToFileName: js.UndefOr[String] = js.undefined
  }
  object FileConfiguration {
    
    @scala.inline
    def apply(): FileConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileConfiguration]
    }
    
    @scala.inline
    implicit class FileConfigurationMutableBuilder[Self <: FileConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileRotateMaxSize(value: Double): Self = StObject.set(x, "fileRotateMaxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileRotateMaxSizeUndefined: Self = StObject.set(x, "fileRotateMaxSize", js.undefined)
      
      @scala.inline
      def setFileRotateType(value: fileRotateType): Self = StObject.set(x, "fileRotateType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileRotateTypeUndefined: Self = StObject.set(x, "fileRotateType", js.undefined)
      
      @scala.inline
      def setIsFileRotate(value: Boolean): Self = StObject.set(x, "isFileRotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFileRotateUndefined: Self = StObject.set(x, "isFileRotate", js.undefined)
      
      @scala.inline
      def setSaveToFileName(value: String): Self = StObject.set(x, "saveToFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveToFileNameUndefined: Self = StObject.set(x, "saveToFileName", js.undefined)
    }
  }
  
  trait LoggerConfiguration extends StObject {
    
    var externalDisplayFormat: js.UndefOr[js.Any] = js.undefined
    
    var level: typings.systemLogger.mod.level
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object LoggerConfiguration {
    
    @scala.inline
    def apply(level: level): LoggerConfiguration = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerConfiguration]
    }
    
    @scala.inline
    implicit class LoggerConfigurationMutableBuilder[Self <: LoggerConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExternalDisplayFormat(value: js.Any): Self = StObject.set(x, "externalDisplayFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalDisplayFormatUndefined: Self = StObject.set(x, "externalDisplayFormat", js.undefined)
      
      @scala.inline
      def setLevel(value: level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait SourcesConfiguration extends StObject {
    
    var callback: js.Any
    
    var connector: js.Any
    
    var levels: js.Array[level]
  }
  object SourcesConfiguration {
    
    @scala.inline
    def apply(callback: js.Any, connector: js.Any, levels: js.Array[level]): SourcesConfiguration = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourcesConfiguration]
    }
    
    @scala.inline
    implicit class SourcesConfigurationMutableBuilder[Self <: SourcesConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnector(value: js.Any): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevels(value: js.Array[level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelsVarargs(value: level*): Self = StObject.set(x, "levels", js.Array(value :_*))
    }
  }
}
