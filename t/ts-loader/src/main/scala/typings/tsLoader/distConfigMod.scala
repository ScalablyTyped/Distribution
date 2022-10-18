package typings.tsLoader

import typings.chalk.mod.Chalk
import typings.tsLoader.anon.Typeoftypescript
import typings.tsLoader.distInterfacesMod.LoaderOptions
import typings.tsLoader.distLoggerMod.Logger
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.ParsedCommandLine
import typings.webpack.mod.LoaderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigMod {
  
  @JSImport("ts-loader/dist/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getConfigFile(
    compiler: Typeoftypescript,
    colors: Chalk,
    loader: LoaderContext[LoaderOptions],
    loaderOptions: LoaderOptions,
    compilerCompatible: Boolean,
    log: Logger,
    compilerDetailsLogMessage: String
  ): typings.tsLoader.anon.ConfigFile = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfigFile")(compiler.asInstanceOf[js.Any], colors.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any], compilerCompatible.asInstanceOf[js.Any], log.asInstanceOf[js.Any], compilerDetailsLogMessage.asInstanceOf[js.Any])).asInstanceOf[typings.tsLoader.anon.ConfigFile]
  
  inline def getConfigParseResult(
    compiler: Typeoftypescript,
    configFile: ConfigFile,
    basePath: String,
    configFilePath: String,
    loaderOptions: LoaderOptions
  ): ParsedCommandLine = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfigParseResult")(compiler.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], configFilePath.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any])).asInstanceOf[ParsedCommandLine]
  inline def getConfigParseResult(
    compiler: Typeoftypescript,
    configFile: ConfigFile,
    basePath: String,
    configFilePath: Unit,
    loaderOptions: LoaderOptions
  ): ParsedCommandLine = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfigParseResult")(compiler.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], configFilePath.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any])).asInstanceOf[ParsedCommandLine]
  
  inline def getParsedCommandLine(compiler: Typeoftypescript, loaderOptions: LoaderOptions, configFilePath: String): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLine")(compiler.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any], configFilePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
  
  trait ConfigFile extends StObject {
    
    var config: js.UndefOr[Any] = js.undefined
    
    var error: js.UndefOr[Diagnostic] = js.undefined
  }
  object ConfigFile {
    
    inline def apply(): ConfigFile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigFile]
    }
    
    extension [Self <: ConfigFile](x: Self) {
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setError(value: Diagnostic): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
}
