package typings.tsLoader.servicesHostMod

import typings.std.RegExp
import typings.tsLoader.interfacesMod.TSInstance
import typings.tsLoader.interfacesMod.WatchHost
import typings.tsLoader.loggerMod.Logger
import typings.typescript.mod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-loader/dist/servicesHost", "makeWatchHost")
@js.native
object makeWatchHost extends js.Object {
  
  def apply(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance
  ): WatchHost = js.native
  def apply(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance,
    projectReferences: js.Array[ProjectReference]
  ): WatchHost = js.native
}
