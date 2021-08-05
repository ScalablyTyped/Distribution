package typings.tsLoader

import typings.std.RegExp
import typings.tsLoader.interfacesMod.SolutionBuilderWithWatchHost
import typings.tsLoader.interfacesMod.TSInstance
import typings.tsLoader.interfacesMod.WatchHost
import typings.tsLoader.interfacesMod.WebpackError
import typings.tsLoader.loggerMod.Logger
import typings.typescript.mod.LanguageServiceHost
import typings.typescript.mod.ProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesHostMod {
  
  @JSImport("ts-loader/dist/servicesHost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSolutionErrors(instance: TSInstance, context: String): js.Array[WebpackError] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSolutionErrors")(instance.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[WebpackError]]
  
  inline def makeServicesHost(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance,
    enableFileCaching: Boolean
  ): ServiceHostWhichMayBeCacheable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeServicesHost")(scriptRegex.asInstanceOf[js.Any], log.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], enableFileCaching.asInstanceOf[js.Any])).asInstanceOf[ServiceHostWhichMayBeCacheable]
  inline def makeServicesHost(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance,
    enableFileCaching: Boolean,
    projectReferences: js.Array[ProjectReference]
  ): ServiceHostWhichMayBeCacheable = (^.asInstanceOf[js.Dynamic].applyDynamic("makeServicesHost")(scriptRegex.asInstanceOf[js.Any], log.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], enableFileCaching.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[ServiceHostWhichMayBeCacheable]
  
  inline def makeSolutionBuilderHost(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance
  ): SolutionBuilderWithWatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSolutionBuilderHost")(scriptRegex.asInstanceOf[js.Any], log.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost]
  
  inline def makeWatchHost(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance
  ): WatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("makeWatchHost")(scriptRegex.asInstanceOf[js.Any], log.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[WatchHost]
  inline def makeWatchHost(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance,
    projectReferences: js.Array[ProjectReference]
  ): WatchHost = (^.asInstanceOf[js.Dynamic].applyDynamic("makeWatchHost")(scriptRegex.asInstanceOf[js.Any], log.asInstanceOf[js.Any], loader.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[WatchHost]
  
  inline def updateFileWithText(instance: TSInstance, filePath: String, text: js.Function1[/* nFilePath */ String, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFileWithText")(instance.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Action = js.Function0[Unit]
  
  trait ServiceHostWhichMayBeCacheable extends StObject {
    
    var clearCache: Action | Null
    
    var servicesHost: LanguageServiceHost
  }
  object ServiceHostWhichMayBeCacheable {
    
    inline def apply(servicesHost: LanguageServiceHost): ServiceHostWhichMayBeCacheable = {
      val __obj = js.Dynamic.literal(servicesHost = servicesHost.asInstanceOf[js.Any], clearCache = null)
      __obj.asInstanceOf[ServiceHostWhichMayBeCacheable]
    }
    
    extension [Self <: ServiceHostWhichMayBeCacheable](x: Self) {
      
      inline def setClearCache(value: () => Unit): Self = StObject.set(x, "clearCache", js.Any.fromFunction0(value))
      
      inline def setClearCacheNull: Self = StObject.set(x, "clearCache", null)
      
      inline def setServicesHost(value: LanguageServiceHost): Self = StObject.set(x, "servicesHost", value.asInstanceOf[js.Any])
    }
  }
}
