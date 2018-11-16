package typings
package vsoDashNodeDashApiLib.projectanalysisapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProjectAnalysisApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def getGitRepositoriesActivityMetrics(
    project: java.lang.String,
    fromDate: stdLib.Date,
    aggregationType: vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.AggregationType,
    skip: scala.Double,
    top: scala.Double
  ): stdLib.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.RepositoryActivityMetrics
    ]
  ] = js.native
  def getProjectActivityMetrics(
    project: java.lang.String,
    fromDate: stdLib.Date,
    aggregationType: vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.AggregationType
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.ProjectActivityMetrics
  ] = js.native
  def getProjectLanguageAnalytics(project: java.lang.String): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.ProjectLanguageAnalytics
  ] = js.native
  def getRepositoryActivityMetrics(
    project: java.lang.String,
    repositoryId: java.lang.String,
    fromDate: stdLib.Date,
    aggregationType: vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.AggregationType
  ): stdLib.Promise[
    vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.RepositoryActivityMetrics
  ] = js.native
}

