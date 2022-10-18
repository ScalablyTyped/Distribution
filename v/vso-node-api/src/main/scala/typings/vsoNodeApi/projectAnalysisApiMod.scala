package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.interfacesProjectAnalysisInterfacesMod.AggregationType
import typings.vsoNodeApi.interfacesProjectAnalysisInterfacesMod.ProjectActivityMetrics
import typings.vsoNodeApi.interfacesProjectAnalysisInterfacesMod.ProjectLanguageAnalytics
import typings.vsoNodeApi.interfacesProjectAnalysisInterfacesMod.RepositoryActivityMetrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectAnalysisApiMod {
  
  @JSImport("vso-node-api/ProjectAnalysisApi", "ProjectAnalysisApi")
  @js.native
  open class ProjectAnalysisApi protected () extends IProjectAnalysisApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait IProjectAnalysisApi extends ClientApiBase {
    
    def getGitRepositoriesActivityMetrics(project: String, fromDate: js.Date, aggregationType: AggregationType, skip: Double, top: Double): js.Promise[js.Array[RepositoryActivityMetrics]] = js.native
    
    def getProjectActivityMetrics(project: String, fromDate: js.Date, aggregationType: AggregationType): js.Promise[ProjectActivityMetrics] = js.native
    
    def getProjectLanguageAnalytics(project: String): js.Promise[ProjectLanguageAnalytics] = js.native
    
    def getRepositoryActivityMetrics(project: String, repositoryId: String, fromDate: js.Date, aggregationType: AggregationType): js.Promise[RepositoryActivityMetrics] = js.native
  }
}
