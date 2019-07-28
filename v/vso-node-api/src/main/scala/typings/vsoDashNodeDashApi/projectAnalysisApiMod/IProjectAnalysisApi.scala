package typings.vsoDashNodeDashApi.projectAnalysisApiMod

import typings.std.Date
import typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.AggregationType
import typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.ProjectActivityMetrics
import typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.ProjectLanguageAnalytics
import typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.RepositoryActivityMetrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjectAnalysisApi extends ClientApiBase {
  def getGitRepositoriesActivityMetrics(project: String, fromDate: Date, aggregationType: AggregationType, skip: Double, top: Double): js.Promise[js.Array[RepositoryActivityMetrics]] = js.native
  def getProjectActivityMetrics(project: String, fromDate: Date, aggregationType: AggregationType): js.Promise[ProjectActivityMetrics] = js.native
  def getProjectLanguageAnalytics(project: String): js.Promise[ProjectLanguageAnalytics] = js.native
  def getRepositoryActivityMetrics(project: String, repositoryId: String, fromDate: Date, aggregationType: AggregationType): js.Promise[RepositoryActivityMetrics] = js.native
}

