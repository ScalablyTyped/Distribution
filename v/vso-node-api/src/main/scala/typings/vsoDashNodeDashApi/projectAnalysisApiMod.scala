package typings.vsoDashNodeDashApi

import typings.std.Date
import typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.AggregationType
import typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.ProjectActivityMetrics
import typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.ProjectLanguageAnalytics
import typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.RepositoryActivityMetrics
import typings.vsoDashNodeDashApi.projectAnalysisApiMod.IProjectAnalysisApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/ProjectAnalysisApi", JSImport.Namespace)
@js.native
object projectAnalysisApiMod extends js.Object {
  @js.native
  trait IProjectAnalysisApi extends ClientApiBase {
    def getGitRepositoriesActivityMetrics(project: String, fromDate: Date, aggregationType: AggregationType, skip: Double, top: Double): js.Promise[js.Array[RepositoryActivityMetrics]] = js.native
    def getProjectActivityMetrics(project: String, fromDate: Date, aggregationType: AggregationType): js.Promise[ProjectActivityMetrics] = js.native
    def getProjectLanguageAnalytics(project: String): js.Promise[ProjectLanguageAnalytics] = js.native
    def getRepositoryActivityMetrics(project: String, repositoryId: String, fromDate: Date, aggregationType: AggregationType): js.Promise[RepositoryActivityMetrics] = js.native
  }
  
  @js.native
  class ProjectAnalysisApi protected () extends IProjectAnalysisApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
}

