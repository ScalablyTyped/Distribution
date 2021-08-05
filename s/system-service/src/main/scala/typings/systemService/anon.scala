package typings.systemService

import typings.systemLogger.mod.FileConfiguration
import typings.systemLogger.mod.LoggerConfiguration
import typings.systemLogger.mod.SourcesConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var source: js.UndefOr[SourcesConfiguration] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setSource(value: SourcesConfiguration): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    var config: LoggerConfiguration
    
    var file: js.UndefOr[Source] = js.undefined
    
    var source: js.UndefOr[`0`] = js.undefined
  }
  object Config {
    
    inline def apply(config: LoggerConfiguration): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: LoggerConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setFile(value: Source): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setSource(value: `0`): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait Source extends StObject {
    
    var source: js.UndefOr[FileConfiguration] = js.undefined
  }
  object Source {
    
    inline def apply(): Source = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setSource(value: FileConfiguration): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
