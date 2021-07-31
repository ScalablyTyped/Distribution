package typings.tsLoader

import typings.chalk.mod.Chalk
import typings.tsLoader.anon.Typeoftypescript
import typings.tsLoader.interfacesMod.LoaderOptions
import typings.tsLoader.loggerMod.Logger
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("ts-loader/dist/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getConfigFile(
    compiler: Typeoftypescript,
    colors: Chalk,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    loaderOptions: LoaderOptions,
    compilerCompatible: Boolean,
    log: Logger,
    compilerDetailsLogMessage: String
  ): typings.tsLoader.anon.ConfigFile = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfigFile")(compiler.asInstanceOf[js.Any], colors.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any], compilerCompatible.asInstanceOf[js.Any], log.asInstanceOf[js.Any], compilerDetailsLogMessage.asInstanceOf[js.Any])).asInstanceOf[typings.tsLoader.anon.ConfigFile]
  
  @scala.inline
  def getConfigParseResult(
    compiler: Typeoftypescript,
    configFile: ConfigFile,
    basePath: String,
    configFilePath: String,
    enableProjectReferences: Boolean
  ): ParsedCommandLine = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfigParseResult")(compiler.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], configFilePath.asInstanceOf[js.Any], enableProjectReferences.asInstanceOf[js.Any])).asInstanceOf[ParsedCommandLine]
  @scala.inline
  def getConfigParseResult(
    compiler: Typeoftypescript,
    configFile: ConfigFile,
    basePath: String,
    configFilePath: Unit,
    enableProjectReferences: Boolean
  ): ParsedCommandLine = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfigParseResult")(compiler.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], configFilePath.asInstanceOf[js.Any], enableProjectReferences.asInstanceOf[js.Any])).asInstanceOf[ParsedCommandLine]
  
  @scala.inline
  def getParsedCommandLine(compiler: Typeoftypescript, loaderOptions: LoaderOptions, configFilePath: String): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLine")(compiler.asInstanceOf[js.Any], loaderOptions.asInstanceOf[js.Any], configFilePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
  
  trait ConfigFile extends StObject {
    
    var config: js.UndefOr[js.Any] = js.undefined
    
    var error: js.UndefOr[Diagnostic] = js.undefined
  }
  object ConfigFile {
    
    @scala.inline
    def apply(): ConfigFile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigFile]
    }
    
    @scala.inline
    implicit class ConfigFileMutableBuilder[Self <: ConfigFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setError(value: Diagnostic): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
}
