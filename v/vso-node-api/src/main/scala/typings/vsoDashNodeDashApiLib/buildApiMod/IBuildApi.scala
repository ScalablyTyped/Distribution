package typings
package vsoDashNodeDashApiLib.buildApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBuildApi
  extends vsoDashNodeDashApiLib.clientApiBasesMod.ClientApiBase {
  def addBuildTag(project: java.lang.String, buildId: scala.Double, tag: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def addBuildTags(tags: js.Array[java.lang.String], project: java.lang.String, buildId: scala.Double): js.Promise[js.Array[java.lang.String]] = js.native
  def addDefinitionTag(project: java.lang.String, definitionId: scala.Double, tag: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def addDefinitionTags(tags: js.Array[java.lang.String], project: java.lang.String, definitionId: scala.Double): js.Promise[js.Array[java.lang.String]] = js.native
  def createArtifact(artifact: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildArtifact, buildId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildArtifact] = js.native
  def createArtifact(
    artifact: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildArtifact,
    buildId: scala.Double,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildArtifact] = js.native
  def createDefinition(definition: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def createDefinition(
    definition: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def createDefinition(
    definition: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition,
    project: java.lang.String,
    definitionToCloneId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def createDefinition(
    definition: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition,
    project: java.lang.String,
    definitionToCloneId: scala.Double,
    definitionToCloneRevision: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def createFolder(
    folder: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Folder,
    project: java.lang.String,
    path: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Folder] = js.native
  def deleteBuild(buildId: scala.Double): js.Promise[scala.Unit] = js.native
  def deleteBuild(buildId: scala.Double, project: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteBuildTag(project: java.lang.String, buildId: scala.Double, tag: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def deleteDefinition(definitionId: scala.Double): js.Promise[scala.Unit] = js.native
  def deleteDefinition(definitionId: scala.Double, project: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteDefinitionTag(project: java.lang.String, definitionId: scala.Double, tag: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def deleteFolder(project: java.lang.String, path: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteTemplate(project: java.lang.String, templateId: java.lang.String): js.Promise[scala.Unit] = js.native
  def getArtifact(buildId: scala.Double, artifactName: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildArtifact] = js.native
  def getArtifact(buildId: scala.Double, artifactName: java.lang.String, project: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildArtifact] = js.native
  def getArtifactContentZip(buildId: scala.Double, artifactName: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getArtifactContentZip(buildId: scala.Double, artifactName: java.lang.String, project: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getArtifacts(buildId: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildArtifact]] = js.native
  def getArtifacts(buildId: scala.Double, project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildArtifact]] = js.native
  def getBadge(project: java.lang.String, definitionId: scala.Double): js.Promise[java.lang.String] = js.native
  def getBadge(project: java.lang.String, definitionId: scala.Double, branchName: java.lang.String): js.Promise[java.lang.String] = js.native
  def getBuild(buildId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build] = js.native
  def getBuild(buildId: scala.Double, project: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build] = js.native
  def getBuild(buildId: scala.Double, project: java.lang.String, propertyFilters: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build] = js.native
  def getBuildBadge(project: java.lang.String, repoType: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildBadge] = js.native
  def getBuildBadge(project: java.lang.String, repoType: java.lang.String, repoId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildBadge] = js.native
  def getBuildBadge(
    project: java.lang.String,
    repoType: java.lang.String,
    repoId: java.lang.String,
    branchName: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildBadge] = js.native
  def getBuildBadgeData(project: java.lang.String, repoType: java.lang.String): js.Promise[java.lang.String] = js.native
  def getBuildBadgeData(project: java.lang.String, repoType: java.lang.String, repoId: java.lang.String): js.Promise[java.lang.String] = js.native
  def getBuildBadgeData(
    project: java.lang.String,
    repoType: java.lang.String,
    repoId: java.lang.String,
    branchName: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def getBuildChanges(project: java.lang.String, buildId: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Change]] = js.native
  def getBuildChanges(project: java.lang.String, buildId: scala.Double, continuationToken: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Change]] = js.native
  def getBuildChanges(
    project: java.lang.String,
    buildId: scala.Double,
    continuationToken: java.lang.String,
    top: scala.Double
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Change]] = js.native
  def getBuildChanges(
    project: java.lang.String,
    buildId: scala.Double,
    continuationToken: java.lang.String,
    top: scala.Double,
    includeSourceChange: scala.Boolean
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Change]] = js.native
  def getBuildController(controllerId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildController] = js.native
  def getBuildControllers(): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildController]] = js.native
  def getBuildControllers(name: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildController]] = js.native
  def getBuildLog(project: java.lang.String, buildId: scala.Double, logId: scala.Double): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBuildLog(project: java.lang.String, buildId: scala.Double, logId: scala.Double, startLine: scala.Double): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBuildLog(
    project: java.lang.String,
    buildId: scala.Double,
    logId: scala.Double,
    startLine: scala.Double,
    endLine: scala.Double
  ): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBuildLogLines(project: java.lang.String, buildId: scala.Double, logId: scala.Double): js.Promise[js.Array[java.lang.String]] = js.native
  def getBuildLogLines(project: java.lang.String, buildId: scala.Double, logId: scala.Double, startLine: scala.Double): js.Promise[js.Array[java.lang.String]] = js.native
  def getBuildLogLines(
    project: java.lang.String,
    buildId: scala.Double,
    logId: scala.Double,
    startLine: scala.Double,
    endLine: scala.Double
  ): js.Promise[js.Array[java.lang.String]] = js.native
  def getBuildLogs(project: java.lang.String, buildId: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildLog]] = js.native
  def getBuildLogsZip(project: java.lang.String, buildId: scala.Double): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBuildOptionDefinitions(): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildOptionDefinition]
  ] = js.native
  def getBuildOptionDefinitions(project: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildOptionDefinition]
  ] = js.native
  def getBuildProperties(project: java.lang.String, buildId: scala.Double): js.Promise[_] = js.native
  def getBuildProperties(project: java.lang.String, buildId: scala.Double, filter: js.Array[java.lang.String]): js.Promise[_] = js.native
  def getBuildReport(project: java.lang.String, buildId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReportMetadata] = js.native
  def getBuildReport(project: java.lang.String, buildId: scala.Double, `type`: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReportMetadata] = js.native
  def getBuildReportHtmlContent(project: java.lang.String, buildId: scala.Double): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBuildReportHtmlContent(project: java.lang.String, buildId: scala.Double, `type`: java.lang.String): js.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def getBuildSettings(): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildSettings] = js.native
  def getBuildTags(project: java.lang.String, buildId: scala.Double): js.Promise[js.Array[java.lang.String]] = js.native
  def getBuildTimeline(project: java.lang.String, buildId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Timeline] = js.native
  def getBuildTimeline(project: java.lang.String, buildId: scala.Double, timelineId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Timeline] = js.native
  def getBuildTimeline(
    project: java.lang.String,
    buildId: scala.Double,
    timelineId: java.lang.String,
    changeId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Timeline] = js.native
  def getBuildTimeline(
    project: java.lang.String,
    buildId: scala.Double,
    timelineId: java.lang.String,
    changeId: scala.Double,
    planId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Timeline] = js.native
  def getBuildWorkItemsRefs(project: java.lang.String, buildId: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ResourceRef]] = js.native
  def getBuildWorkItemsRefs(project: java.lang.String, buildId: scala.Double, top: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ResourceRef]] = js.native
  def getBuildWorkItemsRefsFromCommits(commitIds: js.Array[java.lang.String], project: java.lang.String, buildId: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ResourceRef]] = js.native
  def getBuildWorkItemsRefsFromCommits(
    commitIds: js.Array[java.lang.String],
    project: java.lang.String,
    buildId: scala.Double,
    top: scala.Double
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ResourceRef]] = js.native
  def getBuilds(
    project: js.UndefOr[java.lang.String],
    definitions: js.UndefOr[js.Array[scala.Double]],
    queues: js.UndefOr[js.Array[scala.Double]],
    buildNumber: js.UndefOr[java.lang.String],
    minTime: js.UndefOr[stdLib.Date],
    maxTime: js.UndefOr[stdLib.Date],
    requestedFor: js.UndefOr[java.lang.String],
    reasonFilter: js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildReason],
    statusFilter: js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildStatus],
    resultFilter: js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildResult],
    tagFilters: js.UndefOr[js.Array[java.lang.String]],
    properties: js.UndefOr[js.Array[java.lang.String]],
    top: js.UndefOr[scala.Double],
    continuationToken: js.UndefOr[java.lang.String],
    maxBuildsPerDefinition: js.UndefOr[scala.Double],
    deletedFilter: js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.QueryDeletedOption],
    queryOrder: js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildQueryOrder],
    branchName: js.UndefOr[java.lang.String],
    buildIds: js.UndefOr[js.Array[scala.Double]],
    repositoryId: js.UndefOr[java.lang.String],
    repositoryType: js.UndefOr[java.lang.String]
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build]] = js.native
  def getChangesBetweenBuilds(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Change]] = js.native
  def getChangesBetweenBuilds(project: java.lang.String, fromBuildId: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Change]] = js.native
  def getChangesBetweenBuilds(project: java.lang.String, fromBuildId: scala.Double, toBuildId: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Change]] = js.native
  def getChangesBetweenBuilds(project: java.lang.String, fromBuildId: scala.Double, toBuildId: scala.Double, top: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Change]] = js.native
  def getDefinition(definitionId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def getDefinition(definitionId: scala.Double, project: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def getDefinition(definitionId: scala.Double, project: java.lang.String, revision: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def getDefinition(
    definitionId: scala.Double,
    project: java.lang.String,
    revision: scala.Double,
    minMetricsTime: stdLib.Date
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def getDefinition(
    definitionId: scala.Double,
    project: java.lang.String,
    revision: scala.Double,
    minMetricsTime: stdLib.Date,
    propertyFilters: js.Array[java.lang.String]
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def getDefinition(
    definitionId: scala.Double,
    project: java.lang.String,
    revision: scala.Double,
    minMetricsTime: stdLib.Date,
    propertyFilters: js.Array[java.lang.String],
    includeLatestBuilds: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def getDefinitionMetrics(project: java.lang.String, definitionId: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildMetric]] = js.native
  def getDefinitionMetrics(project: java.lang.String, definitionId: scala.Double, minMetricsTime: stdLib.Date): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildMetric]] = js.native
  def getDefinitionProperties(project: java.lang.String, definitionId: scala.Double): js.Promise[_] = js.native
  def getDefinitionProperties(project: java.lang.String, definitionId: scala.Double, filter: js.Array[java.lang.String]): js.Promise[_] = js.native
  def getDefinitionRevisions(project: java.lang.String, definitionId: scala.Double): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinitionRevision]
  ] = js.native
  def getDefinitionTags(project: java.lang.String, definitionId: scala.Double): js.Promise[js.Array[java.lang.String]] = js.native
  def getDefinitionTags(project: java.lang.String, definitionId: scala.Double, revision: scala.Double): js.Promise[js.Array[java.lang.String]] = js.native
  def getDefinitions(
    project: js.UndefOr[java.lang.String],
    name: js.UndefOr[java.lang.String],
    repositoryId: js.UndefOr[java.lang.String],
    repositoryType: js.UndefOr[java.lang.String],
    queryOrder: js.UndefOr[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.DefinitionQueryOrder],
    top: js.UndefOr[scala.Double],
    continuationToken: js.UndefOr[java.lang.String],
    minMetricsTime: js.UndefOr[stdLib.Date],
    definitionIds: js.UndefOr[js.Array[scala.Double]],
    path: js.UndefOr[java.lang.String],
    builtAfter: js.UndefOr[stdLib.Date],
    notBuiltAfter: js.UndefOr[stdLib.Date],
    includeAllProperties: js.UndefOr[scala.Boolean],
    includeLatestBuilds: js.UndefOr[scala.Boolean],
    taskIdFilter: js.UndefOr[java.lang.String]
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinitionReference]
  ] = js.native
  def getFolders(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Folder]] = js.native
  def getFolders(project: java.lang.String, path: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Folder]] = js.native
  def getFolders(
    project: java.lang.String,
    path: java.lang.String,
    queryOrder: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.FolderQueryOrder
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Folder]] = js.native
  def getProjectMetrics(project: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildMetric]] = js.native
  def getProjectMetrics(project: java.lang.String, metricAggregationType: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildMetric]] = js.native
  def getProjectMetrics(project: java.lang.String, metricAggregationType: java.lang.String, minMetricsTime: stdLib.Date): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildMetric]] = js.native
  def getResourceUsage(): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildResourceUsage] = js.native
  def getTags(project: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def getTemplate(project: java.lang.String, templateId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinitionTemplate] = js.native
  def getTemplates(project: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinitionTemplate]
  ] = js.native
  def getWorkItemsBetweenBuilds(project: java.lang.String, fromBuildId: scala.Double, toBuildId: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ResourceRef]] = js.native
  def getWorkItemsBetweenBuilds(project: java.lang.String, fromBuildId: scala.Double, toBuildId: scala.Double, top: scala.Double): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.ResourceRef]] = js.native
  def listBranches(project: java.lang.String, providerName: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def listBranches(project: java.lang.String, providerName: java.lang.String, serviceEndpointId: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def listBranches(
    project: java.lang.String,
    providerName: java.lang.String,
    serviceEndpointId: java.lang.String,
    repository: java.lang.String
  ): js.Promise[js.Array[java.lang.String]] = js.native
  def listRepositories(project: java.lang.String, providerName: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.SourceRepository]] = js.native
  def listRepositories(project: java.lang.String, providerName: java.lang.String, serviceEndpointId: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.SourceRepository]] = js.native
  def listRepositories(
    project: java.lang.String,
    providerName: java.lang.String,
    serviceEndpointId: java.lang.String,
    repository: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.SourceRepository]] = js.native
  def listSourceProviders(project: java.lang.String): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.SourceProviderAttributes]
  ] = js.native
  def listWebhooks(project: java.lang.String, providerName: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.RepositoryWebhook]] = js.native
  def listWebhooks(project: java.lang.String, providerName: java.lang.String, serviceEndpointId: java.lang.String): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.RepositoryWebhook]] = js.native
  def listWebhooks(
    project: java.lang.String,
    providerName: java.lang.String,
    serviceEndpointId: java.lang.String,
    repository: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.RepositoryWebhook]] = js.native
  def queueBuild(build: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build] = js.native
  def queueBuild(build: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build, project: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build] = js.native
  def queueBuild(
    build: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build,
    project: java.lang.String,
    ignoreWarnings: scala.Boolean
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build] = js.native
  def queueBuild(
    build: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build,
    project: java.lang.String,
    ignoreWarnings: scala.Boolean,
    checkInTicket: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build] = js.native
  def saveTemplate(
    template: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinitionTemplate,
    project: java.lang.String,
    templateId: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinitionTemplate] = js.native
  def updateBuild(build: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build, buildId: scala.Double): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build] = js.native
  def updateBuild(
    build: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build,
    buildId: scala.Double,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build] = js.native
  def updateBuildProperties(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    project: java.lang.String,
    buildId: scala.Double
  ): js.Promise[_] = js.native
  def updateBuildSettings(settings: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildSettings): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildSettings] = js.native
  def updateBuilds(builds: js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build]): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build]] = js.native
  def updateBuilds(
    builds: js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build],
    project: java.lang.String
  ): js.Promise[js.Array[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Build]] = js.native
  def updateDefinition(
    definition: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition,
    definitionId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def updateDefinition(
    definition: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition,
    definitionId: scala.Double,
    project: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def updateDefinition(
    definition: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition,
    definitionId: scala.Double,
    project: java.lang.String,
    secretsSourceDefinitionId: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def updateDefinition(
    definition: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition,
    definitionId: scala.Double,
    project: java.lang.String,
    secretsSourceDefinitionId: scala.Double,
    secretsSourceDefinitionRevision: scala.Double
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.BuildDefinition] = js.native
  def updateDefinitionProperties(
    customHeaders: js.Any,
    document: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.JsonPatchDocument,
    project: java.lang.String,
    definitionId: scala.Double
  ): js.Promise[_] = js.native
  def updateFolder(
    folder: vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Folder,
    project: java.lang.String,
    path: java.lang.String
  ): js.Promise[vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.Folder] = js.native
}

