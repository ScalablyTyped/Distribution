package typings.tsconfigPathsWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("tsconfig-paths-webpack-plugin/lib/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOptions(rawOptions: js.Object): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(rawOptions.asInstanceOf[js.Any]).asInstanceOf[Options]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsconfigPathsWebpackPlugin.tsconfigPathsWebpackPluginStrings.INFO
    - typings.tsconfigPathsWebpackPlugin.tsconfigPathsWebpackPluginStrings.WARN
    - typings.tsconfigPathsWebpackPlugin.tsconfigPathsWebpackPluginStrings.ERROR
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def ERROR: typings.tsconfigPathsWebpackPlugin.tsconfigPathsWebpackPluginStrings.ERROR = "ERROR".asInstanceOf[typings.tsconfigPathsWebpackPlugin.tsconfigPathsWebpackPluginStrings.ERROR]
    
    inline def INFO: typings.tsconfigPathsWebpackPlugin.tsconfigPathsWebpackPluginStrings.INFO = "INFO".asInstanceOf[typings.tsconfigPathsWebpackPlugin.tsconfigPathsWebpackPluginStrings.INFO]
    
    inline def WARN: typings.tsconfigPathsWebpackPlugin.tsconfigPathsWebpackPluginStrings.WARN = "WARN".asInstanceOf[typings.tsconfigPathsWebpackPlugin.tsconfigPathsWebpackPluginStrings.WARN]
  }
  
  trait Options extends StObject {
    
    val baseUrl: js.UndefOr[String] = js.undefined
    
    val colors: Boolean
    
    val configFile: String
    
    val context: js.UndefOr[String] = js.undefined
    
    val extensions: js.Array[String]
    
    val logInfoToStdOut: Boolean
    
    val logLevel: LogLevel
    
    val mainFields: js.Array[String]
    
    val silent: Boolean
  }
  object Options {
    
    inline def apply(
      colors: Boolean,
      configFile: String,
      extensions: js.Array[String],
      logInfoToStdOut: Boolean,
      logLevel: LogLevel,
      mainFields: js.Array[String],
      silent: Boolean
    ): Options = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], logInfoToStdOut = logInfoToStdOut.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], mainFields = mainFields.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setLogInfoToStdOut(value: Boolean): Self = StObject.set(x, "logInfoToStdOut", value.asInstanceOf[js.Any])
      
      inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      inline def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value*))
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    }
  }
}
