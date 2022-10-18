package typings.tsLoader

import typings.tsLoader.distInterfacesMod.FilePathKey
import typings.tsLoader.distInterfacesMod.LoaderOptions
import typings.tsLoader.distInterfacesMod.ServiceHostWhichMayBeCacheable
import typings.tsLoader.distInterfacesMod.SolutionBuilderWithWatchHost
import typings.tsLoader.distInterfacesMod.TSInstance
import typings.tsLoader.distInterfacesMod.WatchHost
import typings.typescript.mod.ProjectReference
import typings.webpack.mod.LoaderContext
import typings.webpack.mod.WebpackError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesHostMod {
  
  @JSImport("ts-loader/dist/servicesHost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSolutionErrors(instance: TSInstance, context: String): js.Array[WebpackError] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSolutionErrors")(instance.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[WebpackError]]
  
  inline def makeServicesHost(scriptRegex: js.RegExp, loader: LoaderContext[LoaderOptions], instance: TSInstance): ServiceHostWhichMayBeCacheable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeServicesHost")(scriptRegex.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[ServiceHostWhichMayBeCacheable]
  inline def makeServicesHost(
    scriptRegex: js.RegExp,
    loader: LoaderContext[LoaderOptions],
    instance: TSInstance,
    projectReferences: js.Array[ProjectReference]
  ): ServiceHostWhichMayBeCacheable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeServicesHost")(scriptRegex.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[ServiceHostWhichMayBeCacheable]
  
  inline def makeSolutionBuilderHost(scriptRegex: js.RegExp, loader: LoaderContext[LoaderOptions], instance: TSInstance): SolutionBuilderWithWatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSolutionBuilderHost")(scriptRegex.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost]
  
  inline def makeWatchHost(scriptRegex: js.RegExp, loader: LoaderContext[LoaderOptions], instance: TSInstance): WatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("makeWatchHost")(scriptRegex.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[WatchHost]
  inline def makeWatchHost(
    scriptRegex: js.RegExp,
    loader: LoaderContext[LoaderOptions],
    instance: TSInstance,
    projectReferences: js.Array[ProjectReference]
  ): WatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("makeWatchHost")(scriptRegex.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[WatchHost]
  
  inline def updateFileWithText(
    instance: TSInstance,
    key: FilePathKey,
    filePath: String,
    text: js.Function1[/* nFilePath */ String, String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFileWithText")(instance.asInstanceOf[js.Any], key.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
