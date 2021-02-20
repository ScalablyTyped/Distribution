package typings.tsLoader

import typings.chalk.mod.Chalk
import typings.tsLoader.anon.Typeoftypescript
import typings.tsLoader.interfacesMod.LoaderOptions
import typings.tsLoader.loggerMod.Logger
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("ts-loader/dist/config", "getConfigFile")
  @js.native
  def getConfigFile(
    compiler: Typeoftypescript,
    colors: Chalk,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    loaderOptions: LoaderOptions,
    compilerCompatible: Boolean,
    log: Logger,
    compilerDetailsLogMessage: String
  ): typings.tsLoader.anon.ConfigFile = js.native
  
  @JSImport("ts-loader/dist/config", "getConfigParseResult")
  @js.native
  def getConfigParseResult(
    compiler: Typeoftypescript,
    configFile: ConfigFile,
    basePath: String,
    configFilePath: js.UndefOr[scala.Nothing],
    enableProjectReferences: Boolean
  ): ParsedCommandLine = js.native
  @JSImport("ts-loader/dist/config", "getConfigParseResult")
  @js.native
  def getConfigParseResult(
    compiler: Typeoftypescript,
    configFile: ConfigFile,
    basePath: String,
    configFilePath: String,
    enableProjectReferences: Boolean
  ): ParsedCommandLine = js.native
  
  @JSImport("ts-loader/dist/config", "getParsedCommandLine")
  @js.native
  def getParsedCommandLine(compiler: Typeoftypescript, loaderOptions: LoaderOptions, configFilePath: String): js.UndefOr[ParsedCommandLine] = js.native
  
  @js.native
  trait ConfigFile extends StObject {
    
    var config: js.UndefOr[js.Any] = js.native
    
    var error: js.UndefOr[Diagnostic] = js.native
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
