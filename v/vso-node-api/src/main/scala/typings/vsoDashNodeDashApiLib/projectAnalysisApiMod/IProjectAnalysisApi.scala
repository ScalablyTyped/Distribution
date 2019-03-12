package typings
package vsoDashNodeDashApiLib.projectAnalysisApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjectAnalysisApi
  extends vsoDashNodeDashApiLib.clientApiBasesMod.ClientApiBase {
  def getGitRepositoriesActivityMetrics(
    project: java.lang.String,
    fromDate: stdLib.Date,
    aggregationType: vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.AggregationType,
    skip: scala.Double,
    top: scala.Double
  ): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.RepositoryActivityMetrics
    ]
  ] = js.native
  def getProjectActivityMetrics(
    project: java.lang.String,
    fromDate: stdLib.Date,
    aggregationType: vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.AggregationType
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.ProjectActivityMetrics
  ] = js.native
  def getProjectLanguageAnalytics(project: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.ProjectLanguageAnalytics
  ] = js.native
  def getRepositoryActivityMetrics(
    project: java.lang.String,
    repositoryId: java.lang.String,
    fromDate: stdLib.Date,
    aggregationType: vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.AggregationType
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.RepositoryActivityMetrics
  ] = js.native
}

