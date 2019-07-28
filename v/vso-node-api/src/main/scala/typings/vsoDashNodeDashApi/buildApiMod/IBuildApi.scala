package typings.vsoDashNodeDashApi.buildApiMod

import typings.node.NodeJSNs.ReadableStream
import typings.std.Date
import typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.Build
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildArtifact
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildBadge
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildController
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildDefinition
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildDefinitionReference
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildDefinitionRevision
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildDefinitionTemplate
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildLog
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildMetric
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildOptionDefinition
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildQueryOrder
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReason
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildReportMetadata
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildResourceUsage
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildResult
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildSettings
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.BuildStatus
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.Change
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.DefinitionQueryOrder
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.Folder
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.FolderQueryOrder
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.QueryDeletedOption
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.RepositoryWebhook
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.SourceProviderAttributes
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.SourceRepository
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.Timeline
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.JsonPatchDocument
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.ResourceRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBuildApi extends ClientApiBase {
  def addBuildTag(project: String, buildId: Double, tag: String): js.Promise[js.Array[String]] = js.native
  def addBuildTags(tags: js.Array[String], project: String, buildId: Double): js.Promise[js.Array[String]] = js.native
  def addDefinitionTag(project: String, definitionId: Double, tag: String): js.Promise[js.Array[String]] = js.native
  def addDefinitionTags(tags: js.Array[String], project: String, definitionId: Double): js.Promise[js.Array[String]] = js.native
  def createArtifact(artifact: BuildArtifact, buildId: Double): js.Promise[BuildArtifact] = js.native
  def createArtifact(artifact: BuildArtifact, buildId: Double, project: String): js.Promise[BuildArtifact] = js.native
  def createDefinition(definition: BuildDefinition): js.Promise[BuildDefinition] = js.native
  def createDefinition(definition: BuildDefinition, project: String): js.Promise[BuildDefinition] = js.native
  def createDefinition(definition: BuildDefinition, project: String, definitionToCloneId: Double): js.Promise[BuildDefinition] = js.native
  def createDefinition(
    definition: BuildDefinition,
    project: String,
    definitionToCloneId: Double,
    definitionToCloneRevision: Double
  ): js.Promise[BuildDefinition] = js.native
  def createFolder(folder: Folder, project: String, path: String): js.Promise[Folder] = js.native
  def deleteBuild(buildId: Double): js.Promise[Unit] = js.native
  def deleteBuild(buildId: Double, project: String): js.Promise[Unit] = js.native
  def deleteBuildTag(project: String, buildId: Double, tag: String): js.Promise[js.Array[String]] = js.native
  def deleteDefinition(definitionId: Double): js.Promise[Unit] = js.native
  def deleteDefinition(definitionId: Double, project: String): js.Promise[Unit] = js.native
  def deleteDefinitionTag(project: String, definitionId: Double, tag: String): js.Promise[js.Array[String]] = js.native
  def deleteFolder(project: String, path: String): js.Promise[Unit] = js.native
  def deleteTemplate(project: String, templateId: String): js.Promise[Unit] = js.native
  def getArtifact(buildId: Double, artifactName: String): js.Promise[BuildArtifact] = js.native
  def getArtifact(buildId: Double, artifactName: String, project: String): js.Promise[BuildArtifact] = js.native
  def getArtifactContentZip(buildId: Double, artifactName: String): js.Promise[ReadableStream] = js.native
  def getArtifactContentZip(buildId: Double, artifactName: String, project: String): js.Promise[ReadableStream] = js.native
  def getArtifacts(buildId: Double): js.Promise[js.Array[BuildArtifact]] = js.native
  def getArtifacts(buildId: Double, project: String): js.Promise[js.Array[BuildArtifact]] = js.native
  def getBadge(project: String, definitionId: Double): js.Promise[String] = js.native
  def getBadge(project: String, definitionId: Double, branchName: String): js.Promise[String] = js.native
  def getBuild(buildId: Double): js.Promise[Build] = js.native
  def getBuild(buildId: Double, project: String): js.Promise[Build] = js.native
  def getBuild(buildId: Double, project: String, propertyFilters: String): js.Promise[Build] = js.native
  def getBuildBadge(project: String, repoType: String): js.Promise[BuildBadge] = js.native
  def getBuildBadge(project: String, repoType: String, repoId: String): js.Promise[BuildBadge] = js.native
  def getBuildBadge(project: String, repoType: String, repoId: String, branchName: String): js.Promise[BuildBadge] = js.native
  def getBuildBadgeData(project: String, repoType: String): js.Promise[String] = js.native
  def getBuildBadgeData(project: String, repoType: String, repoId: String): js.Promise[String] = js.native
  def getBuildBadgeData(project: String, repoType: String, repoId: String, branchName: String): js.Promise[String] = js.native
  def getBuildChanges(project: String, buildId: Double): js.Promise[js.Array[Change]] = js.native
  def getBuildChanges(project: String, buildId: Double, continuationToken: String): js.Promise[js.Array[Change]] = js.native
  def getBuildChanges(project: String, buildId: Double, continuationToken: String, top: Double): js.Promise[js.Array[Change]] = js.native
  def getBuildChanges(
    project: String,
    buildId: Double,
    continuationToken: String,
    top: Double,
    includeSourceChange: Boolean
  ): js.Promise[js.Array[Change]] = js.native
  def getBuildController(controllerId: Double): js.Promise[BuildController] = js.native
  def getBuildControllers(): js.Promise[js.Array[BuildController]] = js.native
  def getBuildControllers(name: String): js.Promise[js.Array[BuildController]] = js.native
  def getBuildLog(project: String, buildId: Double, logId: Double): js.Promise[ReadableStream] = js.native
  def getBuildLog(project: String, buildId: Double, logId: Double, startLine: Double): js.Promise[ReadableStream] = js.native
  def getBuildLog(project: String, buildId: Double, logId: Double, startLine: Double, endLine: Double): js.Promise[ReadableStream] = js.native
  def getBuildLogLines(project: String, buildId: Double, logId: Double): js.Promise[js.Array[String]] = js.native
  def getBuildLogLines(project: String, buildId: Double, logId: Double, startLine: Double): js.Promise[js.Array[String]] = js.native
  def getBuildLogLines(project: String, buildId: Double, logId: Double, startLine: Double, endLine: Double): js.Promise[js.Array[String]] = js.native
  def getBuildLogs(project: String, buildId: Double): js.Promise[js.Array[BuildLog]] = js.native
  def getBuildLogsZip(project: String, buildId: Double): js.Promise[ReadableStream] = js.native
  def getBuildOptionDefinitions(): js.Promise[js.Array[BuildOptionDefinition]] = js.native
  def getBuildOptionDefinitions(project: String): js.Promise[js.Array[BuildOptionDefinition]] = js.native
  def getBuildProperties(project: String, buildId: Double): js.Promise[_] = js.native
  def getBuildProperties(project: String, buildId: Double, filter: js.Array[String]): js.Promise[_] = js.native
  def getBuildReport(project: String, buildId: Double): js.Promise[BuildReportMetadata] = js.native
  def getBuildReport(project: String, buildId: Double, `type`: String): js.Promise[BuildReportMetadata] = js.native
  def getBuildReportHtmlContent(project: String, buildId: Double): js.Promise[ReadableStream] = js.native
  def getBuildReportHtmlContent(project: String, buildId: Double, `type`: String): js.Promise[ReadableStream] = js.native
  def getBuildSettings(): js.Promise[BuildSettings] = js.native
  def getBuildTags(project: String, buildId: Double): js.Promise[js.Array[String]] = js.native
  def getBuildTimeline(project: String, buildId: Double): js.Promise[Timeline] = js.native
  def getBuildTimeline(project: String, buildId: Double, timelineId: String): js.Promise[Timeline] = js.native
  def getBuildTimeline(project: String, buildId: Double, timelineId: String, changeId: Double): js.Promise[Timeline] = js.native
  def getBuildTimeline(project: String, buildId: Double, timelineId: String, changeId: Double, planId: String): js.Promise[Timeline] = js.native
  def getBuildWorkItemsRefs(project: String, buildId: Double): js.Promise[js.Array[ResourceRef]] = js.native
  def getBuildWorkItemsRefs(project: String, buildId: Double, top: Double): js.Promise[js.Array[ResourceRef]] = js.native
  def getBuildWorkItemsRefsFromCommits(commitIds: js.Array[String], project: String, buildId: Double): js.Promise[js.Array[ResourceRef]] = js.native
  def getBuildWorkItemsRefsFromCommits(commitIds: js.Array[String], project: String, buildId: Double, top: Double): js.Promise[js.Array[ResourceRef]] = js.native
  def getBuilds(
    project: js.UndefOr[String],
    definitions: js.UndefOr[js.Array[Double]],
    queues: js.UndefOr[js.Array[Double]],
    buildNumber: js.UndefOr[String],
    minTime: js.UndefOr[Date],
    maxTime: js.UndefOr[Date],
    requestedFor: js.UndefOr[String],
    reasonFilter: js.UndefOr[BuildReason],
    statusFilter: js.UndefOr[BuildStatus],
    resultFilter: js.UndefOr[BuildResult],
    tagFilters: js.UndefOr[js.Array[String]],
    properties: js.UndefOr[js.Array[String]],
    top: js.UndefOr[Double],
    continuationToken: js.UndefOr[String],
    maxBuildsPerDefinition: js.UndefOr[Double],
    deletedFilter: js.UndefOr[QueryDeletedOption],
    queryOrder: js.UndefOr[BuildQueryOrder],
    branchName: js.UndefOr[String],
    buildIds: js.UndefOr[js.Array[Double]],
    repositoryId: js.UndefOr[String],
    repositoryType: js.UndefOr[String]
  ): js.Promise[js.Array[Build]] = js.native
  def getChangesBetweenBuilds(project: String): js.Promise[js.Array[Change]] = js.native
  def getChangesBetweenBuilds(project: String, fromBuildId: Double): js.Promise[js.Array[Change]] = js.native
  def getChangesBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Double): js.Promise[js.Array[Change]] = js.native
  def getChangesBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Double, top: Double): js.Promise[js.Array[Change]] = js.native
  def getDefinition(definitionId: Double): js.Promise[BuildDefinition] = js.native
  def getDefinition(definitionId: Double, project: String): js.Promise[BuildDefinition] = js.native
  def getDefinition(definitionId: Double, project: String, revision: Double): js.Promise[BuildDefinition] = js.native
  def getDefinition(definitionId: Double, project: String, revision: Double, minMetricsTime: Date): js.Promise[BuildDefinition] = js.native
  def getDefinition(
    definitionId: Double,
    project: String,
    revision: Double,
    minMetricsTime: Date,
    propertyFilters: js.Array[String]
  ): js.Promise[BuildDefinition] = js.native
  def getDefinition(
    definitionId: Double,
    project: String,
    revision: Double,
    minMetricsTime: Date,
    propertyFilters: js.Array[String],
    includeLatestBuilds: Boolean
  ): js.Promise[BuildDefinition] = js.native
  def getDefinitionMetrics(project: String, definitionId: Double): js.Promise[js.Array[BuildMetric]] = js.native
  def getDefinitionMetrics(project: String, definitionId: Double, minMetricsTime: Date): js.Promise[js.Array[BuildMetric]] = js.native
  def getDefinitionProperties(project: String, definitionId: Double): js.Promise[_] = js.native
  def getDefinitionProperties(project: String, definitionId: Double, filter: js.Array[String]): js.Promise[_] = js.native
  def getDefinitionRevisions(project: String, definitionId: Double): js.Promise[js.Array[BuildDefinitionRevision]] = js.native
  def getDefinitionTags(project: String, definitionId: Double): js.Promise[js.Array[String]] = js.native
  def getDefinitionTags(project: String, definitionId: Double, revision: Double): js.Promise[js.Array[String]] = js.native
  def getDefinitions(
    project: js.UndefOr[String],
    name: js.UndefOr[String],
    repositoryId: js.UndefOr[String],
    repositoryType: js.UndefOr[String],
    queryOrder: js.UndefOr[DefinitionQueryOrder],
    top: js.UndefOr[Double],
    continuationToken: js.UndefOr[String],
    minMetricsTime: js.UndefOr[Date],
    definitionIds: js.UndefOr[js.Array[Double]],
    path: js.UndefOr[String],
    builtAfter: js.UndefOr[Date],
    notBuiltAfter: js.UndefOr[Date],
    includeAllProperties: js.UndefOr[Boolean],
    includeLatestBuilds: js.UndefOr[Boolean],
    taskIdFilter: js.UndefOr[String]
  ): js.Promise[js.Array[BuildDefinitionReference]] = js.native
  def getFolders(project: String): js.Promise[js.Array[Folder]] = js.native
  def getFolders(project: String, path: String): js.Promise[js.Array[Folder]] = js.native
  def getFolders(project: String, path: String, queryOrder: FolderQueryOrder): js.Promise[js.Array[Folder]] = js.native
  def getProjectMetrics(project: String): js.Promise[js.Array[BuildMetric]] = js.native
  def getProjectMetrics(project: String, metricAggregationType: String): js.Promise[js.Array[BuildMetric]] = js.native
  def getProjectMetrics(project: String, metricAggregationType: String, minMetricsTime: Date): js.Promise[js.Array[BuildMetric]] = js.native
  def getResourceUsage(): js.Promise[BuildResourceUsage] = js.native
  def getTags(project: String): js.Promise[js.Array[String]] = js.native
  def getTemplate(project: String, templateId: String): js.Promise[BuildDefinitionTemplate] = js.native
  def getTemplates(project: String): js.Promise[js.Array[BuildDefinitionTemplate]] = js.native
  def getWorkItemsBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Double): js.Promise[js.Array[ResourceRef]] = js.native
  def getWorkItemsBetweenBuilds(project: String, fromBuildId: Double, toBuildId: Double, top: Double): js.Promise[js.Array[ResourceRef]] = js.native
  def listBranches(project: String, providerName: String): js.Promise[js.Array[String]] = js.native
  def listBranches(project: String, providerName: String, serviceEndpointId: String): js.Promise[js.Array[String]] = js.native
  def listBranches(project: String, providerName: String, serviceEndpointId: String, repository: String): js.Promise[js.Array[String]] = js.native
  def listRepositories(project: String, providerName: String): js.Promise[js.Array[SourceRepository]] = js.native
  def listRepositories(project: String, providerName: String, serviceEndpointId: String): js.Promise[js.Array[SourceRepository]] = js.native
  def listRepositories(project: String, providerName: String, serviceEndpointId: String, repository: String): js.Promise[js.Array[SourceRepository]] = js.native
  def listSourceProviders(project: String): js.Promise[js.Array[SourceProviderAttributes]] = js.native
  def listWebhooks(project: String, providerName: String): js.Promise[js.Array[RepositoryWebhook]] = js.native
  def listWebhooks(project: String, providerName: String, serviceEndpointId: String): js.Promise[js.Array[RepositoryWebhook]] = js.native
  def listWebhooks(project: String, providerName: String, serviceEndpointId: String, repository: String): js.Promise[js.Array[RepositoryWebhook]] = js.native
  def queueBuild(build: Build): js.Promise[Build] = js.native
  def queueBuild(build: Build, project: String): js.Promise[Build] = js.native
  def queueBuild(build: Build, project: String, ignoreWarnings: Boolean): js.Promise[Build] = js.native
  def queueBuild(build: Build, project: String, ignoreWarnings: Boolean, checkInTicket: String): js.Promise[Build] = js.native
  def saveTemplate(template: BuildDefinitionTemplate, project: String, templateId: String): js.Promise[BuildDefinitionTemplate] = js.native
  def updateBuild(build: Build, buildId: Double): js.Promise[Build] = js.native
  def updateBuild(build: Build, buildId: Double, project: String): js.Promise[Build] = js.native
  def updateBuildProperties(customHeaders: js.Any, document: JsonPatchDocument, project: String, buildId: Double): js.Promise[_] = js.native
  def updateBuildSettings(settings: BuildSettings): js.Promise[BuildSettings] = js.native
  def updateBuilds(builds: js.Array[Build]): js.Promise[js.Array[Build]] = js.native
  def updateBuilds(builds: js.Array[Build], project: String): js.Promise[js.Array[Build]] = js.native
  def updateDefinition(definition: BuildDefinition, definitionId: Double): js.Promise[BuildDefinition] = js.native
  def updateDefinition(definition: BuildDefinition, definitionId: Double, project: String): js.Promise[BuildDefinition] = js.native
  def updateDefinition(
    definition: BuildDefinition,
    definitionId: Double,
    project: String,
    secretsSourceDefinitionId: Double
  ): js.Promise[BuildDefinition] = js.native
  def updateDefinition(
    definition: BuildDefinition,
    definitionId: Double,
    project: String,
    secretsSourceDefinitionId: Double,
    secretsSourceDefinitionRevision: Double
  ): js.Promise[BuildDefinition] = js.native
  def updateDefinitionProperties(customHeaders: js.Any, document: JsonPatchDocument, project: String, definitionId: Double): js.Promise[_] = js.native
  def updateFolder(folder: Folder, project: String, path: String): js.Promise[Folder] = js.native
}

