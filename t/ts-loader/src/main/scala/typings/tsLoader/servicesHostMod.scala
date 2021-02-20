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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesHostMod {
  
  @JSImport("ts-loader/dist/servicesHost", "getSolutionErrors")
  @js.native
  def getSolutionErrors(instance: TSInstance, context: String): js.Array[WebpackError] = js.native
  
  @JSImport("ts-loader/dist/servicesHost", "makeServicesHost")
  @js.native
  def makeServicesHost(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance,
    enableFileCaching: Boolean
  ): ServiceHostWhichMayBeCacheable = js.native
  @JSImport("ts-loader/dist/servicesHost", "makeServicesHost")
  @js.native
  def makeServicesHost(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance,
    enableFileCaching: Boolean,
    projectReferences: js.Array[ProjectReference]
  ): ServiceHostWhichMayBeCacheable = js.native
  
  @JSImport("ts-loader/dist/servicesHost", "makeSolutionBuilderHost")
  @js.native
  def makeSolutionBuilderHost(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance
  ): SolutionBuilderWithWatchHost = js.native
  
  @JSImport("ts-loader/dist/servicesHost", "makeWatchHost")
  @js.native
  def makeWatchHost(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance
  ): WatchHost = js.native
  @JSImport("ts-loader/dist/servicesHost", "makeWatchHost")
  @js.native
  def makeWatchHost(
    scriptRegex: RegExp,
    log: Logger,
    loader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.loader.LoaderContext */ js.Any,
    instance: TSInstance,
    projectReferences: js.Array[ProjectReference]
  ): WatchHost = js.native
  
  @JSImport("ts-loader/dist/servicesHost", "updateFileWithText")
  @js.native
  def updateFileWithText(instance: TSInstance, filePath: String, text: js.Function1[/* nFilePath */ String, String]): Unit = js.native
  
  type Action = js.Function0[Unit]
  
  @js.native
  trait ServiceHostWhichMayBeCacheable extends StObject {
    
    var clearCache: Action | Null = js.native
    
    var servicesHost: LanguageServiceHost = js.native
  }
  object ServiceHostWhichMayBeCacheable {
    
    @scala.inline
    def apply(servicesHost: LanguageServiceHost): ServiceHostWhichMayBeCacheable = {
      val __obj = js.Dynamic.literal(servicesHost = servicesHost.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceHostWhichMayBeCacheable]
    }
    
    @scala.inline
    implicit class ServiceHostWhichMayBeCacheableMutableBuilder[Self <: ServiceHostWhichMayBeCacheable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearCache(value: () => Unit): Self = StObject.set(x, "clearCache", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearCacheNull: Self = StObject.set(x, "clearCache", null)
      
      @scala.inline
      def setServicesHost(value: LanguageServiceHost): Self = StObject.set(x, "servicesHost", value.asInstanceOf[js.Any])
    }
  }
}
