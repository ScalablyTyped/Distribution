package typings.tsLoader.configMod

import typings.chalk.mod.Chalk
import typings.tsLoader.anon.Typeoftypescript
import typings.tsLoader.interfacesMod.LoaderOptions
import typings.tsLoader.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/config", "getConfigFile")
@js.native
object getConfigFile extends js.Object {
  
  def apply(
    compiler: Typeoftypescript,
    colors: Chalk,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    loaderOptions: LoaderOptions,
    compilerCompatible: Boolean,
    log: Logger,
    compilerDetailsLogMessage: String
  ): typings.tsLoader.anon.ConfigFile = js.native
}
