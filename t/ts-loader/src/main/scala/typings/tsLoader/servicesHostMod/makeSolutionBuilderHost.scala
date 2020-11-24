package typings.tsLoader.servicesHostMod

import typings.std.RegExp
import typings.tsLoader.interfacesMod.SolutionBuilderWithWatchHost
import typings.tsLoader.interfacesMod.TSInstance
import typings.tsLoader.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/servicesHost", "makeSolutionBuilderHost")
@js.native
object makeSolutionBuilderHost extends js.Object {
  
  def apply(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance
  ): SolutionBuilderWithWatchHost = js.native
}
