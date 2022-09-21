package typings.unifiedEngine

import typings.unifiedEngine.configurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSetPipelineConfigureMod {
  
  @JSImport("unified-engine/lib/file-set-pipeline/configure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configure(context: Context, settings: Settings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(context.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Context extends StObject {
    
    var configuration: js.UndefOr[Configuration] = js.undefined
  }
  object Context {
    
    inline def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setConfiguration(value: Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    }
  }
  
  type Settings = typings.unifiedEngine.fileSetPipelineMod.Settings
}
